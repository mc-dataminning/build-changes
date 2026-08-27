import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dn extends dd<dn.a> {
   @Override
   public Codec<dn.a> a() {
      return dn.a.a;
   }

   public void a(aqf $$0, bql $$1, etf $$2, int $$3) {
      eoa $$4 = br.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bc> b, cs.d c, Optional<bc> d) implements dd.a {
      public static final Codec<dn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.a(br.b, "player").forGetter(dn.a::a),
                  axe.a(cs.d.d, "signal_strength", cs.d.c).forGetter(dn.a::b),
                  axe.a(br.b, "projectile").forGetter(dn.a::c)
               )
               .apply($$0, dn.a::new)
      );

      public static an<dn.a> a(cs.d $$0, Optional<bc> $$1) {
         return am.M.a(new dn.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(eoa $$0, etf $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         dd.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public cs.d b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }
   }
}
