import com.google.common.collect.ImmutableMap;

public class bzq<E extends cmt> extends bvx<E> {
   public bzq(int $$0) {
      super(ImmutableMap.of(cdi.o, cdj.b, cdi.m, cdj.b), $$0);
   }

   protected boolean a(arg $$0, E $$1, long $$2) {
      return $$1.dO() == null;
   }

   protected boolean a(arg $$0, E $$1) {
      return $$1.aH() || $$1.bi() || $$1.bw();
   }

   protected void b(arg $$0, E $$1, long $$2) {
      if ($$1.aH()) {
         $$1.b(bur.o);
         $$1.a(awd.BR, 5.0F, 1.0F);
      } else {
         $$1.a(awd.BM, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(arg $$0, E $$1, long $$2) {
      if ($$1.dO() == null) {
         $$1.a(btj.c.b);
      }
   }
}
