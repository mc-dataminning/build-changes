import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dkq extends dic implements dpr {
   public static final MapCodec<dkq> a = b(dkq::new);
   public static final alj b = alj.b("sherds");
   private static final fas d = diq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dws<jm> e = dwl.R;
   public static final dwm c = dwl.bw;
   private static final dwm f = dwl.C;

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   protected dkq(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, jm.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      return this.m().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == erw.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if ($$2.c_($$3) instanceof dto $$7) {
         if ($$2.C) {
            return bsk.a;
         } else {
            cwm $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cwm.c($$9, $$0) && $$9.L() < $$9.k())) {
               $$7.a(dto.a.a);
               $$4.b(awx.c.b($$0.h()));
               cwm $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.L() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.L() / (float)$$9.k();
               }

               $$2.a(null, $$3, awn.gz, awo.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arp $$13) {
                  $$13.a(ls.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, ear.c, $$3);
               return bsk.a;
            } else {
               return bsk.f;
            }
         }
      } else {
         return bsk.e;
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if ($$1.c_($$2) instanceof dto $$5) {
         $$1.a(null, $$2, awn.gA, awo.e, 1.0F, 1.0F);
         $$5.a(dto.a.b);
         $$1.a($$3, ear.c, $$2);
         return bsk.a;
      } else {
         return bsk.e;
      }
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return d;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dto($$0, $$1);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      bsg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cwm> a(dvv $$0, euq.a $$1) {
      dsy $$2 = $$1.b(exj.h);
      if ($$2 instanceof dto $$3) {
         $$1.a(b, $$1x -> {
            for (cwi $$2x : $$3.t().a()) {
               $$1x.accept($$2x.o());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dvv a(dfm $$0, jh $$1, dvv $$2, cou $$3) {
      cwm $$4 = $$3.eX();
      dvv $$5 = $$2;
      if ($$4.a(axl.bN) && !dcf.a($$4, axf.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(f) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dqd h_(dvv $$0) {
      return $$0.c(c) ? dqd.bc : dqd.bb;
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      super.a($$0, $$1, $$2, $$3);
      due $$4 = $$0.a(ku.ak, due.a);
      if (!$$4.equals(due.a)) {
         $$2.add(xi.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cwm($$1x.orElse(cwq.qM), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dfm $$0, dvv $$1, ezu $$2, cpn $$3) {
      jh $$4 = $$2.b();
      if ($$0 instanceof arp $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return $$0.c_($$1) instanceof dto $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return crz.a($$1.c_($$2));
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
