import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dee extends dch implements dgd {
   public static final MapCodec<dee> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dee::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dqs b = dey.a;
   public static final dqp c = dqo.c;
   private final boolean e;

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public dee(boolean $$0, dpx.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ir.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      dnn $$2 = new dnn($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dnn $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dnn.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$1.c_($$2) instanceof dnn $$5) {
         cyv $$6 = $$5.b();
         boolean $$7 = !ayr.b($$6.m());
         dnn.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dnn.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dnn.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dpy $$0, czu $$1, im $$2, cyv $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      dnd $$5 = $$1.c_($$2);
      if ($$5 instanceof dnn && $$3.gx()) {
         $$3.a((dnn)$$5);
         return boq.a($$1.B);
      } else {
         return boq.d;
      }
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      dnd $$3 = $$1.c_($$2);
      return $$3 instanceof dnn ? ((dnn)$$3).b().k() : 0;
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bre $$3, csd $$4) {
      if ($$0.c_($$1) instanceof dnn $$6) {
         cyv $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(jz.F)) {
               $$7.a($$0.aa().b(czq.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dnn.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(b, $$0.d().g());
   }

   private static void a(czu $$0, im $$1, ir $$2) {
      im.a $$3 = $$1.j();
      czq $$4 = $$0.aa();
      int $$5 = $$4.c(czq.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dpy $$6 = $$0.a_($$3);
         dcv $$7 = $$6.b();
         if (!$$6.a(dcx.kH) || !($$0.c_($$3) instanceof dnn $$9) || $$9.l() != dnn.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            cyv $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(czq.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
