import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dgo extends der implements din {
   public static final MapCodec<dgo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dgo::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dtb b = dhi.a;
   public static final dsy c = dsx.c;
   private final boolean e;

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   public dgo(boolean $$0, dsg.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      dpx $$2 = new dpx($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dpx $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dpx.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$1.c_($$2) instanceof dpx $$5) {
         dbe $$6 = $$5.b();
         boolean $$7 = !aza.b($$6.m());
         dpx.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dpx.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dpx.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dsh $$0, dcd $$1, ja $$2, dbe $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      dpn $$5 = $$1.c_($$2);
      if ($$5 instanceof dpx && $$3.gv()) {
         $$3.a((dpx)$$5);
         return bqd.a($$1.B);
      } else {
         return bqd.e;
      }
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      dpn $$3 = $$1.c_($$2);
      return $$3 instanceof dpx ? ((dpx)$$3).b().k() : 0;
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsy $$3, cua $$4) {
      if ($$0.c_($$1) instanceof dpx $$6) {
         dbe $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(kn.O)) {
               $$7.a($$0.ab().b(dbz.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dpx.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(dcd $$0, ja $$1, jf $$2) {
      ja.a $$3 = $$1.j();
      dbz $$4 = $$0.ab();
      int $$5 = $$4.c(dbz.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dsh $$6 = $$0.a_($$3);
         dff $$7 = $$6.b();
         if (!$$6.a(dfh.kH) || !($$0.c_($$3) instanceof dpx $$9) || $$9.l() != dpx.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dbe $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dbz.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
