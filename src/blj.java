import com.google.common.collect.ImmutableMap;

public class blj<E extends bxs> extends bhr<E> {
   public blj(int $$0) {
      super(ImmutableMap.of(bpb.o, bpc.b, bpb.m, bpc.b), $$0);
   }

   protected boolean a(aif $$0, E $$1, long $$2) {
      return $$1.dE() == null;
   }

   protected boolean a(aif $$0, E $$1) {
      return $$1.ay() || $$1.aV() || $$1.bi();
   }

   protected void b(aif $$0, E $$1, long $$2) {
      if ($$1.ay()) {
         $$1.b(bgl.o);
         $$1.a(amh.zu, 5.0F, 1.0F);
      } else {
         $$1.a(amh.zp, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aif $$0, E $$1, long $$2) {
      if ($$1.dE() == null) {
         $$1.a(bfj.c.b);
      }
   }
}
