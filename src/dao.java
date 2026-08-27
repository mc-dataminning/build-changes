import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dao extends cyr implements dcn {
   public static final MapCodec<dao> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dao::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dmy b = dbi.a;
   public static final dmv c = dmu.c;
   private final boolean e;

   @Override
   public MapCodec<dao> a() {
      return a;
   }

   public dao(boolean $$0, dmd.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      djv $$2 = new djv($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof djv $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != djv.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$1.c_($$2) instanceof djv $$5) {
         cvf $$6 = $$5.b();
         boolean $$7 = !axh.b($$6.m());
         djv.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == djv.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.s()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == djv.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.s()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dme $$0, cwe $$1, ib $$2, cvf $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      djl $$5 = $$1.c_($$2);
      if ($$5 instanceof djv && $$3.gs()) {
         $$3.a((djv)$$5);
         return bml.a($$1.B);
      } else {
         return bml.d;
      }
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      djl $$3 = $$1.c_($$2);
      return $$3 instanceof djv ? ((djv)$$3).b().k() : 0;
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if ($$0.c_($$1) instanceof djv $$6) {
         cvf $$7 = $$6.b();
         if ($$4.B()) {
            $$7.b($$4.z());
         }

         if (!$$0.B) {
            if (cnl.a($$4) == null) {
               $$7.a($$0.Z().b(cwa.p));
               $$6.b(this.e);
            }

            if ($$6.l() == djv.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(cwe $$0, ib $$1, ih $$2) {
      ib.a $$3 = $$1.j();
      cwa $$4 = $$0.Z();
      int $$5 = $$4.c(cwa.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dme $$6 = $$0.a_($$3);
         czf $$7 = $$6.b();
         if (!$$6.a(czh.kH) || !($$0.c_($$3) instanceof djv $$9) || $$9.l() != djv.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            cvf $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(cwa.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
