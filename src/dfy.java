import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dfy extends ddk implements dkz {
   public static final MapCodec<dfy> a = b(dfy::new);
   public static final akm b = new akm("sherds");
   private static final evd d = ddy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final drv e = drr.R;
   public static final drs c = drr.bw;
   private static final drs f = drr.C;

   @Override
   public MapCodec<dfy> a() {
      return a;
   }

   protected dfy(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, it.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      return this.n().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == emv.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if ($$2.c_($$3) instanceof dow $$7) {
         if ($$2.B) {
            return bpw.b;
         } else {
            cto $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || cto.c($$9, $$0) && $$9.I() < $$9.j())) {
               $$7.a(dow.a.a);
               $$4.b(avr.c.b($$0.g()));
               cto $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.I() / (float)$$10.j();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.I() / (float)$$9.j();
               }

               $$2.a(null, $$3, avh.gy, avi.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aqm $$13) {
                  $$13.a(ky.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dvu.c, $$3);
               return bpw.a;
            } else {
               return bpw.d;
            }
         }
      } else {
         return bpw.e;
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.c_($$2) instanceof dow $$5) {
         $$1.a(null, $$2, avh.gz, avi.e, 1.0F, 1.0F);
         $$5.a(dow.a.b);
         $$1.a($$3, dvu.c, $$2);
         return bpu.a;
      } else {
         return bpu.d;
      }
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return d;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dog a(io $$0, drb $$1) {
      return new dow($$0, $$1);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      bpq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cto> a(drb $$0, epi.a $$1) {
      dog $$2 = $$1.b(erx.h);
      if ($$2 instanceof dow $$3) {
         $$1.a(b, $$1x -> {
            for (ctj $$2x : $$3.l().a()) {
               $$1x.accept($$2x.v());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public drb a(dax $$0, io $$1, drb $$2, clw $$3) {
      cto $$4 = $$3.eX();
      drb $$5 = $$2;
      if ($$4.a(awe.bx) && !cza.h($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(f) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected dll g_(drb $$0) {
      return $$0.c(c) ? dll.bc : dll.bb;
   }

   @Override
   public void a(cto $$0, @Nullable dad $$1, List<wx> $$2, cvh $$3, @Nullable jl $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpk $$5 = $$0.a(kb.Y, dpk.a);
      if (!$$5.equals(dpk.a)) {
         $$2.add(ww.a);
         Stream.of($$5.e(), $$5.c(), $$5.d(), $$5.b()).forEach($$1x -> $$2.add(new cto($$1x.orElse(ctr.qL), 1).x().e().a(n.h)));
      }
   }

   @Override
   protected void a(dax $$0, drb $$1, eug $$2, cmo $$3) {
      io $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return $$0.c_($$1) instanceof dow $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return cot.a($$1.c_($$2));
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
