import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class ddq extends dbt implements dfp {
   public static final MapCodec<ddq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, ddq::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dqc b = dek.a;
   public static final dpz c = dpy.c;
   private final boolean e;

   @Override
   public MapCodec<ddq> a() {
      return a;
   }

   public ddq(boolean $$0, dph.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ij.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      dmy $$2 = new dmy($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dmy $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dmy.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$1.c_($$2) instanceof dmy $$5) {
         cyh $$6 = $$5.b();
         boolean $$7 = !ayh.b($$6.m());
         dmy.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dmy.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dmy.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dpi $$0, czg $$1, id $$2, cyh $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      dmo $$5 = $$1.c_($$2);
      if ($$5 instanceof dmy && $$3.gw()) {
         $$3.a((dmy)$$5);
         return bof.a($$1.B);
      } else {
         return bof.d;
      }
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      dmo $$3 = $$1.c_($$2);
      return $$3 instanceof dmy ? ((dmy)$$3).b().k() : 0;
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqt $$3, crs $$4) {
      if ($$0.c_($$1) instanceof dmy $$6) {
         cyh $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(jr.F)) {
               $$7.a($$0.aa().b(czc.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dmy.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(b, $$0.d().g());
   }

   private static void a(czg $$0, id $$1, ij $$2) {
      id.a $$3 = $$1.j();
      czc $$4 = $$0.aa();
      int $$5 = $$4.c(czc.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dpi $$6 = $$0.a_($$3);
         dch $$7 = $$6.b();
         if (!$$6.a(dcj.kH) || !($$0.c_($$3) instanceof dmy $$9) || $$9.l() != dmy.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            cyh $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(czc.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
