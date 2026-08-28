import javax.annotation.Nullable;

public class ahy implements yw<agf> {
   public static final yn<vl, ahy> a = yw.a(ahy::a, ahy::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ahy(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahy(vl $$0) {
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
   public yy<ahy> a() {
      return agd.cd;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   @Nullable
   public dga a(dgz $$0) {
      bva $$1 = $$0.a(this.b);
      return $$1 instanceof csa ? ((csa)$$1).q() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
