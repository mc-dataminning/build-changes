import javax.annotation.Nullable;

public class agz implements yn<afl> {
   public static final ye<vg, agz> a = yn.a(agz::a, agz::new);
   private final int b;
   private final String c;
   private final boolean d;

   public agz(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agz(vg $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yp<agz> a() {
      return afj.bT;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   @Nullable
   public cxy a(cyx $$0) {
      bpv $$1 = $$0.a(this.b);
      return $$1 instanceof clw ? ((clw)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
