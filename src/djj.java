import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class djj extends dgv implements dol {
   public static final MapCodec<djj> a = b(djj::new);
   public static final alc b = alc.b("sherds");
   private static final ezm d = dhj.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dvi e = dve.R;
   public static final dvf c = dve.bw;
   private static final dvf f = dve.C;

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   protected djj(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jj.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public duo a(czk $$0) {
      eqp $$1 = $$0.q().b_($$0.a());
      return this.o().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == eqq.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if ($$2.c_($$3) instanceof dsi $$7) {
         if ($$2.B) {
            return brp.a;
         } else {
            cvp $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cvp.c($$9, $$0) && $$9.J() < $$9.k())) {
               $$7.a(dsi.a.a);
               $$4.b(awo.c.b($$0.h()));
               cvp $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.J() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.J() / (float)$$9.k();
               }

               $$2.a(null, $$3, awe.gz, awf.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arh $$13) {
                  $$13.a(ln.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dzl.c, $$3);
               return brp.a;
            } else {
               return brp.f;
            }
         }
      } else {
         return brp.e;
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if ($$1.c_($$2) instanceof dsi $$5) {
         $$1.a(null, $$2, awe.gA, awf.e, 1.0F, 1.0F);
         $$5.a(dsi.a.b);
         $$1.a($$3, dzl.c, $$2);
         return brp.a;
      } else {
         return brp.e;
      }
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return d;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return new dsi($$0, $$1);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      brl.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cvp> a(duo $$0, etk.a $$1) {
      drs $$2 = $$1.b(ewd.h);
      if ($$2 instanceof dsi $$3) {
         $$1.a(b, $$1x -> {
            for (cvk $$2x : $$3.t().a()) {
               $$1x.accept($$2x.v());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public duo a(deg $$0, je $$1, duo $$2, cnu $$3) {
      cvp $$4 = $$3.eW();
      duo $$5 = $$2;
      if ($$4.a(axc.bA) && !dbm.a($$4, aww.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(f) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected dox h_(duo $$0) {
      return $$0.c(c) ? dox.bc : dox.bb;
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      super.a($$0, $$1, $$2, $$3);
      dsy $$4 = $$0.a(kr.af, dsy.a);
      if (!$$4.equals(dsy.a)) {
         $$2.add(xc.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cvp($$1x.orElse(cvt.qM), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(deg $$0, duo $$1, eyo $$2, coo $$3) {
      je $$4 = $$2.b();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return $$0.c_($$1) instanceof dsi $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return cqw.a($$1.c_($$2));
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
