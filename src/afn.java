import java.util.List;

public class afn implements zk<abz> {
   public static final zb<wa, afn> a = zk.a(afn::a, afn::new);
   private final int b;
   private final int[] c;

   public afn(btj $$0) {
      this.b = $$0.ap();
      List<btj> $$1 = $$0.cW();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ap();
      }
   }

   private afn(wa $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zm<afn> a() {
      return ago.aK;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
