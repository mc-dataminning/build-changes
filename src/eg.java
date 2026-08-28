import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eg extends dw<eg.a> {
   @Override
   public Codec<eg.a> a() {
      return eg.a.a;
   }

   public void a(ark $$0, btr $$1, eyw $$2, int $$3) {
      etl $$4 = bv.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bg> b, dh.d c, Optional<bg> d) implements dw.a {
      public static final Codec<eg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(eg.a::a),
                  dh.d.d.optionalFieldOf("signal_strength", dh.d.c).forGetter(eg.a::b),
                  bv.b.optionalFieldOf("projectile").forGetter(eg.a::c)
               )
               .apply($$0, eg.a::new)
      );

      public static ao<eg.a> a(dh.d $$0, Optional<bg> $$1) {
         return an.M.a(new eg.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(etl $$0, eyw $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dw.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public dh.d b() {
         return this.c;
      }

      public Optional<bg> c() {
         return this.d;
      }
   }
}
