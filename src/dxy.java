import com.mojang.serialization.Codec;

public class dxy extends dxu {
   public static final Codec<dxy> a = atg.j.fieldOf("chance").xmap(dxy::new, $$0 -> $$0.c).codec();
   private final int c;

   private dxy(int $$0) {
      this.c = $$0;
   }

   public static dxy a(int $$0) {
      return new dxy($$0);
   }

   @Override
   protected boolean a(dxt $$0, auf $$1, hv $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dxw<?> b() {
      return dxw.b;
   }
}
