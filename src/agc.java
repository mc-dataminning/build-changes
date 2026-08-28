import javax.annotation.Nullable;

public class agc implements aac<acr> {
   public static final zt<ws, agc> a = aac.a(agc::a, agc::new);
   private final int b;
   private final int c;

   public agc(bvk $$0, @Nullable bvk $$1) {
      this.b = $$0.ar();
      this.c = $$1 != null ? $$1.ar() : 0;
   }

   private agc(ws $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(ws $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public aae<agc> a() {
      return ahk.aG;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
