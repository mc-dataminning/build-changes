import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class cxy extends cwb implements czx {
   public static final MapCodec<cxy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, cxy::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dka b = cys.a;
   public static final djx c = djw.c;
   private final boolean e;

   @Override
   public MapCodec<cxy> a() {
      return a;
   }

   public cxy(boolean $$0, djf.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      dhe $$2 = new dhe($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dhe $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.m() != dhe.a.a) {
               if ($$8) {
                  $$7.l();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$1.c_($$2) instanceof dhe $$5) {
         csp $$6 = $$5.c();
         boolean $$7 = !avk.b($$6.m());
         dhe.a $$8 = $$5.m();
         boolean $$9 = $$5.k();
         if ($$8 == dhe.a.b) {
            $$5.l();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dhe.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(djg $$0, cto $$1, hx $$2, csp $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      dgu $$6 = $$1.c_($$2);
      if ($$6 instanceof dhe && $$3.gp()) {
         $$3.a((dhe)$$6);
         return bka.a($$1.B);
      } else {
         return bka.d;
      }
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      dgu $$3 = $$1.c_($$2);
      return $$3 instanceof dhe ? ((dhe)$$3).c().k() : 0;
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      if ($$0.c_($$1) instanceof dhe $$6) {
         csp $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (ckq.a($$4) == null) {
               $$7.a($$0.Z().b(ctk.p));
               $$6.b(this.e);
            }

            if ($$6.m() == dhe.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c);
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(cto $$0, hx $$1, ic $$2) {
      hx.a $$3 = $$1.j();
      ctk $$4 = $$0.Z();
      int $$5 = $$4.c(ctk.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         djg $$6 = $$0.a_($$3);
         cwp $$7 = $$6.b();
         if (!$$6.a(cwr.kH) || !($$0.c_($$3) instanceof dhe $$9) || $$9.m() != dhe.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            csp $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(ctk.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
