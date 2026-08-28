import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class djz extends dic implements dlx {
   public static final MapCodec<djz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, djz::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dws<jm> b = dkt.a;
   public static final dwm c = dwl.c;
   private final boolean e;

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(boolean $$0, dvu.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      dti $$2 = new dti($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dti $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dfm $$0, jh $$1, dti $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.t() == dti.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$1.c_($$2) instanceof dti $$5) {
         dem $$6 = $$5.b();
         boolean $$7 = !baj.b($$6.m());
         dti.a $$8 = $$5.t();
         boolean $$9 = $$5.j();
         if ($$8 == dti.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dti.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dvv $$0, arp $$1, jh $$2, dem $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      dsy $$5 = $$1.c_($$2);
      if ($$5 instanceof dti && $$3.gE()) {
         $$3.a((dti)$$5);
         return bsk.a;
      } else {
         return bsk.e;
      }
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      dsy $$3 = $$1.c_($$2);
      return $$3 instanceof dti ? ((dti)$$3).b().k() : 0;
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bvh $$3, cwm $$4) {
      if ($$0.c_($$1) instanceof dti $$6) {
         dem $$8 = $$6.b();
         if ($$0 instanceof arp $$9) {
            if (!$$4.b(ku.Y)) {
               $$8.a($$9.N().b(dfi.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(arp $$0, jh $$1, jm $$2) {
      jh.a $$3 = $$1.k();
      dfi $$4 = $$0.N();
      int $$5 = $$4.c(dfi.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dvv $$6 = $$0.a_($$3);
         diq $$7 = $$6.b();
         if (!$$6.a(dis.kH) || !($$0.c_($$3) instanceof dti $$9) || $$9.t() != dti.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dem $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dfi.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
