import com.google.common.collect.ImmutableMap;

public class blq extends bhr<bxs> {
   private static final int d = 15;
   private static final int e = 20;
   private static final double f = 0.5;
   private static final double g = 2.5;
   public static final int c = 40;
   private static final int h = apa.c(34.0);
   private static final int i = apa.f(60.0F);

   public blq() {
      super(ImmutableMap.of(bpb.o, bpc.a, bpb.aI, bpc.b, bpb.aJ, bpc.c, bpb.aK, bpc.c), i);
   }

   protected boolean a(aif $$0, bxs $$1) {
      return $$1.a($$1.dK().c(bpb.o).get(), 15.0, 20.0);
   }

   protected boolean a(aif $$0, bxs $$1, long $$2) {
      return true;
   }

   protected void b(aif $$0, bxs $$1, long $$2) {
      $$1.dK().a(bpb.p, true, (long)i);
      $$1.dK().a(bpb.aK, apz.a, (long)h);
      $$0.a($$1, (byte)62);
      $$1.a(amh.zG, 3.0F, 1.0F);
   }

   protected void c(aif $$0, bxs $$1, long $$2) {
      $$1.dK().c(bpb.o).ifPresent($$1x -> $$1.E().a($$1x.dg()));
      if (!$$1.dK().a(bpb.aK) && !$$1.dK().a(bpb.aJ)) {
         $$1.dK().a(bpb.aJ, apz.a, (long)(i - h));
         $$1.dK().c(bpb.o).filter($$1::a).filter($$1x -> $$1.a($$1x, 15.0, 20.0)).ifPresent($$2x -> {
            eei $$3 = $$1.dg().b(0.0, 1.6F, 0.0);
            eei $$4 = $$2x.bm().d($$3);
            eei $$5 = $$4.d();

            for (int $$6 = 1; $$6 < apa.a($$4.f()) + 7; $$6++) {
               eei $$7 = $$3.e($$5.a((double)$$6));
               $$0.a(iv.y, $$7.c, $$7.d, $$7.e, 1, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.a(amh.zF, 3.0F, 1.0F);
            $$2x.a($$0.ag().e($$1), 10.0F);
            double $$8 = 0.5 * (1.0 - $$2x.b(bhg.c));
            double $$9 = 2.5 * (1.0 - $$2x.b(bhg.c));
            $$2x.j($$5.a() * $$9, $$5.b() * $$8, $$5.c() * $$9);
         });
      }
   }

   protected void d(aif $$0, bxs $$1, long $$2) {
      a($$1, 40);
   }

   public static void a(bfz $$0, int $$1) {
      $$0.dK().a(bpb.aI, apz.a, (long)$$1);
   }
}
