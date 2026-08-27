import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dbl extends czo implements ddk {
   public static final MapCodec<dbl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dbl::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dnv b = dcf.a;
   public static final dns c = dnr.c;
   private final boolean e;

   @Override
   public MapCodec<dbl> a() {
      return a;
   }

   public dbl(boolean $$0, dna.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      dks $$2 = new dks($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dks $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dks.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.c_($$2) instanceof dks $$5) {
         cwc $$6 = $$5.b();
         boolean $$7 = !axr.b($$6.m());
         dks.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dks.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.s()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dks.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.s()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dnb $$0, cxb $$1, ib $$2, cwc $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      dki $$5 = $$1.c_($$2);
      if ($$5 instanceof dks && $$3.gw()) {
         $$3.a((dks)$$5);
         return bnd.a($$1.B);
      } else {
         return bnd.d;
      }
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      dki $$3 = $$1.c_($$2);
      return $$3 instanceof dks ? ((dks)$$3).b().k() : 0;
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if ($$0.c_($$1) instanceof dks $$6) {
         cwc $$7 = $$6.b();
         if ($$4.B()) {
            $$7.b($$4.z());
         }

         if (!$$0.B) {
            if (coh.a($$4) == null) {
               $$7.a($$0.Z().b(cwx.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dks.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(cxb $$0, ib $$1, ih $$2) {
      ib.a $$3 = $$1.j();
      cwx $$4 = $$0.Z();
      int $$5 = $$4.c(cwx.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dnb $$6 = $$0.a_($$3);
         dac $$7 = $$6.b();
         if (!$$6.a(dae.kH) || !($$0.c_($$3) instanceof dks $$9) || $$9.l() != dks.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            cwc $$10 = $$9.b();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.c($$3, $$7);
            } else if ($$9.s()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.c(cwx.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
