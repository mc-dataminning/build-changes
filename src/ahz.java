import javax.annotation.Nullable;

public class ahz implements yw<agg> {
   public static final yn<vl, ahz> a = yw.a(ahz::a, ahz::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ahz(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahz(vl $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yy<ahz> a() {
      return age.ce;
   }

   public void a(agg $$0) {
      $$0.a(this);
   }

   @Nullable
   public dfj a(dgj $$0) {
      bum $$1 = $$0.a(this.b);
      return $$1 instanceof crh ? ((crh)$$1).v() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
