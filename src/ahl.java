import javax.annotation.Nullable;

public class ahl implements yz<afx> {
   public static final yq<vs, ahl> a = yz.a(ahl::a, ahl::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ahl(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahl(vs $$0) {
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
   public zb<ahl> a() {
      return afv.bT;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   @Nullable
   public cyv a(czu $$0) {
      bql $$1 = $$0.a(this.b);
      return $$1 instanceof cmo ? ((cmo)$$1).B() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
