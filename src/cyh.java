import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class cyh extends cwk implements dag {
   public static final MapCodec<cyh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, cyh::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dkj b = czb.a;
   public static final dkg c = dkf.c;
   private final boolean e;

   @Override
   public MapCodec<cyh> a() {
      return a;
   }

   public cyh(boolean $$0, djo.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      dhn $$2 = new dhn($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dhn $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.m() != dhn.a.a) {
               if ($$8) {
                  $$7.l();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$1.c_($$2) instanceof dhn $$5) {
         csy $$6 = $$5.c();
         boolean $$7 = !avm.b($$6.m());
         dhn.a $$8 = $$5.m();
         boolean $$9 = $$5.k();
         if ($$8 == dhn.a.b) {
            $$5.l();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dhn.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(djp $$0, ctx $$1, hx $$2, csy $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      dhd $$5 = $$1.c_($$2);
      if ($$5 instanceof dhn && $$3.gp()) {
         $$3.a((dhn)$$5);
         return bkc.a($$1.B);
      } else {
         return bkc.d;
      }
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      dhd $$3 = $$1.c_($$2);
      return $$3 instanceof dhn ? ((dhn)$$3).c().k() : 0;
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if ($$0.c_($$1) instanceof dhn $$6) {
         csy $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (cla.a($$4) == null) {
               $$7.a($$0.Z().b(ctt.p));
               $$6.b(this.e);
            }

            if ($$6.m() == dhn.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c);
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(ctx $$0, hx $$1, ic $$2) {
      hx.a $$3 = $$1.j();
      ctt $$4 = $$0.Z();
      int $$5 = $$4.c(ctt.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         djp $$6 = $$0.a_($$3);
         cwy $$7 = $$6.b();
         if (!$$6.a(cxa.kH) || !($$0.c_($$3) instanceof dhn $$9) || $$9.m() != dhn.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            csy $$10 = $$9.c();
            if ($$9.l()) {
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
         int $$11 = Math.max($$4.c(ctt.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
