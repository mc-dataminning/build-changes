import com.google.common.collect.ImmutableMap;

public class bsn extends bsg<cdv> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bsn() {
      super(ImmutableMap.of(bzr.m, bzs.b), 100);
   }

   protected boolean a(aps $$0, cdv $$1) {
      return $$1.ap() == bqz.a;
   }

   protected boolean a(aps $$0, cdv $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aps $$0, cdv $$1, long $$2) {
      if (!$$1.bg()) {
         $$1.b(bqz.i);
         this.e = 0;
      }
   }

   protected void c(aps $$0, cdv $$1, long $$2) {
      $$1.b(bqz.a);
   }

   protected void d(aps $$0, cdv $$1, long $$2) {
      this.e++;
   }
}
