import javax.annotation.Nullable;

public class ahy implements yv<agf> {
   public static final ym<vl, ahy> a = yv.a(ahy::a, ahy::new);
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
   public yx<ahy> a() {
      return agd.ce;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   @Nullable
   public dfg a(dgg $$0) {
      buj $$1 = $$0.a(this.b);
      return $$1 instanceof cre ? ((cre)$$1).v() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
