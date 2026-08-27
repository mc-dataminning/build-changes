import javax.annotation.Nullable;

public class agn implements yb<aez> {
   public static final xs<uu, agn> a = yb.a(agn::a, agn::new);
   private final int b;
   private final String c;
   private final boolean d;

   public agn(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agn(uu $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(uu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yd<agn> a() {
      return aex.bT;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   @Nullable
   public cwc a(cxb $$0) {
      box $$1 = $$0.a(this.b);
      return $$1 instanceof ckx ? ((ckx)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
