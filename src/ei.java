import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ei extends dy<ei.a> {
   @Override
   public Codec<ei.a> a() {
      return ei.a.a;
   }

   public void a(asi $$0, bvj $$1, fbx $$2, int $$3) {
      ewo $$4 = bw.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bh> b, dj.d c, Optional<bh> d) implements dy.a {
      public static final Codec<ei.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(ei.a::a),
                  dj.d.d.optionalFieldOf("signal_strength", dj.d.c).forGetter(ei.a::b),
                  bw.b.optionalFieldOf("projectile").forGetter(ei.a::c)
               )
               .apply($$0, ei.a::new)
      );

      public static ap<ei.a> a(dj.d $$0, Optional<bh> $$1) {
         return ao.M.a(new ei.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(ewo $$0, fbx $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public dj.d b() {
         return this.c;
      }

      public Optional<bh> c() {
         return this.d;
      }
   }
}
