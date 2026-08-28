import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cun(int c, float d, boolean e) implements dbe {
   public static final Codec<cun> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.l.fieldOf("nutrition").forGetter(cun::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(cun::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cun::c)
            )
            .apply($$0, cun::new)
   );
   public static final yw<wj, cun> b = yw.a(yu.h, cun::a, yu.l, cun::b, yu.b, cun::c, cun::new);

   @Override
   public void a(div $$0, bxc $$1, cyy $$2, dbd $$3) {
      azv $$4 = $$1.dY();
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$3.e().a(), awo.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cqy $$5) {
         $$5.gt().a(this);
         $$0.a(null, $$5.dA(), $$5.dC(), $$5.dG(), awn.uU, awo.h, 0.5F, azm.b($$4, 0.9F, 1.0F));
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

      public cun.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cun.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cun.a a() {
         this.c = true;
         return this;
      }

      public cun b() {
         float $$0 = cul.a(this.a, this.b);
         return new cun(this.a, $$0, this.c);
      }
   }
}
