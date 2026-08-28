import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhi extends deu implements dmj {
   public static final MapCodec<dhi> a = b(dhi::new);
   public static final akk b = new akk("sherds");
   private static final exa d = dfi.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dtf e = dtb.R;
   public static final dtc c = dtb.bw;
   private static final dtc f = dtb.C;

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   protected dhi(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, jf.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == eok.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      if ($$2.c_($$3) instanceof dqg $$7) {
         if ($$2.B) {
            return bqj.b;
         } else {
            cud $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || cud.c($$9, $$0) && $$9.H() < $$9.j())) {
               $$7.a(dqg.a.a);
               $$4.b(avr.c.b($$0.g()));
               cud $$10 = $$0.b(1, $$4);
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
               $$2.a($$4, dxh.c, $$3);
               return bqj.a;
            } else {
               return bqj.d;
            }
         }
      } else {
         return bqj.e;
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.c_($$2) instanceof dqg $$5) {
         $$1.a(null, $$2, avh.gz, avi.e, 1.0F, 1.0F);
         $$5.a(dqg.a.b);
         $$1.a($$3, dxh.c, $$2);
         return bqh.a;
      } else {
         return bqh.e;
      }
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return d;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqg($$0, $$1);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      bqd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cud> a(dsl $$0, eqz.a $$1) {
      dpq $$2 = $$1.b(ets.h);
      if ($$2 instanceof dqg $$3) {
         $$1.a(b, $$1x -> {
            for (cty $$2x : $$3.l().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dsl a(dcg $$0, ja $$1, dsl $$2, cml $$3) {
      cud $$4 = $$3.eV();
      dsl $$5 = $$2;
      if ($$4.a(awf.bw) && !czo.a($$4, avz.r)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(f) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected dmv g_(dsl $$0) {
      return $$0.c(c) ? dmv.bc : dmv.bb;
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      super.a($$0, $$1, $$2, $$3);
      dqv $$4 = $$0.a(kn.Z, dqv.a);
      if (!$$4.equals(dqv.a)) {
         $$2.add(wt.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cud($$1x.orElse(cug.qL), 1).w().e().a(n.h)));
      }
   }

   @Override
   protected void a(dcg $$0, dsl $$1, ewd $$2, cnd $$3) {
      ja $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cud a(dcj $$0, ja $$1, dsl $$2) {
      return $$0.c_($$1) instanceof dqg $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return cpi.a($$1.c_($$2));
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
