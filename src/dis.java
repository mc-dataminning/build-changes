import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dis extends dgv implements dkr {
   public static final MapCodec<dis> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dis::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dvi b = djm.a;
   public static final dvf c = dve.c;
   private final boolean e;

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   public dis(boolean $$0, dun.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jj.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public drs a(je $$0, duo $$1) {
      dsc $$2 = new dsc($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dsc $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(deg $$0, je $$1, dsc $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.t() == dsc.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$1.c_($$2) instanceof dsc $$5) {
         ddg $$6 = $$5.b();
         boolean $$7 = !baa.b($$6.m());
         dsc.a $$8 = $$5.t();
         boolean $$9 = $$5.j();
         if ($$8 == dsc.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dsc.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(duo $$0, deg $$1, je $$2, ddg $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      drs $$5 = $$1.c_($$2);
      if ($$5 instanceof dsc && $$3.gz()) {
         $$3.a((dsc)$$5);
         return brp.a;
      } else {
         return brp.e;
      }
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      drs $$3 = $$1.c_($$2);
      return $$3 instanceof dsc ? ((dsc)$$3).b().k() : 0;
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, buk $$3, cvp $$4) {
      if ($$0.c_($$1) instanceof dsc $$6) {
         ddg $$8 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(kr.T)) {
               $$8.a($$0.ac().b(dec.p));
               $$6.b(this.e);
            }

            boolean $$9 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$9);
         }
      }
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c);
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(b, $$0.d().g());
   }

   private static void a(deg $$0, je $$1, jj $$2) {
      je.a $$3 = $$1.k();
      dec $$4 = $$0.ac();
      int $$5 = $$4.c(dec.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         duo $$6 = $$0.a_($$3);
         dhj $$7 = $$6.b();
         if (!$$6.a(dhl.kH) || !($$0.c_($$3) instanceof dsc $$9) || $$9.t() != dsc.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            ddg $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dec.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
