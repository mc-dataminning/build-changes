import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhf extends der implements dmg {
   public static final MapCodec<dhf> a = b(dhf::new);
   public static final akk b = new akk("sherds");
   private static final ews d = dff.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dtb e = dsx.R;
   public static final dsy c = dsx.bw;
   private static final dsy f = dsx.C;

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   protected dhf(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, jf.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == eoc.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if ($$2.c_($$3) instanceof dqd $$7) {
         if ($$2.B) {
            return bqf.b;
         } else {
            cua $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || cua.c($$9, $$0) && $$9.H() < $$9.j())) {
               $$7.a(dqd.a.a);
               $$4.b(avp.c.b($$0.g()));
               cua $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.H() / (float)$$10.j();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.H() / (float)$$9.j();
               }

               $$2.a(null, $$3, avf.gy, avg.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aqk $$13) {
                  $$13.a(lj.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dxa.c, $$3);
               return bqf.a;
            } else {
               return bqf.d;
            }
         }
      } else {
         return bqf.e;
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.c_($$2) instanceof dqd $$5) {
         $$1.a(null, $$2, avf.gz, avg.e, 1.0F, 1.0F);
         $$5.a(dqd.a.b);
         $$1.a($$3, dxa.c, $$2);
         return bqd.a;
      } else {
         return bqd.e;
      }
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return d;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqd($$0, $$1);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      bpz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cua> a(dsh $$0, eqr.a $$1) {
      dpn $$2 = $$1.b(etk.h);
      if ($$2 instanceof dqd $$3) {
         $$1.a(b, $$1x -> {
            for (ctv $$2x : $$3.l().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dsh a(dcd $$0, ja $$1, dsh $$2, cmh $$3) {
      cua $$4 = $$3.eT();
      dsh $$5 = $$2;
      if ($$4.a(awd.bw) && !czl.a($$4, avx.r)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(f) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected dms g_(dsh $$0) {
      return $$0.c(c) ? dms.bc : dms.bb;
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      super.a($$0, $$1, $$2, $$3);
      dqr $$4 = $$0.a(kn.Z, dqr.a);
      if (!$$4.equals(dqr.a)) {
         $$2.add(wt.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cua($$1x.orElse(cud.qL), 1).w().e().a(n.h)));
      }
   }

   @Override
   protected void a(dcd $$0, dsh $$1, evv $$2, cmz $$3) {
      ja $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return $$0.c_($$1) instanceof dqd $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return cpe.a($$1.c_($$2));
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
