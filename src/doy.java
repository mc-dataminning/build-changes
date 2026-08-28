import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class doy extends dmq {
   public static final MapCodec<doy> a = b(doy::new);
   public static final ebx b = ebw.bA;
   public static final ebx c = ebw.G;
   private static final ece<je> d = ebw.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final dev g = new dev(10);
   private static final int h = 17;

   public doy(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, je.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<doy> a() {
      return a;
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return $$1.c_($$2) instanceof dyt $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      boolean $$7 = $$0.c(c);
      dye $$8 = $$1.c_($$2);
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
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return $$0.C ? null : a($$2, dyg.Q, dyt::a);
   }

   private void a(@Nullable dye $$0, boolean $$1) {
      if ($$0 instanceof dyt $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      dyt $$2 = new dyt($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public ebg a(ddt $$0) {
      jc $$1 = $$0.d().g();

      jc $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jc.b;
      };
      return this.m().b(d, je.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bxw $$3, daa $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      bup.a($$0, $$1, $$2);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyt $$5) {
         $$3.a($$5);
      }

      return but.a;
   }

   protected void a(ebg $$0, aru $$1, iw $$2) {
      if ($$1.c_($$2) instanceof dyt $$3) {
         def var11 = $$3.aC_();
         Optional<dew<deg>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dew<deg> $$7 = $$6.get();
            daa $$8 = $$7.b().a(var11, $$1.J_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (daa $$9 : $$7.b().a(var11)) {
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

   public static Optional<dew<deg>> a(aru $$0, def $$1) {
      return g.a($$0, $$1);
   }

   private void a(aru $$0, iw $$1, dyt $$2, daa $$3, ebg $$4, dew<?> $$5) {
      jc $$6 = $$4.c(d).a();
      bum $$7 = dzh.a($$0, $$1.a($$6));
      daa $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dyt || $$3.M() > $$7.f_($$3))) {
         while (!$$8.f()) {
            daa $$9 = $$8.c(1);
            daa $$10 = dzh.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dzh.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         ffs $$12 = ffs.b($$1);
         ffs $$13 = $$12.a($$6, 0.7);
         lh.a($$0, $$8, 6, $$6, $$13);

         for (arv $$14 : $$0.a(arv.class, ffn.a($$12, 17.0, 17.0, 17.0))) {
            aq.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(d, c, b);
   }
}
