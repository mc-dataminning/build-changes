import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dg extends cx<dg.a> {
   @Override
   public Codec<dg.a> a() {
      return dg.a.a;
   }

   public void a(apv $$0, bqa $$1, esj $$2, int $$3) {
      enk $$4 = br.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bc> b, cm.d c, Optional<bc> d) implements cx.a {
      public static final Codec<dg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awu.a(br.b, "player").forGetter(dg.a::a),
                  awu.a(cm.d.d, "signal_strength", cm.d.c).forGetter(dg.a::b),
                  awu.a(br.b, "projectile").forGetter(dg.a::c)
               )
               .apply($$0, dg.a::new)
      );

      public static an<dg.a> a(cm.d $$0, Optional<bc> $$1) {
         return am.M.a(new dg.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(enk $$0, esj $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public cm.d b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }
   }
}
