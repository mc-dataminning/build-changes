import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dgq extends det implements dip {
   public static final MapCodec<dgq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dgq::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dte b = dhk.a;
   public static final dtb c = dta.c;
   private final boolean e;

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   public dgq(boolean $$0, dsj.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      dpz $$2 = new dpz($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dpz $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dpz.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.c_($$2) instanceof dpz $$5) {
         dbg $$6 = $$5.b();
         boolean $$7 = !azd.b($$6.m());
         dpz.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dpz.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dpz.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dsk $$0, dcf $$1, ja $$2, dbg $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      dpp $$5 = $$1.c_($$2);
      if ($$5 instanceof dpz && $$3.gw()) {
         $$3.a((dpz)$$5);
         return bqg.a($$1.B);
      } else {
         return bqg.e;
      }
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      dpp $$3 = $$1.c_($$2);
      return $$3 instanceof dpz ? ((dpz)$$3).b().k() : 0;
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, btb $$3, cuc $$4) {
      if ($$0.c_($$1) instanceof dpz $$6) {
         dbg $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(kn.O)) {
               $$7.a($$0.ab().b(dcb.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dpz.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(dcf $$0, ja $$1, jf $$2) {
      ja.a $$3 = $$1.j();
      dcb $$4 = $$0.ab();
      int $$5 = $$4.c(dcb.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dsk $$6 = $$0.a_($$3);
         dfh $$7 = $$6.b();
         if (!$$6.a(dfj.kH) || !($$0.c_($$3) instanceof dpz $$9) || $$9.l() != dpz.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dbg $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dcb.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
