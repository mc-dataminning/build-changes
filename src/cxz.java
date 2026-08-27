import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class cxz extends cwc implements czy {
   public static final MapCodec<cxz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, cxz::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dkb b = cyt.a;
   public static final djy c = djx.c;
   private final boolean e;

   @Override
   public MapCodec<cxz> a() {
      return a;
   }

   public cxz(boolean $$0, djg.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      dhf $$2 = new dhf($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dhf $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.m() != dhf.a.a) {
               if ($$8) {
                  $$7.l();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$1.c_($$2) instanceof dhf $$5) {
         csq $$6 = $$5.c();
         boolean $$7 = !avl.b($$6.m());
         dhf.a $$8 = $$5.m();
         boolean $$9 = $$5.k();
         if ($$8 == dhf.a.b) {
            $$5.l();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dhf.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(djh $$0, ctp $$1, hx $$2, csq $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      dgv $$6 = $$1.c_($$2);
      if ($$6 instanceof dhf && $$3.gp()) {
         $$3.a((dhf)$$6);
         return bkb.a($$1.B);
      } else {
         return bkb.d;
      }
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      dgv $$3 = $$1.c_($$2);
      return $$3 instanceof dhf ? ((dhf)$$3).c().k() : 0;
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      if ($$0.c_($$1) instanceof dhf $$6) {
         csq $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (ckr.a($$4) == null) {
               $$7.a($$0.Z().b(ctl.p));
               $$6.b(this.e);
            }

            if ($$6.m() == dhf.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c);
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(ctp $$0, hx $$1, ic $$2) {
      hx.a $$3 = $$1.j();
      ctl $$4 = $$0.Z();
      int $$5 = $$4.c(ctl.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         djh $$6 = $$0.a_($$3);
         cwq $$7 = $$6.b();
         if (!$$6.a(cws.kH) || !($$0.c_($$3) instanceof dhf $$9) || $$9.m() != dhf.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            csq $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(ctl.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
