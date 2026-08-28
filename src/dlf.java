import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlf extends diy {
   public static final MapCodec<dlf> a = b(dlf::new);
   public static final dxo b = dxn.bA;
   public static final dxo c = dxn.H;
   private static final dxu<jp> d = dxn.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final dbi g = new dbi(10);
   private static final int h = 17;

   public dlf(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jp.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dlf> a() {
      return a;
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return $$1.c_($$2) instanceof dun $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dtz $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return $$0.C ? null : a($$2, dub.Q, dun::a);
   }

   private void a(@Nullable dtz $$0, boolean $$1) {
      if ($$0 instanceof dun $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      dun $$2 = new dun($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dwx a(dag $$0) {
      jn $$1 = $$0.d().g();

      jn $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jn.b;
      };
      return this.m().b(d, jp.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, bvg $$3, cwp $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      bsf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dun $$5) {
         $$3.a($$5);
      }

      return bsj.a;
   }

   protected void a(dwx $$0, arc $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dun $$3) {
         das var11 = $$3.aB_();
         Optional<dbj<dat>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dbj<dat> $$7 = $$6.get();
            cwp $$8 = $$7.b().a(var11, $$1.K_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cwp $$9 : $$7.b().a(var11)) {
                  if (!$$9.f()) {
                     this.a($$1, $$2, $$3, $$9, $$0, $$7);
                  }
               }

               $$3.f().forEach($$0x -> {
                  if (!$$0x.f()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<dbj<dat>> a(arc $$0, das $$1) {
      return g.a($$0, $$1);
   }

   private void a(arc $$0, ji $$1, dun $$2, cwp $$3, dwx $$4, dbj<?> $$5) {
      jn $$6 = $$4.c(d).a();
      bsc $$7 = dvb.a($$0, $$1.a($$6));
      cwp $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dun || $$3.M() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cwp $$9 = $$8.c(1);
            cwp $$10 = dvb.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dvb.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fba $$12 = fba.b($$1);
         fba $$13 = $$12.a($$6, 0.7);
         lb.a($$0, $$8, 6, $$6, $$13);

         for (ard $$14 : $$0.a(ard.class, fav.a($$12, 17.0, 17.0, 17.0))) {
            ap.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(d, c, b);
   }
}
