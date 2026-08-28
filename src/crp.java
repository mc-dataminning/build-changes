import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crp(int c, float d, boolean e) implements cym {
   public static final Codec<crp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.l.fieldOf("nutrition").forGetter(crp::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(crp::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(crp::c)
            )
            .apply($$0, crp::new)
   );
   public static final zj<ww, crp> b = zj.a(zh.h, crp::a, zh.j, crp::b, zh.b, crp::c, crp::new);

   @Override
   public void a(dff $$0, bve $$1, cwf $$2, cyl $$3) {
      azv $$4 = $$1.eb();
      $$0.a(null, $$1.dD(), $$1.dF(), $$1.dJ(), $$3.e().a(), awp.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cor $$5) {
         $$5.gw().a(this);
         $$0.a(null, $$5.dD(), $$5.dF(), $$5.dJ(), awo.ui, awp.h, 0.5F, azn.b($$4, 0.9F, 1.0F));
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

      public crp.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public crp.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public crp.a a() {
         this.c = true;
         return this;
      }

      public crp b() {
         float $$0 = crn.a(this.a, this.b);
         return new crp(this.a, $$0, this.c);
      }
   }
}
