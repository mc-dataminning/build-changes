import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhh extends det implements dmi {
   public static final MapCodec<dhh> a = b(dhh::new);
   public static final akk b = new akk("sherds");
   private static final ewy d = dfh.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dte e = dta.R;
   public static final dtb c = dta.bw;
   private static final dtb f = dta.C;

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   protected dhh(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, jf.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == eoi.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if ($$2.c_($$3) instanceof dqf $$7) {
         if ($$2.B) {
            return bqi.b;
         } else {
            cuc $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || cuc.c($$9, $$0) && $$9.H() < $$9.j())) {
               $$7.a(dqf.a.a);
               $$4.b(avr.c.b($$0.g()));
               cuc $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.H() / (float)$$10.j();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.H() / (float)$$9.j();
               }

               $$2.a(null, $$3, avh.gy, avi.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aqm $$13) {
                  $$13.a(lj.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dxg.c, $$3);
               return bqi.a;
            } else {
               return bqi.d;
            }
         }
      } else {
         return bqi.e;
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.c_($$2) instanceof dqf $$5) {
         $$1.a(null, $$2, avh.gz, avi.e, 1.0F, 1.0F);
         $$5.a(dqf.a.b);
         $$1.a($$3, dxg.c, $$2);
         return bqg.a;
      } else {
         return bqg.e;
      }
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return d;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqf($$0, $$1);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      bqc.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cuc> a(dsk $$0, eqx.a $$1) {
      dpp $$2 = $$1.b(etq.h);
      if ($$2 instanceof dqf $$3) {
         $$1.a(b, $$1x -> {
            for (ctx $$2x : $$3.l().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dsk a(dcf $$0, ja $$1, dsk $$2, cmk $$3) {
      cuc $$4 = $$3.eU();
      dsk $$5 = $$2;
      if ($$4.a(awf.bw) && !czn.a($$4, avz.r)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(f) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected dmu g_(dsk $$0) {
      return $$0.c(c) ? dmu.bc : dmu.bb;
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      super.a($$0, $$1, $$2, $$3);
      dqu $$4 = $$0.a(kn.Z, dqu.a);
      if (!$$4.equals(dqu.a)) {
         $$2.add(wt.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cuc($$1x.orElse(cuf.qL), 1).w().e().a(n.h)));
      }
   }

   @Override
   protected void a(dcf $$0, dsk $$1, ewb $$2, cnc $$3) {
      ja $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return $$0.c_($$1) instanceof dqf $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return cph.a($$1.c_($$2));
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
