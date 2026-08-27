import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class czx extends cya implements dbw {
   public static final MapCodec<czx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, czx::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dlz b = dar.a;
   public static final dlw c = dlv.c;
   private final boolean e;

   @Override
   public MapCodec<czx> a() {
      return a;
   }

   public czx(boolean $$0, dle.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      djd $$2 = new djd($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof djd $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.m() != djd.a.a) {
               if ($$8) {
                  $$7.l();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if ($$1.c_($$2) instanceof djd $$5) {
         cuo $$6 = $$5.c();
         boolean $$7 = !axd.b($$6.m());
         djd.a $$8 = $$5.m();
         boolean $$9 = $$5.k();
         if ($$8 == djd.a.b) {
            $$5.l();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == djd.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dlf $$0, cvn $$1, hz $$2, cuo $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      dit $$5 = $$1.c_($$2);
      if ($$5 instanceof djd && $$3.gq()) {
         $$3.a((djd)$$5);
         return blu.a($$1.B);
      } else {
         return blu.d;
      }
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      dit $$3 = $$1.c_($$2);
      return $$3 instanceof djd ? ((djd)$$3).c().k() : 0;
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      if ($$0.c_($$1) instanceof djd $$6) {
         cuo $$7 = $$6.c();
         if ($$4.B()) {
            $$7.b($$4.z());
         }

         if (!$$0.B) {
            if (cms.a($$4) == null) {
               $$7.a($$0.Z().b(cvj.p));
               $$6.b(this.e);
            }

            if ($$6.m() == djd.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(cvn $$0, hz $$1, ie $$2) {
      hz.a $$3 = $$1.j();
      cvj $$4 = $$0.Z();
      int $$5 = $$4.c(cvj.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dlf $$6 = $$0.a_($$3);
         cyo $$7 = $$6.b();
         if (!$$6.a(cyq.kH) || !($$0.c_($$3) instanceof djd $$9) || $$9.m() != djd.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            cuo $$10 = $$9.c();
            if ($$9.l()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.c($$3, $$7);
            } else if ($$9.w()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.c(cvj.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
