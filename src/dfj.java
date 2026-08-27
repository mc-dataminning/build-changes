import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dfj extends ddm implements dhi {
   public static final MapCodec<dfj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dfj::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final drx b = dgd.a;
   public static final dru c = drt.c;
   private final boolean e;

   @Override
   public MapCodec<dfj> a() {
      return a;
   }

   public dfj(boolean $$0, drc.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public doi a(io $$0, drd $$1) {
      dos $$2 = new dos($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dos $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dos.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$1.c_($$2) instanceof dos $$5) {
         daa $$6 = $$5.b();
         boolean $$7 = !aza.b($$6.m());
         dos.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dos.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dos.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(drd $$0, daz $$1, io $$2, daa $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      doi $$5 = $$1.c_($$2);
      if ($$5 instanceof dos && $$3.gz()) {
         $$3.a((dos)$$5);
         return bpw.a($$1.B);
      } else {
         return bpw.d;
      }
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      doi $$3 = $$1.c_($$2);
      return $$3 instanceof dos ? ((dos)$$3).b().k() : 0;
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, bsq $$3, ctq $$4) {
      if ($$0.c_($$1) instanceof dos $$6) {
         daa $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(kb.N)) {
               $$7.a($$0.aa().b(dav.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dos.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c);
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(b, $$0.d().g());
   }

   private static void a(daz $$0, io $$1, it $$2) {
      io.a $$3 = $$1.j();
      dav $$4 = $$0.aa();
      int $$5 = $$4.c(dav.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         drd $$6 = $$0.a_($$3);
         dea $$7 = $$6.b();
         if (!$$6.a(dec.kH) || !($$0.c_($$3) instanceof dos $$9) || $$9.l() != dos.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            daa $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dav.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
