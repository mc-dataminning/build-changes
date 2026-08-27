import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class cul extends cso implements cwi {
   public static final MapCodec<cul> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, cul::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dfx b = cvd.a;
   public static final dfu c = dft.c;
   private final boolean e;

   @Override
   public MapCodec<cul> a() {
      return a;
   }

   public cul(boolean $$0, dfc.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ha.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      ddj $$2 = new ddj($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof ddj $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.v() != ddj.a.a) {
               if ($$8) {
                  $$7.j();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$1.c_($$2) instanceof ddj $$5) {
         cpc $$6 = $$5.c();
         boolean $$7 = !asv.b($$6.m());
         ddj.a $$8 = $$5.v();
         boolean $$9 = $$5.i();
         if ($$8 == ddj.a.b) {
            $$5.j();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == ddj.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dfd $$0, cqb $$1, gw $$2, cpc $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      dcz $$6 = $$1.c_($$2);
      if ($$6 instanceof ddj && $$3.gp()) {
         $$3.a((ddj)$$6);
         return bhe.a($$1.B);
      } else {
         return bhe.d;
      }
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      dcz $$3 = $$1.c_($$2);
      return $$3 instanceof ddj ? ((ddj)$$3).c().k() : 0;
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      if ($$0.c_($$1) instanceof ddj $$6) {
         cpc $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (che.a($$4) == null) {
               $$7.a($$0.X().b(cpx.o));
               $$6.b(this.e);
            }

            if ($$6.v() == ddj.a.a) {
               boolean $$8 = $$0.B($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(cqb $$0, gw $$1, ha $$2) {
      gw.a $$3 = $$1.j();
      cpx $$4 = $$0.X();
      int $$5 = $$4.c(cpx.w);

      while ($$5-- > 0) {
         $$3.c($$2);
         dfd $$6 = $$0.a_($$3);
         ctc $$7 = $$6.b();
         if (!$$6.a(cte.kH) || !($$0.c_($$3) instanceof ddj $$9) || $$9.v() != ddj.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            cpc $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(cpx.w), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
