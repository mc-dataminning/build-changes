import javax.annotation.Nullable;

public class aik implements zh<agr> {
   public static final yy<vw, aik> a = zh.a(aik::a, aik::new);
   private final int b;
   private final String c;
   private final boolean d;

   public aik(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aik(vw $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zj<aik> a() {
      return agp.ce;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   @Nullable
   public diw a(djx $$0) {
      bwt $$1 = $$0.a(this.b);
      return $$1 instanceof cuu ? ((cuu)$$1).q() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
