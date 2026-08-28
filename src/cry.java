import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cry(int c, float d, boolean e) implements cyv {
   public static final Codec<cry> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.l.fieldOf("nutrition").forGetter(cry::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(cry::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cry::c)
            )
            .apply($$0, cry::new)
   );
   public static final yn<wa, cry> b = yn.a(yl.h, cry::a, yl.l, cry::b, yl.b, cry::c, cry::new);

   @Override
   public void a(dgh $$0, bvg $$1, cwo $$2, cyu $$3) {
      azh $$4 = $$1.dY();
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$3.e().a(), awb.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cow $$5) {
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

      public cry.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cry.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cry.a a() {
         this.c = true;
         return this;
      }

      public cry b() {
         float $$0 = crw.a(this.a, this.b);
         return new cry(this.a, $$0, this.c);
      }
   }
}
