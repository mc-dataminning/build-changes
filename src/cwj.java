import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class cwj extends cum implements cyi {
   public static final MapCodec<cwj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, cwj::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dic b = cxd.a;
   public static final dhz c = dhy.c;
   private final boolean e;

   @Override
   public MapCodec<cwj> a() {
      return a;
   }

   public cwj(boolean $$0, dhh.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      dfn $$2 = new dfn($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dfn $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.d();
            $$7.a($$8);
            if (!$$9 && !$$7.f() && $$7.v() != dfn.a.a) {
               if ($$8) {
                  $$7.j();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$1.c_($$2) instanceof dfn $$5) {
         crb $$6 = $$5.c();
         boolean $$7 = !auh.b($$6.m());
         dfn.a $$8 = $$5.v();
         boolean $$9 = $$5.i();
         if ($$8 == dfn.a.b) {
            $$5.j();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }

            if ($$5.d() || $$5.f()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dfn.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.w()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dhi $$0, csa $$1, ht $$2, crb $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      dfd $$6 = $$1.c_($$2);
      if ($$6 instanceof dfn && $$3.gq()) {
         $$3.a((dfn)$$6);
         return bix.a($$1.B);
      } else {
         return bix.d;
      }
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      dfd $$3 = $$1.c_($$2);
      return $$3 instanceof dfn ? ((dfn)$$3).c().k() : 0;
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, blg $$3, clj $$4) {
      if ($$0.c_($$1) instanceof dfn $$6) {
         crb $$7 = $$6.c();
         if ($$4.A()) {
            $$7.b($$4.y());
         }

         if (!$$0.B) {
            if (cjc.a($$4) == null) {
               $$7.a($$0.Y().b(crw.p));
               $$6.b(this.e);
            }

            if ($$6.v() == dfn.a.a) {
               boolean $$8 = $$0.B($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(csa $$0, ht $$1, hx $$2) {
      ht.a $$3 = $$1.j();
      crw $$4 = $$0.Y();
      int $$5 = $$4.c(crw.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dhi $$6 = $$0.a_($$3);
         cva $$7 = $$6.b();
         if (!$$6.a(cvc.kH) || !($$0.c_($$3) instanceof dfn $$9) || $$9.v() != dfn.a.a) {
            break;
         }

         if ($$9.d() || $$9.f()) {
            crb $$10 = $$9.c();
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
         int $$11 = Math.max($$4.c(crw.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
