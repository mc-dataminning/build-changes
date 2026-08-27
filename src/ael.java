import java.util.List;

public class ael implements yp<aba> {
   public static final yg<vi, ael> a = yp.a(ael::a, ael::new);
   private final int b;
   private final int[] c;

   public ael(bqa $$0) {
      this.b = $$0.aj();
      List<bqa> $$1 = $$0.cP();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).aj();
      }
   }

   private ael(vi $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vi $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public yr<ael> a() {
      return afl.aJ;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
