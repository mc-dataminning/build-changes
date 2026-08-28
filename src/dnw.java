import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnw extends dly implements dpy {
   public static final MapCodec<dnw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dnw::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final ebm<jb> b = doq.a;
   public static final ebf c = ebe.f;
   private final boolean e;

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(boolean $$0, ean.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      dxx $$2 = new dxx($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dxx $$7) {
            this.a($$1, $$2, $$7, $$1.D($$2));
         }
      }
   }

   private void a(djh $$0, iv $$1, dxx $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == dxx.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.c_($$2) instanceof dxx $$5) {
         dii $$6 = $$5.a();
         boolean $$7 = !bal.b($$6.m());
         dxx.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == dxx.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dxx.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.b($$2, this);
      }
   }

   private void a(eao $$0, arq $$1, iv $$2, dii $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      dxm $$5 = $$1.c_($$2);
      if ($$5 instanceof dxx && $$3.gF()) {
         $$3.a((dxx)$$5);
         return bug.a;
      } else {
         return bug.e;
      }
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      dxm $$3 = $$1.c_($$2);
      return $$3 instanceof dxx ? ((dxx)$$3).a().k() : 0;
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, bxj $$3, czk $$4) {
      if ($$0.c_($$1) instanceof dxx $$6) {
         dii $$8 = $$6.a();
         if ($$0 instanceof arq $$9) {
            if (!$$4.c(kk.aa)) {
               $$8.a($$9.O().c(djd.q));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.D($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(arq $$0, iv $$1, jb $$2) {
      iv.a $$3 = $$1.k();
      djd $$4 = $$0.O();
      int $$5 = $$4.d(djd.z);

      while ($$5-- > 0) {
         $$3.c($$2);
         eao $$6 = $$0.a_($$3);
         dmm $$7 = $$6.b();
         if (!$$6.a(dmo.ln) || !($$0.c_($$3) instanceof dxx $$9) || $$9.s() != dxx.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dii $$10 = $$9.a();
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
         int $$11 = Math.max($$4.d(djd.z), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
