import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import javax.annotation.Nullable;

public abstract class fmv {
   private static final Object2ObjectMap<aep, fmv> a = ac.a(new Object2ObjectArrayMap(), $$0 -> {
      fmv.c $$1 = new fmv.c();
      $$0.defaultReturnValue($$1);
      $$0.put(dif.e, $$1);
      $$0.put(dif.f, new fmv.b());
      $$0.put(dif.g, new fmv.a());
   });
   private final float[] b = new float[4];
   private final float c;
   private final boolean d;
   private final fmv.d e;
   private final boolean f;
   private final boolean g;

   public fmv(float $$0, boolean $$1, fmv.d $$2, boolean $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public static fmv a(dih $$0) {
      return (fmv)a.get($$0.r());
   }

   @Nullable
   public float[] a(float $$0, float $$1) {
      float $$2 = 0.4F;
      float $$3 = aro.b($$0 * (float) (Math.PI * 2)) - 0.0F;
      float $$4 = -0.0F;
      if ($$3 >= -0.4F && $$3 <= 0.4F) {
         float $$5 = ($$3 - -0.0F) / 0.4F * 0.5F + 0.5F;
         float $$6 = 1.0F - (1.0F - aro.a($$5 * (float) Math.PI)) * 0.99F;
         $$6 *= $$6;
         this.b[0] = $$5 * 0.3F + 0.7F;
         this.b[1] = $$5 * $$5 * 0.7F + 0.2F;
         this.b[2] = $$5 * $$5 * 0.0F + 0.2F;
         this.b[3] = $$6;
         return this.b;
      } else {
         return null;
      }
   }

   public float a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public abstract ehf a(ehf var1, float var2);

   public abstract boolean a(int var1, int var2);

   public fmv.d c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public static class a extends fmv {
      public a() {
         super(Float.NaN, false, fmv.d.c, true, false);
      }

      @Override
      public ehf a(ehf $$0, float $$1) {
         return $$0.a(0.15F);
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return false;
      }

      @Nullable
      @Override
      public float[] a(float $$0, float $$1) {
         return null;
      }
   }

   public static class b extends fmv {
      public b() {
         super(Float.NaN, true, fmv.d.a, false, true);
      }

      @Override
      public ehf a(ehf $$0, float $$1) {
         return $$0;
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return true;
      }
   }

   public static class c extends fmv {
      public static final int a = 192;

      public c() {
         super(192.0F, true, fmv.d.b, false, false);
      }

      @Override
      public ehf a(ehf $$0, float $$1) {
         return $$0.d((double)($$1 * 0.94F + 0.06F), (double)($$1 * 0.94F + 0.06F), (double)($$1 * 0.91F + 0.09F));
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return false;
      }
   }

   public static enum d {
      a,
      b,
      c;
   }
}
