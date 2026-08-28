import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dgx extends dej implements dly {
   public static final MapCodec<dgx> a = b(dgx::new);
   public static final ale b = new ale("sherds");
   private static final ewi d = dex.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dsu e = dsq.R;
   public static final dsr c = dsq.bw;
   private static final dsr f = dsq.C;

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   protected dgx(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, je.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == enu.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if ($$2.c_($$3) instanceof dpv $$7) {
         if ($$2.B) {
            return bqu.b;
         } else {
            cun $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || cun.c($$9, $$0) && $$9.I() < $$9.j())) {
               $$7.a(dpv.a.a);
               $$4.b(awj.c.b($$0.g()));
               cun $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
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
               $$2.a($$4, dwt.c, $$3);
               return bqu.a;
            } else {
               return bqu.d;
            }
         }
      } else {
         return bqu.e;
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.c_($$2) instanceof dpv $$5) {
         $$1.a(null, $$2, avz.gz, awa.e, 1.0F, 1.0F);
         $$5.a(dpv.a.b);
         $$1.a($$3, dwt.c, $$2);
         return bqs.a;
      } else {
         return bqs.e;
      }
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return d;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpv($$0, $$1);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      bqo.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cun> a(dsa $$0, eqj.a $$1) {
      dpf $$2 = $$1.b(etc.h);
      if ($$2 instanceof dpv $$3) {
         $$1.a(b, $$1x -> {
            for (cui $$2x : $$3.l().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dsa a(dbw $$0, iz $$1, dsa $$2, cmv $$3) {
      cun $$4 = $$3.eX();
      dsa $$5 = $$2;
      if ($$4.a(awx.bw) && !czz.h($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(f) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected dmk g_(dsa $$0) {
      return $$0.c(c) ? dmk.bc : dmk.bb;
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      super.a($$0, $$1, $$2, $$3);
      dqj $$4 = $$0.a(km.Y, dqj.a);
      if (!$$4.equals(dqj.a)) {
         $$2.add(xn.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cun($$1x.orElse(cuq.qL), 1).x().e().a(n.h)));
      }
   }

   @Override
   protected void a(dbw $$0, dsa $$1, evl $$2, cnn $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return $$0.c_($$1) instanceof dpv $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return cps.a($$1.c_($$2));
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
