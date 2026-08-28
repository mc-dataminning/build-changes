import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dhf extends dfi implements dje {
   public static final MapCodec<dhf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dhf::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dtu b = dhz.a;
   public static final dtr c = dtq.c;
   private final boolean e;

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   public dhf(boolean $$0, dsz.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      dqp $$2 = new dqp($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dqp $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dqp.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$1.c_($$2) instanceof dqp $$5) {
         dbv $$6 = $$5.b();
         boolean $$7 = !azk.b($$6.m());
         dqp.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dqp.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dqp.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dta $$0, dcu $$1, jd $$2, dbv $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      dqf $$5 = $$1.c_($$2);
      if ($$5 instanceof dqp && $$3.gw()) {
         $$3.a((dqp)$$5);
         return bqq.a($$1.B);
      } else {
         return bqq.e;
      }
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      dqf $$3 = $$1.c_($$2);
      return $$3 instanceof dqp ? ((dqp)$$3).b().k() : 0;
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, btl $$3, cuo $$4) {
      if ($$0.c_($$1) instanceof dqp $$6) {
         dbv $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(kq.O)) {
               $$7.a($$0.ab().b(dcq.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dqp.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(dcu $$0, jd $$1, ji $$2) {
      jd.a $$3 = $$1.j();
      dcq $$4 = $$0.ab();
      int $$5 = $$4.c(dcq.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dta $$6 = $$0.a_($$3);
         dfw $$7 = $$6.b();
         if (!$$6.a(dfy.kH) || !($$0.c_($$3) instanceof dqp $$9) || $$9.l() != dqp.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dbv $$10 = $$9.b();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.c($$3, $$7);
            } else if ($$9.u()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.c(dcq.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
