import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class az extends dz<az.a> {
   @Override
   public Codec<az.a> a() {
      return az.a.a;
   }

   public void a(are $$0, cgz $$1, cgz $$2, @Nullable bud $$3) {
      evs $$4 = bx.b($$0, $$1);
      evs $$5 = bx.b($$0, $$2);
      evs $$6 = $$3 != null ? bx.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static record a(Optional<bi> b, Optional<bi> c, Optional<bi> d, Optional<bi> e) implements dz.a {
      public static final Codec<az.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(az.a::a),
                  bx.b.optionalFieldOf("parent").forGetter(az.a::c),
                  bx.b.optionalFieldOf("partner").forGetter(az.a::d),
                  bx.b.optionalFieldOf("child").forGetter(az.a::e)
               )
               .apply($$0, az.a::new)
      );

      public static aq<az.a> b() {
         return ap.p.a(new az.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static aq<az.a> a(bx.a $$0) {
         return ap.p.a(new az.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(bx.a($$0))));
      }

      public static aq<az.a> a(Optional<bx> $$0, Optional<bx> $$1, Optional<bx> $$2) {
         return ap.p.a(new az.a(Optional.empty(), bx.a($$0), bx.a($$1), bx.a($$2)));
      }

      public boolean a(evs $$0, evs $$1, @Nullable evs $$2) {
         return !this.e.isPresent() || $$2 != null && this.e.get().a($$2) ? a(this.c, $$0) && a(this.d, $$1) || a(this.c, $$1) && a(this.d, $$0) : false;
      }

      private static boolean a(Optional<bi> $$0, evs $$1) {
         return $$0.isEmpty() || $$0.get().a($$1);
      }

      @Override
      public void a(bj $$0) {
         dz.a.super.a($$0);
         $$0.a(this.c, ".parent");
         $$0.a(this.d, ".partner");
         $$0.a(this.e, ".child");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
