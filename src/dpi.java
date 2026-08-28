import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpi extends dna {
   public static final MapCodec<dpi> a = b(dpi::new);
   public static final ech b = ecg.bA;
   public static final ech c = ecg.G;
   private static final eco<je> d = ecg.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final dff g = new dff(10);
   private static final int h = 17;

   public dpi(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, je.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dpi> a() {
      return a;
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return $$1.c_($$2) instanceof dzd $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      boolean $$7 = $$0.c(c);
      dyo $$8 = $$1.c_($$2);
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
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return $$0.C ? null : a($$2, dyq.Q, dzd::a);
   }

   private void a(@Nullable dyo $$0, boolean $$1) {
      if ($$0 instanceof dzd $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      dzd $$2 = new dzd($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public ebq a(ded $$0) {
      jc $$1 = $$0.d().g();

      jc $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jc.b;
      };
      return this.m().b(d, je.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, byf $$3, dak $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      buy.a($$0, $$1, $$2);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dzd $$5) {
         $$3.a($$5);
      }

      return bvc.a;
   }

   protected void a(ebq $$0, asb $$1, iw $$2) {
      if ($$1.c_($$2) instanceof dzd $$3) {
         dep var11 = $$3.aD_();
         Optional<dfg<deq>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dfg<deq> $$7 = $$6.get();
            dak $$8 = $$7.b().a(var11, $$1.J_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (dak $$9 : $$7.b().a(var11)) {
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

   public static Optional<dfg<deq>> a(asb $$0, dep $$1) {
      return g.a($$0, $$1);
   }

   private void a(asb $$0, iw $$1, dzd $$2, dak $$3, ebq $$4, dfg<?> $$5) {
      jc $$6 = $$4.c(d).a();
      buv $$7 = dzr.a($$0, $$1.a($$6));
      dak $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dzd || $$3.M() > $$7.f_($$3))) {
         while (!$$8.f()) {
            dak $$9 = $$8.c(1);
            dak $$10 = dzr.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dzr.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fgc $$12 = fgc.b($$1);
         fgc $$13 = $$12.a($$6, 0.7);
         lh.a($$0, $$8, 6, $$6, $$13);

         for (asc $$14 : $$0.a(asc.class, ffx.a($$12, 17.0, 17.0, 17.0))) {
            aq.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(d, c, b);
   }
}
