import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dgu extends deg implements dlv {
   public static final MapCodec<dgu> a = b(dgu::new);
   public static final alb b = new alb("sherds");
   private static final ewf d = deu.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dsr e = dsn.R;
   public static final dso c = dsn.bw;
   private static final dso f = dsn.C;

   @Override
   public MapCodec<dgu> a() {
      return a;
   }

   protected dgu(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, je.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public drx a(cxv $$0) {
      enq $$1 = $$0.q().b_($$0.a());
      return this.n().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == enr.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if ($$2.c_($$3) instanceof dps $$7) {
         if ($$2.B) {
            return bqr.b;
         } else {
            cuk $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || cuk.c($$9, $$0) && $$9.I() < $$9.j())) {
               $$7.a(dps.a.a);
               $$4.b(awg.c.b($$0.g()));
               cuk $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.I() / (float)$$10.j();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.I() / (float)$$9.j();
               }

               $$2.a(null, $$3, avw.gy, avx.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arb $$13) {
                  $$13.a(lj.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dwq.c, $$3);
               return bqr.a;
            } else {
               return bqr.d;
            }
         }
      } else {
         return bqr.e;
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.c_($$2) instanceof dps $$5) {
         $$1.a(null, $$2, avw.gz, avx.e, 1.0F, 1.0F);
         $$5.a(dps.a.b);
         $$1.a($$3, dwq.c, $$2);
         return bqp.a;
      } else {
         return bqp.e;
      }
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return d;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dps($$0, $$1);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      bql.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cuk> a(drx $$0, eqg.a $$1) {
      dpc $$2 = $$1.b(esz.h);
      if ($$2 instanceof dps $$3) {
         $$1.a(b, $$1x -> {
            for (cuf $$2x : $$3.l().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public drx a(dbt $$0, iz $$1, drx $$2, cms $$3) {
      cuk $$4 = $$3.eX();
      drx $$5 = $$2;
      if ($$4.a(awu.bw) && !czw.h($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(f) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected dmh g_(drx $$0) {
      return $$0.c(c) ? dmh.bc : dmh.bb;
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      super.a($$0, $$1, $$2, $$3);
      dqg $$4 = $$0.a(km.Y, dqg.a);
      if (!$$4.equals(dqg.a)) {
         $$2.add(xk.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cuk($$1x.orElse(cun.qL), 1).x().e().a(n.h)));
      }
   }

   @Override
   protected void a(dbt $$0, drx $$1, evi $$2, cnk $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return $$0.c_($$1) instanceof dps $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return cpp.a($$1.c_($$2));
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
