import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class cvj extends ctm implements cxg {
   public static final MapCodec<cvj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, cvj::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dgv b = cwb.a;
   public static final dgs c = dgr.c;
   private final boolean e;

   @Override
   public MapCodec<cvj> a() {
      return a;
   }

   public cvj(boolean $$0, dga.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      deh $$2 = new deh($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof deh $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.v() != deh.a.a) {
               if ($$8) {
                  $$7.j();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$1.c_($$2) instanceof deh $$5) {
         cqa $$6 = $$5.c();
         boolean $$7 = !ats.b($$6.m());
         deh.a $$8 = $$5.v();
         boolean $$9 = $$5.i();
         if ($$8 == deh.a.b) {
            $$5.j();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == deh.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dgb $$0, cqz $$1, ht $$2, cqa $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ddx $$6 = $$1.c_($$2);
      if ($$6 instanceof deh && $$3.gp()) {
         $$3.a((deh)$$6);
         return bib.a($$1.B);
      } else {
         return bib.d;
      }
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      ddx $$3 = $$1.c_($$2);
      return $$3 instanceof deh ? ((deh)$$3).c().k() : 0;
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      if ($$0.c_($$1) instanceof deh $$6) {
         cqa $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (cic.a($$4) == null) {
               $$7.a($$0.X().b(cqv.o));
               $$6.b(this.e);
            }

            if ($$6.v() == deh.a.a) {
               boolean $$8 = $$0.B($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(cqz $$0, ht $$1, hx $$2) {
      ht.a $$3 = $$1.j();
      cqv $$4 = $$0.X();
      int $$5 = $$4.c(cqv.w);

      while ($$5-- > 0) {
         $$3.c($$2);
         dgb $$6 = $$0.a_($$3);
         cua $$7 = $$6.b();
         if (!$$6.a(cuc.kH) || !($$0.c_($$3) instanceof deh $$9) || $$9.v() != deh.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            cqa $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(cqv.w), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
