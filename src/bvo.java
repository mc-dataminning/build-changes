import com.google.common.collect.ImmutableMap;

public class bvo extends bvh<cgy> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bvo() {
      super(ImmutableMap.of(ccs.m, cct.b), 100);
   }

   protected boolean a(aqu $$0, cgy $$1) {
      return $$1.at() == bua.a;
   }

   protected boolean a(aqu $$0, cgy $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aqu $$0, cgy $$1, long $$2) {
      if (!$$1.bj()) {
         $$1.b(bua.i);
         this.e = 0;
      }
   }

   protected void c(aqu $$0, cgy $$1, long $$2) {
      $$1.b(bua.a);
   }

   protected void d(aqu $$0, cgy $$1, long $$2) {
      this.e++;
   }
}
