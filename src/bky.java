import com.google.common.collect.ImmutableMap;

public class bky extends bhr<byb> {
   public bky() {
      super(ImmutableMap.of());
   }

   protected boolean a(aif $$0, byb $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aif $$0, byb $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bha<?> $$3 = $$1.dK();
         if (!$$3.c(bzz.g)) {
            $$3.b(bpb.t);
            $$3.b(bpb.m);
            $$3.b(bpb.n);
            $$3.b(bpb.r);
            $$3.b(bpb.q);
         }

         $$3.a(bzz.g);
      }
   }

   protected void c(aif $$0, byb $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bfz $$0) {
      return $$0.dK().a(bpb.A);
   }

   public static boolean c(bfz $$0) {
      return $$0.dK().a(bpb.x);
   }
}
