import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class djc extends dgv {
   public static final MapCodec<djc> a = b(djc::new);
   public static final dvf b = dve.bx;
   public static final dvf c = dve.A;
   private static final dvm<jl> d = dve.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final dai g = new dai(10);
   private static final int h = 17;

   public djc(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jl.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<djc> a() {
      return a;
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      return $$1.c_($$2) instanceof dsg $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      drs $$8 = $$1.c_($$2);
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
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return $$0.B ? null : a($$2, dru.P, dsg::a);
   }

   private void a(@Nullable drs $$0, boolean $$1) {
      if ($$0 instanceof dsg $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public drs a(je $$0, duo $$1) {
      dsg $$2 = new dsg($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public duo a(czk $$0) {
      jj $$1 = $$0.d().g();

      jj $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jj.b;
      };
      return this.o().b(d, jl.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, buk $$3, cvp $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      brl.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dsg $$5) {
         $$3.a($$5);
      }

      return brp.a;
   }

   protected void a(duo $$0, arh $$1, je $$2) {
      if ($$1.c_($$2) instanceof dsg $$3) {
         czw var11 = $$3.aC_();
         Optional<daj<czx>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            daj<czx> $$7 = $$6.get();
            cvp $$8 = $$7.b().a(var11, $$1.F_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cvp $$9 : $$7.b().a(var11)) {
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

   public static Optional<daj<czx>> a(deg $$0, czw $$1) {
      return g.a($$0, $$1);
   }

   private void a(arh $$0, je $$1, dsg $$2, cvp $$3, duo $$4, daj<czx> $$5) {
      jj $$6 = $$4.c(d).a();
      bri $$7 = dst.a($$0, $$1.a($$6));
      cvp $$8 = $$3.u();
      if ($$7 != null && ($$7 instanceof dsg || $$3.J() > $$7.f_($$3))) {
         while (!$$8.f()) {
            cvp $$9 = $$8.c(1);
            cvp $$10 = dst.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.J();
            $$8 = dst.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.J()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         eys $$12 = eys.b($$1);
         eys $$13 = $$12.a($$6, 0.7);
         kx.a($$0, $$8, 6, $$6, $$13);

         for (ari $$14 : $$0.a(ari.class, eyn.a($$12, 17.0, 17.0, 17.0))) {
            an.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(d, c, b);
   }
}
