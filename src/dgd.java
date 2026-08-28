import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dgd extends deg implements dic {
   public static final MapCodec<dgd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dgd::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dsr b = dgx.a;
   public static final dso c = dsn.c;
   private final boolean e;

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   public dgd(boolean $$0, drw.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      dpm $$2 = new dpm($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dpm $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dpm.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$1.c_($$2) instanceof dpm $$5) {
         dau $$6 = $$5.b();
         boolean $$7 = !azq.b($$6.m());
         dpm.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dpm.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dpm.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(drx $$0, dbt $$1, iz $$2, dau $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      dpc $$5 = $$1.c_($$2);
      if ($$5 instanceof dpm && $$3.gz()) {
         $$3.a((dpm)$$5);
         return bqp.a($$1.B);
      } else {
         return bqp.e;
      }
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      dpc $$3 = $$1.c_($$2);
      return $$3 instanceof dpm ? ((dpm)$$3).b().k() : 0;
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, btk $$3, cuk $$4) {
      if ($$0.c_($$1) instanceof dpm $$6) {
         dau $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(km.N)) {
               $$7.a($$0.ab().b(dbp.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dpm.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c);
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(b, $$0.d().g());
   }

   private static void a(dbt $$0, iz $$1, je $$2) {
      iz.a $$3 = $$1.j();
      dbp $$4 = $$0.ab();
      int $$5 = $$4.c(dbp.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         drx $$6 = $$0.a_($$3);
         deu $$7 = $$6.b();
         if (!$$6.a(dew.kH) || !($$0.c_($$3) instanceof dpm $$9) || $$9.l() != dpm.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dau $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dbp.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
