import com.google.common.collect.ImmutableMap;

public class cam<E extends cnp> extends bwt<E> {
   public cam(int $$0) {
      super(ImmutableMap.of(cee.o, cef.b, cee.m, cef.b), $$0);
   }

   protected boolean a(arn $$0, E $$1, long $$2) {
      return $$1.dT() == null;
   }

   protected boolean a(arn $$0, E $$1) {
      return $$1.aK() || $$1.bk() || $$1.by();
   }

   protected void b(arn $$0, E $$1, long $$2) {
      if ($$1.aK()) {
         $$1.b(bvm.o);
         $$1.a(awl.BP, 5.0F, 1.0F);
      } else {
         $$1.a(awl.BK, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arn $$0, E $$1, long $$2) {
      if ($$1.dT() == null) {
         $$1.a(bue.c.b);
      }
   }
}
