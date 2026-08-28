import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dmf extends djq implements drl {
   public static final MapCodec<dmf> a = b(dmf::new);
   public static final aku b = aku.b("sherds");
   public static final dyo<jn> c = dyg.T;
   public static final dyh d = dyg.bz;
   public static final dyh e = dyg.I;
   private static final fcr f = dke.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   protected dmf(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, jn.c).b(e, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g()).b(e, Boolean.valueOf($$1.a() == etx.c)).b(d, Boolean.valueOf(false));
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if ($$2.c_($$3) instanceof dvj $$7) {
         if ($$2.C) {
            return bsy.a;
         } else {
            cxh $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cxh.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dvj.a.a);
               $$4.b(awk.c.b($$0.h()));
               cxh $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, awa.gT, awb.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof ard $$13) {
                  $$13.a(lt.ba, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, ecp.c, $$3);
               return bsy.a;
            } else {
               return bsy.f;
            }
         }
      } else {
         return bsy.e;
      }
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$1.c_($$2) instanceof dvj $$5) {
         $$1.a(null, $$2, awa.gU, awb.e, 1.0F, 1.0F);
         $$5.a(dvj.a.b);
         $$1.a($$3, ecp.c, $$2);
         return bsy.a;
      } else {
         return bsy.e;
      }
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return f;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvj($$0, $$1);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      bsu.a($$0, $$1, $$2);
   }

   @Override
   protected List<cxh> a(dxq $$0, ewr.a $$1) {
      dus $$2 = $$1.b(ezi.h);
      if ($$2 instanceof dvj $$3) {
         $$1.a(b, $$1x -> {
            for (cxd $$2x : $$3.s().a()) {
               $$1x.accept($$2x.n());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dxq a(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      cxh $$4 = $$3.eZ();
      dxq $$5 = $$2;
      if ($$4.a(awy.bL) && !ddt.a($$4, aws.r)) {
         $$5 = $$2.b(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 260);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(e) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected drx h_(dxq $$0) {
      return $$0.c(d) ? drx.bd : drx.bc;
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      super.a($$0, $$1, $$2, $$3);
      dvz $$4 = $$0.a(kv.am, dvz.a);
      if (!$$4.equals(dvz.a)) {
         $$2.add(wo.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cxh($$1x.orElse(cxl.ru), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dgz $$0, dxq $$1, fbt $$2, cqk $$3) {
      ji $$4 = $$2.b();
      if ($$0 instanceof ard $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof dvj $$4) {
         dvz $$5 = $$4.s();
         return dvj.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return csw.a($$1.c_($$2));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
