import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csa(int c, float d, boolean e) implements cyx {
   public static final Codec<csa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.l.fieldOf("nutrition").forGetter(csa::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(csa::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(csa::c)
            )
            .apply($$0, csa::new)
   );
   public static final yn<wa, csa> b = yn.a(yl.h, csa::a, yl.l, csa::b, yl.b, csa::c, csa::new);

   @Override
   public void a(dgj $$0, bvi $$1, cwq $$2, cyw $$3) {
      azh $$4 = $$1.dY();
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$3.e().a(), awb.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof coy $$5) {
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

      public csa.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public csa.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public csa.a a() {
         this.c = true;
         return this;
      }

      public csa b() {
         float $$0 = cry.a(this.a, this.b);
         return new csa(this.a, $$0, this.c);
      }
   }
}
