import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class aw extends dr<aw.a> {
   @Override
   public Codec<aw.a> a() {
      return aw.a.a;
   }

   public void a(arg $$0, cff $$1, cff $$2, @Nullable bso $$3) {
      eqi $$4 = bu.b($$0, $$1);
      eqi $$5 = bu.b($$0, $$2);
      eqi $$6 = $$3 != null ? bu.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static record a(Optional<bf> b, Optional<bf> c, Optional<bf> d, Optional<bf> e) implements dr.a {
      public static final Codec<aw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(aw.a::a),
                  bu.b.optionalFieldOf("parent").forGetter(aw.a::c),
                  bu.b.optionalFieldOf("partner").forGetter(aw.a::d),
                  bu.b.optionalFieldOf("child").forGetter(aw.a::e)
               )
               .apply($$0, aw.a::new)
      );

      public static an<aw.a> b() {
         return am.p.a(new aw.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<aw.a> a(bu.a $$0) {
         return am.p.a(new aw.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(bu.a($$0))));
      }

      public static an<aw.a> a(Optional<bu> $$0, Optional<bu> $$1, Optional<bu> $$2) {
         return am.p.a(new aw.a(Optional.empty(), bu.a($$0), bu.a($$1), bu.a($$2)));
      }

      public boolean a(eqi $$0, eqi $$1, @Nullable eqi $$2) {
         return !this.e.isPresent() || $$2 != null && this.e.get().a($$2) ? a(this.c, $$0) && a(this.d, $$1) || a(this.c, $$1) && a(this.d, $$0) : false;
      }

      private static boolean a(Optional<bf> $$0, eqi $$1) {
         return $$0.isEmpty() || $$0.get().a($$1);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         $$0.a(this.c, ".parent");
         $$0.a(this.d, ".partner");
         $$0.a(this.e, ".child");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
