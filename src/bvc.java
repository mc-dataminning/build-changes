import com.google.common.collect.ImmutableMap;

public class bvc extends buv<cgm> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bvc() {
      super(ImmutableMap.of(ccg.m, cch.b), 100);
   }

   protected boolean a(aqm $$0, cgm $$1) {
      return $$1.at() == bto.a;
   }

   protected boolean a(aqm $$0, cgm $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(aqm $$0, cgm $$1, long $$2) {
      if (!$$1.bk()) {
         $$1.b(bto.i);
         this.e = 0;
      }
   }

   protected void c(aqm $$0, cgm $$1, long $$2) {
      $$1.b(bto.a);
   }

   protected void d(aqm $$0, cgm $$1, long $$2) {
      this.e++;
   }
}
