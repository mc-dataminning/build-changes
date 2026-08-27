import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class cwc extends cuf implements cya {
   public static final MapCodec<cwc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, cwc::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dhq b = cwv.a;
   public static final dhn c = dhm.c;
   private final boolean e;

   @Override
   public MapCodec<cwc> a() {
      return a;
   }

   public cwc(boolean $$0, dgv.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      dfb $$2 = new dfb($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dfb $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.v() != dfb.a.a) {
               if ($$8) {
                  $$7.j();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$1.c_($$2) instanceof dfb $$5) {
         cqt $$6 = $$5.c();
         boolean $$7 = !auc.b($$6.m());
         dfb.a $$8 = $$5.v();
         boolean $$9 = $$5.i();
         if ($$8 == dfb.a.b) {
            $$5.j();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dfb.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dgw $$0, crs $$1, ht $$2, cqt $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      der $$6 = $$1.c_($$2);
      if ($$6 instanceof dfb && $$3.gp()) {
         $$3.a((dfb)$$6);
         return biq.a($$1.B);
      } else {
         return biq.d;
      }
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      der $$3 = $$1.c_($$2);
      return $$3 instanceof dfb ? ((dfb)$$3).c().k() : 0;
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      if ($$0.c_($$1) instanceof dfb $$6) {
         cqt $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (ciu.a($$4) == null) {
               $$7.a($$0.X().b(cro.p));
               $$6.b(this.e);
            }

            if ($$6.v() == dfb.a.a) {
               boolean $$8 = $$0.B($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(crs $$0, ht $$1, hx $$2) {
      ht.a $$3 = $$1.j();
      cro $$4 = $$0.X();
      int $$5 = $$4.c(cro.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dgw $$6 = $$0.a_($$3);
         cut $$7 = $$6.b();
         if (!$$6.a(cuv.kH) || !($$0.c_($$3) instanceof dfb $$9) || $$9.v() != dfb.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            cqt $$10 = $$9.c();
            if ($$9.j()) {
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
         int $$11 = Math.max($$4.c(cro.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
