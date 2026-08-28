import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dgg extends dej implements dif {
   public static final MapCodec<dgg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dgg::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dsu b = dha.a;
   public static final dsr c = dsq.c;
   private final boolean e;

   @Override
   public MapCodec<dgg> a() {
      return a;
   }

   public dgg(boolean $$0, drz.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      dpp $$2 = new dpp($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dpp $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dpp.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$1.c_($$2) instanceof dpp $$5) {
         dax $$6 = $$5.b();
         boolean $$7 = !azt.b($$6.m());
         dpp.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dpp.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dpp.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dsa $$0, dbw $$1, iz $$2, dax $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      dpf $$5 = $$1.c_($$2);
      if ($$5 instanceof dpp && $$3.gz()) {
         $$3.a((dpp)$$5);
         return bqs.a($$1.B);
      } else {
         return bqs.e;
      }
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      dpf $$3 = $$1.c_($$2);
      return $$3 instanceof dpp ? ((dpp)$$3).b().k() : 0;
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, btn $$3, cun $$4) {
      if ($$0.c_($$1) instanceof dpp $$6) {
         dax $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(km.N)) {
               $$7.a($$0.ab().b(dbs.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dpp.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(dbw $$0, iz $$1, je $$2) {
      iz.a $$3 = $$1.j();
      dbs $$4 = $$0.ab();
      int $$5 = $$4.c(dbs.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dsa $$6 = $$0.a_($$3);
         dex $$7 = $$6.b();
         if (!$$6.a(dez.kH) || !($$0.c_($$3) instanceof dpp $$9) || $$9.l() != dpp.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dax $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dbs.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
