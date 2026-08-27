import java.util.List;
import javax.annotation.Nullable;

public class cgo extends cfu {
   private static final int a = 32;

   public cgo(cfu.a $$0) {
      super($$0);
   }

   @Override
   public cfz ae_() {
      return chy.a(super.ae_(), chz.c);
   }

   @Override
   public cfz a(cfz $$0, cmm $$1, bfz $$2) {
      byo $$3 = $$2 instanceof byo ? (byo)$$2 : null;
      if ($$3 instanceof aig) {
         ai.z.a((aig)$$3, $$0);
      }

      if (!$$1.B) {
         for (bfa $$5 : chy.a($$0)) {
            if ($$5.c().a()) {
               $$5.c().a($$3, $$3, $$2, $$5.e(), 1.0);
            } else {
               $$2.b(new bfa($$5));
            }
         }
      }

      if ($$3 != null) {
         $$3.b(amr.c.b(this));
         if (!$$3.fO().d) {
            $$0.h(1);
         }
      }

      if ($$3 == null || !$$3.fO().d) {
         if ($$0.b()) {
            return new cfz(cgc.rw);
         }

         if ($$3 != null) {
            $$3.fN().e(new cfz(cgc.rw));
         }
      }

      $$2.a(dgl.l);
      return $$0;
   }

   @Override
   public bdx a(cij $$0) {
      cmm $$1 = $$0.q();
      gu $$2 = $$0.a();
      byo $$3 = $$0.o();
      cfz $$4 = $$0.n();
      dcb $$5 = $$1.a_($$2);
      if ($$0.k() != ha.a && $$5.a(amw.bY) && chy.d($$4) == chz.c) {
         $$1.a(null, $$2, amh.jb, ami.e, 1.0F, 1.0F);
         $$3.a($$0.p(), cgb.a($$4, $$3, new cfz(cgc.rw)));
         $$3.b(amr.c.b($$4.d()));
         if (!$$1.B) {
            aif $$6 = (aif)$$1;

            for (int $$7 = 0; $$7 < 5; $$7++) {
               $$6.a(iv.ag, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, amh.ch, ami.e, 1.0F, 1.0F);
         $$1.a(null, dgl.A, $$2);
         $$1.b($$2, cpo.rH.n());
         return bdx.a($$1.B);
      } else {
         return bdx.d;
      }
   }

   @Override
   public int b(cfz $$0) {
      return 32;
   }

   @Override
   public chs c(cfz $$0) {
      return chs.c;
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      return cgb.a($$0, $$1, $$2);
   }

   @Override
   public String j(cfz $$0) {
      return chy.d($$0).b(this.a() + ".effect.");
   }

   @Override
   public void a(cfz $$0, @Nullable cmm $$1, List<sw> $$2, chq $$3) {
      chy.a($$0, $$2, 1.0F);
   }
}
