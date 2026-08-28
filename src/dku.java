import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dku extends dix implements dmu {
   public static final MapCodec<dku> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dku::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dxt<jn> b = dlp.a;
   public static final dxn c = dxm.g;
   private final boolean e;

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(boolean $$0, dwv.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      dui $$2 = new dui($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dui $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dgh $$0, ji $$1, dui $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == dui.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.c_($$2) instanceof dui $$5) {
         dfh $$6 = $$5.b();
         boolean $$7 = !azw.b($$6.m());
         dui.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == dui.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dui.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dww $$0, ard $$1, ji $$2, dfh $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      dty $$5 = $$1.c_($$2);
      if ($$5 instanceof dui && $$3.gG()) {
         $$3.a((dui)$$5);
         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      dty $$3 = $$1.c_($$2);
      return $$3 instanceof dui ? ((dui)$$3).b().k() : 0;
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, bvg $$3, cwo $$4) {
      if ($$0.c_($$1) instanceof dui $$6) {
         dfh $$8 = $$6.b();
         if ($$0 instanceof ard $$9) {
            if (!$$4.b(kv.Y)) {
               $$8.a($$9.O().b(dgd.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(ard $$0, ji $$1, jn $$2) {
      ji.a $$3 = $$1.k();
      dgd $$4 = $$0.O();
      int $$5 = $$4.c(dgd.y);

      while ($$5-- > 0) {
         $$3.c($$2);
         dww $$6 = $$0.a_($$3);
         djl $$7 = $$6.b();
         if (!$$6.a(djn.lj) || !($$0.c_($$3) instanceof dui $$9) || $$9.s() != dui.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dfh $$10 = $$9.b();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.c($$3, $$7);
            } else if ($$9.t()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.c(dgd.y), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
