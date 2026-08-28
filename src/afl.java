import java.util.List;

public class afl implements zf<abu> {
   public static final yw<vu, afl> a = zf.a(afl::a, afl::new);
   private final int b;
   private final int[] c;

   public afl(bwi $$0) {
      this.b = $$0.ao();
      List<bwi> $$1 = $$0.cX();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ao();
      }
   }

   private afl(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<afl> a() {
      return agn.aN;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
