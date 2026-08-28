import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dow extends dmo {
   public static final MapCodec<dow> a = b(dow::new);
   public static final ebv b = ebu.bA;
   public static final ebv c = ebu.G;
   private static final ecc<jd> d = ebu.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final det g = new det(10);
   private static final int h = 17;

   public dow(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, jd.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dow> a() {
      return a;
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return $$1.c_($$2) instanceof dyr $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      boolean $$7 = $$0.c(c);
      dyc $$8 = $$1.c_($$2);
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
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return $$0.C ? null : a($$2, dye.Q, dyr::a);
   }

   private void a(@Nullable dyc $$0, boolean $$1) {
      if ($$0 instanceof dyr $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      dyr $$2 = new dyr($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public ebe a(ddr $$0) {
      jb $$1 = $$0.d().g();

      jb $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jb.b;
      };
      return this.m().b(d, jd.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bxu $$3, czy $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      bun.a($$0, $$1, $$2);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyr $$5) {
         $$3.a($$5);
      }

      return bur.a;
   }

   protected void a(ebe $$0, ars $$1, iv $$2) {
      if ($$1.c_($$2) instanceof dyr $$3) {
         ded var11 = $$3.aC_();
         Optional<deu<dee>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            deu<dee> $$7 = $$6.get();
            czy $$8 = $$7.b().a(var11, $$1.J_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (czy $$9 : $$7.b().a(var11)) {
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

   public static Optional<deu<dee>> a(ars $$0, ded $$1) {
      return g.a($$0, $$1);
   }

   private void a(ars $$0, iv $$1, dyr $$2, czy $$3, ebe $$4, deu<?> $$5) {
      jb $$6 = $$4.c(d).a();
      buk $$7 = dzf.a($$0, $$1.a($$6));
      czy $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dyr || $$3.M() > $$7.f_($$3))) {
         while (!$$8.f()) {
            czy $$9 = $$8.c(1);
            czy $$10 = dzf.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dzf.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         ffq $$12 = ffq.b($$1);
         ffq $$13 = $$12.a($$6, 0.7);
         lg.a($$0, $$8, 6, $$6, $$13);

         for (art $$14 : $$0.a(art.class, ffl.a($$12, 17.0, 17.0, 17.0))) {
            aq.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(d, c, b);
   }
}
