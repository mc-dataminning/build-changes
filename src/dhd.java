import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhd extends den implements dmr {
   public static final MapCodec<dhd> a = b(dhd::new);
   public static final akt b = new akt("sherds");
   private static final exn d = dfc.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dtw e = dts.R;
   public static final dtt c = dts.bw;
   private static final dtt f = dts.C;

   @Override
   public MapCodec<dhd> a() {
      return a;
   }

   protected dhd(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, iw.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      return this.n().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == epf.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if ($$2.c_($$3) instanceof dqs $$7) {
         if ($$2.C) {
            return bqc.b;
         } else {
            cuh $$9 = $$7.f();
            if (!$$0.d() && ($$9.d() || cuh.c($$9, $$0) && $$9.G() < $$9.i())) {
               $$7.a(dqs.a.a);
               $$4.b(avz.c.b($$0.f()));
               cuh $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.G() / (float)$$10.i();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.G() / (float)$$9.i();
               }

               $$2.a(null, $$3, avo.gy, avq.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aqt $$13) {
                  $$13.a(lb.aY, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dxv.c, $$3);
               return bqc.a;
            } else {
               return bqc.d;
            }
         }
      } else {
         return bqc.e;
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.c_($$2) instanceof dqs $$5) {
         $$1.a(null, $$2, avo.gz, avq.e, 1.0F, 1.0F);
         $$5.a(dqs.a.b);
         $$1.a($$3, dxv.c, $$2);
         return bqa.a;
      } else {
         return bqa.d;
      }
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return d;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqs($$0, $$1);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      bpw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cuh> a(dtc $$0, ers.a $$1) {
      dqc $$2 = $$1.b(eug.h);
      if ($$2 instanceof dqs $$3) {
         $$1.a(b, $$1x -> {
            for (cuc $$2x : $$3.l().a()) {
               $$1x.accept($$2x.v());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dtc a(dca $$0, ir $$1, dtc $$2, cly $$3) {
      cuh $$4 = $$3.fg();
      dtc $$5 = $$2;
      if ($$4.a(awm.by) && !dae.h($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(f) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dnd g_(dtc $$0) {
      return $$0.c(c) ? dnd.bh : dnd.bg;
   }

   @Override
   public void a(cuh $$0, @Nullable dbg $$1, List<xe> $$2, cwi $$3, @Nullable jo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      drj $$5 = $$0.a(ke.Y, drj.a);
      if (!$$5.equals(drj.a)) {
         $$2.add(xd.a);
         Stream.of($$5.e(), $$5.c(), $$5.d(), $$5.b()).forEach($$1x -> $$2.add(new cuh($$1x.orElse(cuk.si), 1).w().e().a(n.h)));
      }
   }

   @Override
   protected void a(dca $$0, dtc $$1, ewq $$2, cms $$3) {
      ir $$4 = $$2.a();
      if (!$$0.C && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return $$0.c_($$1) instanceof dqs $$3 ? $$3.t() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return cpg.a($$1.c_($$2));
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
