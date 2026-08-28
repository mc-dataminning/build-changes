import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dgy extends dek implements dlz {
   public static final MapCodec<dgy> a = b(dgy::new);
   public static final ale b = new ale("sherds");
   private static final ewj d = dey.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dsv e = dsr.R;
   public static final dss c = dsr.bw;
   private static final dss f = dsr.C;

   @Override
   public MapCodec<dgy> a() {
      return a;
   }

   protected dgy(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, je.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == env.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bqv a(cuo $$0, dsb $$1, dbx $$2, iz $$3, cmw $$4, bqs $$5, evm $$6) {
      if ($$2.c_($$3) instanceof dpw $$7) {
         if ($$2.B) {
            return bqv.b;
         } else {
            cuo $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || cuo.c($$9, $$0) && $$9.I() < $$9.j())) {
               $$7.a(dpw.a.a);
               $$4.b(awj.c.b($$0.g()));
               cuo $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.I() / (float)$$10.j();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.I() / (float)$$9.j();
               }

               $$2.a(null, $$3, avz.gy, awa.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof are $$13) {
                  $$13.a(li.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dwu.c, $$3);
               return bqv.a;
            } else {
               return bqv.d;
            }
         }
      } else {
         return bqv.e;
      }
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.c_($$2) instanceof dpw $$5) {
         $$1.a(null, $$2, avz.gz, awa.e, 1.0F, 1.0F);
         $$5.a(dpw.a.b);
         $$1.a($$3, dwu.c, $$2);
         return bqt.a;
      } else {
         return bqt.e;
      }
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return d;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpw($$0, $$1);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      bqp.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cuo> a(dsb $$0, eqk.a $$1) {
      dpg $$2 = $$1.b(etd.h);
      if ($$2 instanceof dpw $$3) {
         $$1.a(b, $$1x -> {
            for (cuj $$2x : $$3.l().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dsb a(dbx $$0, iz $$1, dsb $$2, cmw $$3) {
      cuo $$4 = $$3.eX();
      dsb $$5 = $$2;
      if ($$4.a(awx.bw) && !daa.h($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(f) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected dml g_(dsb $$0) {
      return $$0.c(c) ? dml.bc : dml.bb;
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      super.a($$0, $$1, $$2, $$3);
      dqk $$4 = $$0.a(km.Z, dqk.a);
      if (!$$4.equals(dqk.a)) {
         $$2.add(xn.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cuo($$1x.orElse(cur.qL), 1).x().e().a(n.h)));
      }
   }

   @Override
   protected void a(dbx $$0, dsb $$1, evm $$2, cno $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return $$0.c_($$1) instanceof dpw $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return cpt.a($$1.c_($$2));
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
