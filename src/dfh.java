import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dfh extends ddk implements dhg {
   public static final MapCodec<dfh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dfh::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final drv b = dgb.a;
   public static final drs c = drr.c;
   private final boolean e;

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   public dfh(boolean $$0, dra.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dog a(io $$0, drb $$1) {
      doq $$2 = new doq($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof doq $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != doq.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$1.c_($$2) instanceof doq $$5) {
         czy $$6 = $$5.b();
         boolean $$7 = !ayy.b($$6.m());
         doq.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == doq.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == doq.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(drb $$0, dax $$1, io $$2, czy $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      dog $$5 = $$1.c_($$2);
      if ($$5 instanceof doq && $$3.gz()) {
         $$3.a((doq)$$5);
         return bpu.a($$1.B);
      } else {
         return bpu.d;
      }
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      dog $$3 = $$1.c_($$2);
      return $$3 instanceof doq ? ((doq)$$3).b().k() : 0;
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bso $$3, cto $$4) {
      if ($$0.c_($$1) instanceof doq $$6) {
         czy $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(kb.N)) {
               $$7.a($$0.aa().b(dat.p));
               $$6.b(this.e);
            }

            if ($$6.l() == doq.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(b, $$0.d().g());
   }

   private static void a(dax $$0, io $$1, it $$2) {
      io.a $$3 = $$1.j();
      dat $$4 = $$0.aa();
      int $$5 = $$4.c(dat.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         drb $$6 = $$0.a_($$3);
         ddy $$7 = $$6.b();
         if (!$$6.a(dea.kH) || !($$0.c_($$3) instanceof doq $$9) || $$9.l() != doq.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            czy $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dat.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
