import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dp extends dd<dp.a> {
   @Override
   public Codec<dp.a> a() {
      return dp.a.a;
   }

   public void a(aqf $$0, cjt $$1, csd $$2) {
      eoa $$3 = br.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<cg> d) implements dd.a {
      public static final Codec<dp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(dp.a::a), axe.a(br.b, "villager").forGetter(dp.a::c), axe.a(cg.a, "item").forGetter(dp.a::d))
               .apply($$0, dp.a::new)
      );

      public static an<dp.a> b() {
         return am.t.a(new dp.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<dp.a> a(br.a $$0) {
         return am.t.a(new dp.a(Optional.of(br.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(eoa $$0, csd $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         dd.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
