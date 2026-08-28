import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crz(int c, float d, boolean e) implements cyw {
   public static final Codec<crz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.l.fieldOf("nutrition").forGetter(crz::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(crz::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(crz::c)
            )
            .apply($$0, crz::new)
   );
   public static final yn<wa, crz> b = yn.a(yl.h, crz::a, yl.l, crz::b, yl.b, crz::c, crz::new);

   @Override
   public void a(dgi $$0, bvh $$1, cwp $$2, cyv $$3) {
      azh $$4 = $$1.dY();
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$3.e().a(), awb.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cox $$5) {
         $$5.gt().a(this);
         $$0.a(null, $$5.dA(), $$5.dC(), $$5.dG(), awa.uJ, awb.h, 0.5F, ayz.b($$4, 0.9F, 1.0F));
      }
   }

   public int a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;

      public crz.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public crz.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public crz.a a() {
         this.c = true;
         return this;
      }

      public crz b() {
         float $$0 = crx.a(this.a, this.b);
         return new crz(this.a, $$0, this.c);
      }
   }
}
