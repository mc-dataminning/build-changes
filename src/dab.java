import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dab extends cye implements dca {
   public static final MapCodec<dab> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dab::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dmd b = dav.a;
   public static final dma c = dlz.c;
   private final boolean e;

   @Override
   public MapCodec<dab> a() {
      return a;
   }

   public dab(boolean $$0, dli.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      djh $$2 = new djh($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof djh $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.m() != djh.a.a) {
               if ($$8) {
                  $$7.l();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$1.c_($$2) instanceof djh $$5) {
         cus $$6 = $$5.c();
         boolean $$7 = !axd.b($$6.m());
         djh.a $$8 = $$5.m();
         boolean $$9 = $$5.k();
         if ($$8 == djh.a.b) {
            $$5.l();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == djh.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dlj $$0, cvr $$1, hz $$2, cus $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      dix $$5 = $$1.c_($$2);
      if ($$5 instanceof djh && $$3.gq()) {
         $$3.a((djh)$$5);
         return blw.a($$1.B);
      } else {
         return blw.d;
      }
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      dix $$3 = $$1.c_($$2);
      return $$3 instanceof djh ? ((djh)$$3).c().k() : 0;
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if ($$0.c_($$1) instanceof djh $$6) {
         cus $$7 = $$6.c();
         if ($$4.B()) {
            $$7.b($$4.z());
         }

         if (!$$0.B) {
            if (cmw.a($$4) == null) {
               $$7.a($$0.Z().b(cvn.p));
               $$6.b(this.e);
            }

            if ($$6.m() == djh.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(cvr $$0, hz $$1, ie $$2) {
      hz.a $$3 = $$1.j();
      cvn $$4 = $$0.Z();
      int $$5 = $$4.c(cvn.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dlj $$6 = $$0.a_($$3);
         cys $$7 = $$6.b();
         if (!$$6.a(cyu.kH) || !($$0.c_($$3) instanceof djh $$9) || $$9.m() != djh.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            cus $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(cvn.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
