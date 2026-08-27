import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class cxs extends cvv implements czr {
   public static final MapCodec<cxs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, cxs::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dju b = cym.a;
   public static final djr c = djq.c;
   private final boolean e;

   @Override
   public MapCodec<cxs> a() {
      return a;
   }

   public cxs(boolean $$0, diz.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      dgy $$2 = new dgy($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dgy $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.m() != dgy.a.a) {
               if ($$8) {
                  $$7.l();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$1.c_($$2) instanceof dgy $$5) {
         csj $$6 = $$5.c();
         boolean $$7 = !avf.b($$6.m());
         dgy.a $$8 = $$5.m();
         boolean $$9 = $$5.k();
         if ($$8 == dgy.a.b) {
            $$5.l();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dgy.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dja $$0, cti $$1, hx $$2, csj $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      dgo $$6 = $$1.c_($$2);
      if ($$6 instanceof dgy && $$3.gp()) {
         $$3.a((dgy)$$6);
         return bjv.a($$1.B);
      } else {
         return bjv.d;
      }
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      dgo $$3 = $$1.c_($$2);
      return $$3 instanceof dgy ? ((dgy)$$3).c().k() : 0;
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      if ($$0.c_($$1) instanceof dgy $$6) {
         csj $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (ckk.a($$4) == null) {
               $$7.a($$0.Z().b(cte.p));
               $$6.b(this.e);
            }

            if ($$6.m() == dgy.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(cti $$0, hx $$1, ic $$2) {
      hx.a $$3 = $$1.j();
      cte $$4 = $$0.Z();
      int $$5 = $$4.c(cte.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dja $$6 = $$0.a_($$3);
         cwj $$7 = $$6.b();
         if (!$$6.a(cwl.kH) || !($$0.c_($$3) instanceof dgy $$9) || $$9.m() != dgy.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            csj $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(cte.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
