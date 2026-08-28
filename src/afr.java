import javax.annotation.Nullable;

public class afr implements zr<acg> {
   public static final zi<wh, afr> a = zr.a(afr::a, afr::new);
   private final int b;
   private final int c;

   public afr(bvb $$0, @Nullable bvb $$1) {
      this.b = $$0.ar();
      this.c = $$1 != null ? $$1.ar() : 0;
   }

   private afr(wh $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(wh $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zt<afr> a() {
      return agz.aG;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
