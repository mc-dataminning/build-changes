import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dmd extends dkg implements doe {
   public static final MapCodec<dmd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dmd::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dzk<jo> b = dmy.a;
   public static final dzd c = dzc.f;
   private final boolean e;

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   public dmd(boolean $$0, dyl.d $$1) {
      super($$1);
      this.l(this.B.b().b(b, jo.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      dvw $$2 = new dvw($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dvw $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dhp $$0, jj $$1, dvw $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == dvw.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$1.c_($$2) instanceof dvw $$5) {
         dgq $$6 = $$5.a();
         boolean $$7 = !bah.b($$6.m());
         dvw.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == dvw.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dvw.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.b($$2, this);
      }
   }

   private void a(dym $$0, arn $$1, jj $$2, dgq $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      dvl $$5 = $$1.c_($$2);
      if ($$5 instanceof dvw && $$3.gF()) {
         $$3.a((dvw)$$5);
         return btq.a;
      } else {
         return btq.e;
      }
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      dvl $$3 = $$1.c_($$2);
      return $$3 instanceof dvw ? ((dvw)$$3).a().k() : 0;
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bwr $$3, cxy $$4) {
      if ($$0.c_($$1) instanceof dvw $$6) {
         dgq $$8 = $$6.a();
         if ($$0 instanceof arn $$9) {
            if (!$$4.c(kx.aa)) {
               $$8.a($$9.O().c(dhl.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(arn $$0, jj $$1, jo $$2) {
      jj.a $$3 = $$1.k();
      dhl $$4 = $$0.O();
      int $$5 = $$4.d(dhl.y);

      while ($$5-- > 0) {
         $$3.c($$2);
         dym $$6 = $$0.a_($$3);
         dku $$7 = $$6.b();
         if (!$$6.a(dkw.lj) || !($$0.c_($$3) instanceof dvw $$9) || $$9.s() != dvw.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dgq $$10 = $$9.a();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.b($$3, $$7);
            } else if ($$9.t()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.d(dhl.y), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
