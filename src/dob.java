import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dob extends dlm implements dtj {
   public static final MapCodec<dob> a = b(dob::new);
   public static final alg b = alg.b("sherds");
   public static final eax<ja> c = eap.T;
   public static final eaq d = eap.bz;
   public static final eaq e = eap.I;
   private static final ffc f = dma.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dob> a() {
      return a;
   }

   protected dob(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, ja.c).b(e, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g()).b(e, Boolean.valueOf($$1.a() == ewh.c)).b(d, Boolean.valueOf(false));
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if ($$2.c_($$3) instanceof dxp $$7) {
         if ($$2.C) {
            return bub.a;
         } else {
            cyy $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cyy.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dxp.a.a);
               $$4.b(awx.c.b($$0.h()));
               cyy $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, awn.gU, awo.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arq $$13) {
                  $$13.a(lx.ba, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, eez.c, $$3);
               return bub.a;
            } else {
               return bub.f;
            }
         }
      } else {
         return bub.e;
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$1.c_($$2) instanceof dxp $$5) {
         $$1.a(null, $$2, awn.gV, awo.e, 1.0F, 1.0F);
         $$5.a(dxp.a.b);
         $$1.a($$3, eez.c, $$2);
         return bub.a;
      } else {
         return bub.e;
      }
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return f;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dxp($$0, $$1);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      btx.a($$0, $$1, $$2);
   }

   @Override
   protected List<cyy> a(dzz $$0, ezc.a $$1) {
      dwx $$2 = $$1.b(fbt.h);
      if ($$2 instanceof dxp $$3) {
         $$1.a(b, $$1x -> {
            for (cyu $$2x : $$3.s().a()) {
               $$1x.accept($$2x.m());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dzz a(div $$0, iu $$1, dzz $$2, cqy $$3) {
      cyy $$4 = $$3.fa();
      dzz $$5 = $$2;
      if ($$4.a(axk.bL) && !dfn.a($$4, axe.r)) {
         $$5 = $$2.b(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 260);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(e) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected dtv h_(dzz $$0) {
      return $$0.c(d) ? dtv.bd : dtv.bc;
   }

   @Override
   protected void a(div $$0, dzz $$1, fee $$2, crs $$3) {
      iu $$4 = $$2.b();
      if ($$0 instanceof arq $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof dxp $$4) {
         dyf $$5 = $$4.s();
         return dxp.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return cuq.a($$1.c_($$2));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
