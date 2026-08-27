import com.google.common.collect.ImmutableMap;

public class bhy extends bhr<bta> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bhy() {
      super(ImmutableMap.of(bpb.m, bpc.b), 100);
   }

   protected boolean a(aif $$0, bta $$1) {
      return $$1.al() == bgl.a;
   }

   protected boolean a(aif $$0, bta $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aif $$0, bta $$1, long $$2) {
      if (!$$1.aY() && !$$1.bi()) {
         $$1.b(bgl.i);
         this.e = 0;
      }
   }

   protected void c(aif $$0, bta $$1, long $$2) {
      $$1.b(bgl.a);
   }

   protected void d(aif $$0, bta $$1, long $$2) {
      this.e++;
   }
}
