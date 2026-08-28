import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dj extends ds<dj.a> {
   @Override
   public Codec<dj.a> a() {
      return dj.a.a;
   }

   public void a(aqn $$0, bsg $$1, bqz $$2, float $$3, float $$4, boolean $$5) {
      equ $$6 = bu.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bf> b, Optional<bi> c, Optional<bf> d) implements ds.a {
      public static final Codec<dj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(dj.a::a),
                  bi.a.optionalFieldOf("damage").forGetter(dj.a::c),
                  bu.b.optionalFieldOf("entity").forGetter(dj.a::d)
               )
               .apply($$0, dj.a::new)
      );

      public static an<dj.a> b() {
         return am.h.a(new dj.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<dj.a> a(Optional<bi> $$0) {
         return am.h.a(new dj.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static an<dj.a> a(bi.a $$0) {
         return am.h.a(new dj.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static an<dj.a> b(Optional<bu> $$0) {
         return am.h.a(new dj.a(Optional.empty(), Optional.empty(), bu.a($$0)));
      }

      public static an<dj.a> a(Optional<bi> $$0, Optional<bu> $$1) {
         return am.h.a(new dj.a(Optional.empty(), $$0, bu.a($$1)));
      }

      public static an<dj.a> a(bi.a $$0, Optional<bu> $$1) {
         return am.h.a(new dj.a(Optional.empty(), Optional.of($$0.b()), bu.a($$1)));
      }

      public boolean a(aqn $$0, equ $$1, bqz $$2, float $$3, float $$4, boolean $$5) {
         return this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bg $$0) {
         ds.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
