import com.google.common.collect.ImmutableMap;

public class bss extends bsl<cec> {
   private static final int c = 60;
   private static final int d = 100;
   private int e;

   public bss() {
      super(ImmutableMap.of(bzw.m, bzx.b), 100);
   }

   protected boolean a(apu $$0, cec $$1) {
      return $$1.ap() == bre.a;
   }

   protected boolean a(apu $$0, cec $$1, long $$2) {
      return this.e < 60;
   }

   protected void b(apu $$0, cec $$1, long $$2) {
      if (!$$1.bg()) {
         $$1.b(bre.i);
         this.e = 0;
      }
   }

   protected void c(apu $$0, cec $$1, long $$2) {
      $$1.b(bre.a);
   }

   protected void d(apu $$0, cec $$1, long $$2) {
      this.e++;
   }
}
