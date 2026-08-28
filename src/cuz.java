import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuz(int c, float d, boolean e) implements dbq {
   public static final Codec<cuz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.l.fieldOf("nutrition").forGetter(cuz::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(cuz::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cuz::c)
            )
            .apply($$0, cuz::new)
   );
   public static final yw<wj, cuz> b = yw.a(yu.h, cuz::a, yu.l, cuz::b, yu.b, cuz::c, cuz::new);

   @Override
   public void a(djh $$0, bxj $$1, czk $$2, dbp $$3) {
      azv $$4 = $$1.dX();
      $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), $$3.e().a(), awo.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof crj $$5) {
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

      public cuz.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cuz.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cuz.a a() {
         this.c = true;
         return this;
      }

      public cuz b() {
         float $$0 = cux.a(this.a, this.b);
         return new cuz(this.a, $$0, this.c);
      }
   }
}
