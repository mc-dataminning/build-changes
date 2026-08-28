import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dhh extends dfk implements djg {
   public static final MapCodec<dhh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dhh::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dtw b = dib.a;
   public static final dtt c = dts.c;
   private final boolean e;

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   public dhh(boolean $$0, dtb.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      dqr $$2 = new dqr($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dqr $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dqr.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$1.c_($$2) instanceof dqr $$5) {
         dbx $$6 = $$5.b();
         boolean $$7 = !azl.b($$6.m());
         dqr.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dqr.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dqr.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dtc $$0, dcw $$1, jd $$2, dbx $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      dqh $$5 = $$1.c_($$2);
      if ($$5 instanceof dqr && $$3.gw()) {
         $$3.a((dqr)$$5);
         return bqr.a($$1.B);
      } else {
         return bqr.e;
      }
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      dqh $$3 = $$1.c_($$2);
      return $$3 instanceof dqr ? ((dqr)$$3).b().k() : 0;
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, btn $$3, cuq $$4) {
      if ($$0.c_($$1) instanceof dqr $$6) {
         dbx $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(kq.O)) {
               $$7.a($$0.ab().b(dcs.p));
               $$6.b(this.e);
            }

            boolean $$8 = $$0.C($$1);
            $$6.a($$8);
         }
      }
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(dcw $$0, jd $$1, ji $$2) {
      jd.a $$3 = $$1.k();
      dcs $$4 = $$0.ab();
      int $$5 = $$4.c(dcs.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dtc $$6 = $$0.a_($$3);
         dfy $$7 = $$6.b();
         if (!$$6.a(dga.kH) || !($$0.c_($$3) instanceof dqr $$9) || $$9.l() != dqr.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dbx $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dcs.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
