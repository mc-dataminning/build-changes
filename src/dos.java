import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dos extends dmd implements duc {
   public static final MapCodec<dos> a = b(dos::new);
   public static final alg b = alg.b("sherds");
   public static final ebr<jb> c = ebj.T;
   public static final ebk d = ebj.bz;
   public static final ebk e = ebj.I;
   private static final ffw f = dmr.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   protected dos(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, jb.c).b(e, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g()).b(e, Boolean.valueOf($$1.a() == exb.c)).b(d, Boolean.valueOf(false));
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if ($$2.c_($$3) instanceof dyj $$7) {
         if ($$2.C) {
            return bug.a;
         } else {
            czn $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || czn.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(dyj.a.a);
               $$4.b(awx.c.b($$0.h()));
               czn $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.k();
               }

               $$2.a(null, $$3, awn.gW, awo.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arq $$13) {
                  $$13.a(ly.ba, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, eft.c, $$3);
               return bug.a;
            } else {
               return bug.f;
            }
         }
      } else {
         return bug.e;
      }
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if ($$1.c_($$2) instanceof dyj $$5) {
         $$1.a(null, $$2, awn.gX, awo.e, 1.0F, 1.0F);
         $$5.a(dyj.a.b);
         $$1.a($$3, eft.c, $$2);
         return bug.a;
      } else {
         return bug.e;
      }
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return f;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dyj($$0, $$1);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected List<czn> a(eat $$0, ezw.a $$1) {
      dxr $$2 = $$1.b(fcn.h);
      if ($$2 instanceof dyj $$3) {
         $$1.a(b, $$1x -> {
            for (czj $$2x : $$3.s().a()) {
               $$1x.accept($$2x.m());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public eat a(djm $$0, iv $$1, eat $$2, crm $$3) {
      czn $$4 = $$3.fa();
      eat $$5 = $$2;
      if ($$4.a(axk.bM) && !dgc.a($$4, axe.r)) {
         $$5 = $$2.b(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 260);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(e) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected duo h_(eat $$0) {
      return $$0.c(d) ? duo.be : duo.bd;
   }

   @Override
   protected void a(djm $$0, eat $$1, fey $$2, csh $$3) {
      iv $$4 = $$2.b();
      if ($$0 instanceof arq $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof dyj $$4) {
         dyz $$5 = $$4.s();
         return dyj.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return cvf.a($$1.c_($$2));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
