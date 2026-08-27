import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class df extends cx<df.a> {
   @Override
   public Codec<df.a> a() {
      return df.a.a;
   }

   public void a(aox $$0, bnq $$1, enz $$2, int $$3) {
      ejc $$4 = br.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bc> b, cm.d c, Optional<bc> d) implements cx.a {
      public static final Codec<df.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avq.a(br.b, "player").forGetter(df.a::a),
                  avq.a(cm.d.d, "signal_strength", cm.d.c).forGetter(df.a::b),
                  avq.a(br.b, "projectile").forGetter(df.a::c)
               )
               .apply($$0, df.a::new)
      );

      public static an<df.a> a(cm.d $$0, Optional<bc> $$1) {
         return am.M.a(new df.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(ejc $$0, enz $$1, int $$2) {
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
