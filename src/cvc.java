import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cvc(int c, float d, boolean e) implements dbt {
   public static final Codec<cvc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.l.fieldOf("nutrition").forGetter(cvc::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(cvc::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cvc::c)
            )
            .apply($$0, cvc::new)
   );
   public static final yw<wj, cvc> b = yw.a(yu.h, cvc::a, yu.l, cvc::b, yu.b, cvc::c, cvc::new);

   @Override
   public void a(djm $$0, bxj $$1, czn $$2, dbs $$3) {
      azv $$4 = $$1.dX();
      $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), $$3.e().a(), awo.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof crm $$5) {
         $$5.gt().a(this);
         $$0.a(null, $$5.dz(), $$5.dB(), $$5.dF(), awn.uX, awo.h, 0.5F, azm.b($$4, 0.9F, 1.0F));
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

      public cvc.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cvc.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cvc.a a() {
         this.c = true;
         return this;
      }

      public cvc b() {
         float $$0 = cva.a(this.a, this.b);
         return new cvc(this.a, $$0, this.c);
      }
   }
}
