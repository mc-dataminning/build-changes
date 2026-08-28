import com.google.common.collect.ImmutableMap;

public class cby extends byq<cqe> {
   public cby() {
      super(ImmutableMap.of());
   }

   protected boolean a(aro $$0, cqe $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aro $$0, cqe $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bxz<?> $$3 = $$1.eb();
         if (!$$3.c(csl.g)) {
            $$3.b(cgb.u);
            $$3.b(cgb.n);
            $$3.b(cgb.o);
            $$3.b(cgb.s);
            $$3.b(cgb.r);
         }

         $$3.a(csl.g);
      }
   }

   protected void c(aro $$0, cqe $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bwz $$0) {
      return $$0.eb().a(cgb.B);
   }

   public static boolean c(bwz $$0) {
      return $$0.eb().a(cgb.y);
   }
}
