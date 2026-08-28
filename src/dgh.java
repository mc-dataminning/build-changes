import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dgh extends dek implements dig {
   public static final MapCodec<dgh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dgh::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dsv b = dhb.a;
   public static final dss c = dsr.c;
   private final boolean e;

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   public dgh(boolean $$0, dsa.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      dpq $$2 = new dpq($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dpq $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dpq.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$1.c_($$2) instanceof dpq $$5) {
         day $$6 = $$5.b();
         boolean $$7 = !azu.b($$6.m());
         dpq.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dpq.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dpq.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dsb $$0, dbx $$1, iz $$2, day $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      dpg $$5 = $$1.c_($$2);
      if ($$5 instanceof dpq && $$3.gz()) {
         $$3.a((dpq)$$5);
         return bqt.a($$1.B);
      } else {
         return bqt.e;
      }
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      dpg $$3 = $$1.c_($$2);
      return $$3 instanceof dpq ? ((dpq)$$3).b().k() : 0;
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, bto $$3, cuo $$4) {
      if ($$0.c_($$1) instanceof dpq $$6) {
         day $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(km.O)) {
               $$7.a($$0.ab().b(dbt.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dpq.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(dbx $$0, iz $$1, je $$2) {
      iz.a $$3 = $$1.j();
      dbt $$4 = $$0.ab();
      int $$5 = $$4.c(dbt.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dsb $$6 = $$0.a_($$3);
         dey $$7 = $$6.b();
         if (!$$6.a(dfa.kH) || !($$0.c_($$3) instanceof dpq $$9) || $$9.l() != dpq.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            day $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dbt.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
