import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dv extends dk<dv.a> {
   @Override
   public Codec<dv.a> a() {
      return dv.a.a;
   }

   public void a(art $$0, bwt $$1, ffq $$2, int $$3) {
      fah $$4 = by.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bj> b, cw.d c, Optional<bj> d) implements dk.a {
      public static final Codec<dv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(dv.a::a),
                  cw.d.d.optionalFieldOf("signal_strength", cw.d.c).forGetter(dv.a::b),
                  by.b.optionalFieldOf("projectile").forGetter(dv.a::c)
               )
               .apply($$0, dv.a::new)
      );

      public static ar<dv.a> a(cw.d $$0, Optional<bj> $$1) {
         return aq.M.a(new dv.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(fah $$0, ffq $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public cw.d b() {
         return this.c;
      }

      public Optional<bj> c() {
         return this.d;
      }
   }
}
