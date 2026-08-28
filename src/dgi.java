import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dgi extends del implements dih {
   public static final MapCodec<dgi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dgi::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dsw b = dhc.a;
   public static final dst c = dss.c;
   private final boolean e;

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   public dgi(boolean $$0, dsb.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      dpr $$2 = new dpr($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dpr $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dpr.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.c_($$2) instanceof dpr $$5) {
         daz $$6 = $$5.b();
         boolean $$7 = !azv.b($$6.m());
         dpr.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dpr.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dpr.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dsc $$0, dby $$1, iz $$2, daz $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      dph $$5 = $$1.c_($$2);
      if ($$5 instanceof dpr && $$3.gz()) {
         $$3.a((dpr)$$5);
         return bqu.a($$1.B);
      } else {
         return bqu.e;
      }
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      dph $$3 = $$1.c_($$2);
      return $$3 instanceof dpr ? ((dpr)$$3).b().k() : 0;
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, btp $$3, cup $$4) {
      if ($$0.c_($$1) instanceof dpr $$6) {
         daz $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(km.O)) {
               $$7.a($$0.ab().b(dbu.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dpr.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(dby $$0, iz $$1, je $$2) {
      iz.a $$3 = $$1.j();
      dbu $$4 = $$0.ab();
      int $$5 = $$4.c(dbu.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dsc $$6 = $$0.a_($$3);
         dez $$7 = $$6.b();
         if (!$$6.a(dfb.kH) || !($$0.c_($$3) instanceof dpr $$9) || $$9.l() != dpr.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            daz $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dbu.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
