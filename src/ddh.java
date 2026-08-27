import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class ddh extends dbk implements dfg {
   public static final MapCodec<ddh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, ddh::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dpt b = deb.a;
   public static final dpq c = dpp.c;
   private final boolean e;

   @Override
   public MapCodec<ddh> a() {
      return a;
   }

   public ddh(boolean $$0, doy.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      dmp $$2 = new dmp($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dmp $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dmp.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$1.c_($$2) instanceof dmp $$5) {
         cxy $$6 = $$5.b();
         boolean $$7 = !ayf.b($$6.m());
         dmp.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dmp.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dmp.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(doz $$0, cyx $$1, ib $$2, cxy $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      dmf $$5 = $$1.c_($$2);
      if ($$5 instanceof dmp && $$3.gw()) {
         $$3.a((dmp)$$5);
         return boa.a($$1.B);
      } else {
         return boa.d;
      }
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      dmf $$3 = $$1.c_($$2);
      return $$3 instanceof dmp ? ((dmp)$$3).b().k() : 0;
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bqo $$3, crj $$4) {
      if ($$0.c_($$1) instanceof dmp $$6) {
         cxy $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(jp.F)) {
               $$7.a($$0.aa().b(cyt.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dmp.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected did b_(doz $$0) {
      return did.c;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c);
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(b, $$0.d().g());
   }

   private static void a(cyx $$0, ib $$1, ih $$2) {
      ib.a $$3 = $$1.j();
      cyt $$4 = $$0.aa();
      int $$5 = $$4.c(cyt.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         doz $$6 = $$0.a_($$3);
         dby $$7 = $$6.b();
         if (!$$6.a(dca.kH) || !($$0.c_($$3) instanceof dmp $$9) || $$9.l() != dmp.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            cxy $$10 = $$9.b();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.c($$3, $$7);
            } else if ($$9.t()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.c(cyt.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
