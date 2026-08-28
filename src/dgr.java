import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dgr extends deu implements diq {
   public static final MapCodec<dgr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dgr::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dtf b = dhl.a;
   public static final dtc c = dtb.c;
   private final boolean e;

   @Override
   public MapCodec<dgr> a() {
      return a;
   }

   public dgr(boolean $$0, dsk.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      dqa $$2 = new dqa($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dqa $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dqa.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.c_($$2) instanceof dqa $$5) {
         dbh $$6 = $$5.b();
         boolean $$7 = !azd.b($$6.m());
         dqa.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dqa.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dqa.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dsl $$0, dcg $$1, ja $$2, dbh $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      dpq $$5 = $$1.c_($$2);
      if ($$5 instanceof dqa && $$3.gx()) {
         $$3.a((dqa)$$5);
         return bqh.a($$1.B);
      } else {
         return bqh.e;
      }
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      dpq $$3 = $$1.c_($$2);
      return $$3 instanceof dqa ? ((dqa)$$3).b().k() : 0;
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, btc $$3, cud $$4) {
      if ($$0.c_($$1) instanceof dqa $$6) {
         dbh $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(kn.O)) {
               $$7.a($$0.ab().b(dcc.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dqa.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(dcg $$0, ja $$1, jf $$2) {
      ja.a $$3 = $$1.j();
      dcc $$4 = $$0.ab();
      int $$5 = $$4.c(dcc.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dsl $$6 = $$0.a_($$3);
         dfi $$7 = $$6.b();
         if (!$$6.a(dfk.kH) || !($$0.c_($$3) instanceof dqa $$9) || $$9.l() != dqa.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dbh $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dcc.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
