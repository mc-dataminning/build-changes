import javax.annotation.Nullable;

public class agf implements xx<aes> {
   public static final xo<uq, agf> a = xx.a(agf::a, agf::new);
   private final int b;
   private final String c;
   private final boolean d;

   public agf(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agf(uq $$0) {
      this.b = $$0.n();
      this.c = $$0.r();
      this.d = $$0.readBoolean();
   }

   private void a(uq $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public xz<agf> a() {
      return aeq.bR;
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   @Nullable
   public cuo a(cvn $$0) {
      bno $$1 = $$0.a(this.b);
      return $$1 instanceof cji ? ((cji)$$1).C() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
