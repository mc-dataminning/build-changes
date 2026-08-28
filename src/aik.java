import javax.annotation.Nullable;

public class aik implements zv<agv> {
   public static final zm<wl, aik> a = zv.a(aik::a, aik::new);
   private final int b;
   private final String c;
   private final boolean d;

   public aik(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aik(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zx<aik> a() {
      return agt.bV;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   @Nullable
   public day a(dbx $$0) {
      bst $$1 = $$0.a(this.b);
      return $$1 instanceof cpa ? ((cpa)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
