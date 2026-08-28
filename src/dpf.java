import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dpf extends dmq implements dup {
   public static final MapCodec<dpf> a = b(dpf::new);
   public static final alk b = alk.b("sherds");
   public static final ece<jc> c = ebw.T;
   public static final ebx d = ebw.bz;
   public static final ebx e = ebw.I;
   private static final fgm f = dne.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dpf> a() {
      return a;
   }

   protected dpf(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, jc.c).b(e, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public ebg a(ddt $$0) {
      exq $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g()).b(e, Boolean.valueOf($$1.a() == exr.c)).b(d, Boolean.valueOf(false));
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if ($$2.c_($$3) instanceof dyw $$7) {
         if ($$2.C) {
            return but.a;
         } else {
            daa $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || daa.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dyw.a.a);
               $$4.b(axb.c.b($$0.h()));
               daa $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, awr.gW, aws.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aru $$13) {
                  $$13.a(lz.ba, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, egg.c, $$3);
               return but.a;
            } else {
               return but.f;
            }
         }
      } else {
         return but.e;
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$1.c_($$2) instanceof dyw $$5) {
         $$1.a(null, $$2, awr.gX, aws.e, 1.0F, 1.0F);
         $$5.a(dyw.a.b);
         $$1.a($$3, egg.c, $$2);
         return but.a;
      } else {
         return but.e;
      }
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return f;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyw($$0, $$1);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      bup.a($$0, $$1, $$2);
   }

   @Override
   protected List<daa> a(ebg $$0, fam.a $$1) {
      dye $$2 = $$1.b(fdd.h);
      if ($$2 instanceof dyw $$3) {
         $$1.a(b, $$1x -> {
            for (czw $$2x : $$3.s().a()) {
               $$1x.accept($$2x.m());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public ebg a(djz $$0, iw $$1, ebg $$2, crz $$3) {
      daa $$4 = $$3.fb();
      ebg $$5 = $$2;
      if ($$4.a(axo.bN) && !dgp.a($$4, axi.r)) {
         $$5 = $$2.b(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 260);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(e) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvb h_(ebg $$0) {
      return $$0.c(d) ? dvb.be : dvb.bd;
   }

   @Override
   protected void a(djz $$0, ebg $$1, ffo $$2, csu $$3) {
      iw $$4 = $$2.b();
      if ($$0 instanceof aru $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof dyw $$4) {
         dzm $$5 = $$4.s();
         return dyw.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return cvs.a($$1.c_($$2));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
