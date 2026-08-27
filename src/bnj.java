import com.google.common.collect.ImmutableMap;

public class bnj extends bnc<byl> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bnj() {
      super(ImmutableMap.of(bum.m, bun.b), 100);
   }

   protected boolean a(ami $$0, byl $$1) {
      return $$1.ap() == blx.a;
   }

   protected boolean a(ami $$0, byl $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(ami $$0, byl $$1, long $$2) {
      if (!$$1.bd()) {
         $$1.b(blx.i);
         this.e = 0;
      }
   }

   protected void c(ami $$0, byl $$1, long $$2) {
      $$1.b(blx.a);
   }

   protected void d(ami $$0, byl $$1, long $$2) {
      this.e++;
   }
}
