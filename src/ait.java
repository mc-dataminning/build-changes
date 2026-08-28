import javax.annotation.Nullable;

public class ait implements zr<ahb> {
   public static final zi<wh, ait> a = zr.a(ait::a, ait::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ait(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ait(wh $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(wh $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zt<ait> a() {
      return agz.cd;
   }

   public void a(ahb $$0) {
      $$0.a(this);
   }

   @Nullable
   public dfz a(dgz $$0) {
      bvb $$1 = $$0.a(this.b);
      return $$1 instanceof crx ? ((crx)$$1).v() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
