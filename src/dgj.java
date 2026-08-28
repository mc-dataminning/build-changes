import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dgj extends dem implements dii {
   public static final MapCodec<dgj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dgj::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dsx b = dhd.a;
   public static final dsu c = dst.c;
   private final boolean e;

   @Override
   public MapCodec<dgj> a() {
      return a;
   }

   public dgj(boolean $$0, dsc.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      dps $$2 = new dps($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dps $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dps.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.c_($$2) instanceof dps $$5) {
         dba $$6 = $$5.b();
         boolean $$7 = !azv.b($$6.m());
         dps.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dps.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dps.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dsd $$0, dbz $$1, iz $$2, dba $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      dpi $$5 = $$1.c_($$2);
      if ($$5 instanceof dps && $$3.gz()) {
         $$3.a((dps)$$5);
         return bqv.a($$1.B);
      } else {
         return bqv.e;
      }
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      dpi $$3 = $$1.c_($$2);
      return $$3 instanceof dps ? ((dps)$$3).b().k() : 0;
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, btq $$3, cuq $$4) {
      if ($$0.c_($$1) instanceof dps $$6) {
         dba $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(km.O)) {
               $$7.a($$0.ab().b(dbv.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dps.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(dbz $$0, iz $$1, je $$2) {
      iz.a $$3 = $$1.j();
      dbv $$4 = $$0.ab();
      int $$5 = $$4.c(dbv.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dsd $$6 = $$0.a_($$3);
         dfa $$7 = $$6.b();
         if (!$$6.a(dfc.kH) || !($$0.c_($$3) instanceof dps $$9) || $$9.l() != dps.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dba $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dbv.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
