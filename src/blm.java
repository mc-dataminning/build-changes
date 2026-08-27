import com.google.common.collect.ImmutableMap;

public class blm extends bhr<bxs> {
   private static final int c = 25;
   private static final int d = 20;

   public blm() {
      super(ImmutableMap.of(bpb.ax, bpc.a, bpb.o, bpc.b, bpb.aE, bpc.c, bpb.aC, bpc.c), bxt.b);
   }

   protected void a(aif $$0, bxs $$1, long $$2) {
      bha<bxs> $$3 = $$1.dK();
      $$3.a(bpb.aC, apz.a, 25L);
      $$3.b(bpb.m);
      bfz $$4 = $$1.dK().c(bpb.ax).get();
      bht.a($$1, $$4);
      $$1.b(bgl.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(aif $$0, bxs $$1, long $$2) {
      return true;
   }

   protected void c(aif $$0, bxs $$1, long $$2) {
      if (!$$1.dK().a(bpb.aC) && !$$1.dK().a(bpb.aE)) {
         $$1.dK().a(bpb.aE, apz.a, (long)(bxt.b - 25));
         $$1.a(amh.zD, 3.0F, 1.0F);
      }
   }

   protected void d(aif $$0, bxs $$1, long $$2) {
      if ($$1.c(bgl.l)) {
         $$1.b(bgl.a);
      }

      $$1.dK().c(bpb.ax).ifPresent($$1::l);
      $$1.dK().b(bpb.ax);
   }
}
