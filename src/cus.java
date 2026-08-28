import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cus(int c, float d, boolean e) implements dbj {
   public static final Codec<cus> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.l.fieldOf("nutrition").forGetter(cus::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(cus::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cus::c)
            )
            .apply($$0, cus::new)
   );
   public static final yw<wj, cus> b = yw.a(yu.h, cus::a, yu.l, cus::b, yu.b, cus::c, cus::new);

   @Override
   public void a(dja $$0, bxe $$1, czd $$2, dbi $$3) {
      azv $$4 = $$1.dY();
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$3.e().a(), awo.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof crc $$5) {
         $$5.gu().a(this);
         $$0.a(null, $$5.dA(), $$5.dC(), $$5.dG(), awn.uX, awo.h, 0.5F, azm.b($$4, 0.9F, 1.0F));
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

      public cus.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cus.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cus.a a() {
         this.c = true;
         return this;
      }

      public cus b() {
         float $$0 = cuq.a(this.a, this.b);
         return new cus(this.a, $$0, this.c);
      }
   }
}
