import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cvn(int c, float d, boolean e) implements dce {
   public static final Codec<cvn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.l.fieldOf("nutrition").forGetter(cvn::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(cvn::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cvn::c)
            )
            .apply($$0, cvn::new)
   );
   public static final yy<wl, cvn> b = yy.a(yw.h, cvn::a, yw.l, cvn::b, yw.b, cvn::c, cvn::new);

   @Override
   public void a(djx $$0, bxu $$1, czy $$2, dcd $$3) {
      azx $$4 = $$1.dY();
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$3.e().a(), awq.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof crx $$5) {
         $$5.gu().a(this);
         $$0.a(null, $$5.dA(), $$5.dC(), $$5.dG(), awp.uX, awq.h, 0.5F, azo.b($$4, 0.9F, 1.0F));
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

      public cvn.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cvn.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cvn.a a() {
         this.c = true;
         return this;
      }

      public cvn b() {
         float $$0 = cvl.a(this.a, this.b);
         return new cvn(this.a, $$0, this.c);
      }
   }
}
