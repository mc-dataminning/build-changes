import com.google.common.collect.ImmutableMap;

public class bwj extends bwc<chu> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bwj() {
      super(ImmutableMap.of(cdn.m, cdo.b), 100);
   }

   protected boolean a(arh $$0, chu $$1) {
      return $$1.av() == buw.a;
   }

   protected boolean a(arh $$0, chu $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(arh $$0, chu $$1, long $$2) {
      if (!$$1.bm()) {
         $$1.b(buw.i);
         this.e = 0;
      }
   }

   protected void c(arh $$0, chu $$1, long $$2) {
      $$1.b(buw.a);
   }

   protected void d(arh $$0, chu $$1, long $$2) {
      this.e++;
   }
}
