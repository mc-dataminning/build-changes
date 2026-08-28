import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ef extends dv<ef.a> {
   @Override
   public Codec<ef.a> a() {
      return ef.a.a;
   }

   public void a(aqv $$0, bsr $$1, exc $$2, int $$3) {
      err $$4 = bv.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bg> b, dh.d c, Optional<bg> d) implements dv.a {
      public static final Codec<ef.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(ef.a::a),
                  dh.d.d.optionalFieldOf("signal_strength", dh.d.c).forGetter(ef.a::b),
                  bv.b.optionalFieldOf("projectile").forGetter(ef.a::c)
               )
               .apply($$0, ef.a::new)
      );

      public static ao<ef.a> a(dh.d $$0, Optional<bg> $$1) {
         return an.M.a(new ef.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(err $$0, exc $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
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
