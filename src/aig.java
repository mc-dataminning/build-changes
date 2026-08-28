import javax.annotation.Nullable;

public class aig implements zd<agn> {
   public static final yu<vs, aig> a = zd.a(aig::a, aig::new);
   private final int b;
   private final String c;
   private final boolean d;

   public aig(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aig(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zf<aig> a() {
      return agl.ce;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   @Nullable
   public dhq a(dip $$0) {
      bwa $$1 = $$0.a(this.b);
      return $$1 instanceof cto ? ((cto)$$1).q() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
