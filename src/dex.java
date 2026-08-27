import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dex extends dcq {
   public static final MapCodec<dex> a = b(dex::new);
   public static final dqy b = dqx.bx;
   public static final dqy c = dqx.A;
   private static final drf<iu> d = dqx.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cxe g = new cxe(10);
   private static final int h = 17;

   public dex(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, iu.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dex> a() {
      return a;
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return $$1.c_($$2) instanceof doa $$4 ? $$4.t() : 0;
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dnm $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)), 2);
         this.a($$8, false);
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return $$0.B ? null : a($$2, dno.P, doa::a);
   }

   private void a(@Nullable dnm $$0, boolean $$1) {
      if ($$0 instanceof doa $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      doa $$2 = new doa($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dqh a(cwi $$0) {
      is $$1 = $$0.d().g();

      is $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> is.b;
      };
      return this.n().a(d, iu.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, bsa $$3, csz $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      bpi.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         dnm $$5 = $$1.c_($$2);
         if ($$5 instanceof doa) {
            $$3.a((doa)$$5);
         }

         return bpm.b;
      }
   }

   protected void a(dqh $$0, aqh $$1, in $$2) {
      if ($$1.c_($$2) instanceof doa $$3) {
         Optional<cxf<cwu>> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            cxf<cwu> $$6 = $$5.get();
            csz $$7 = $$6.b().a($$3, $$1.H_());
            if ($$7.d()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
               $$7.a($$1);
               this.a($$1, $$2, $$3, $$7, $$0, $$6);

               for (csz $$8 : $$6.b().a($$3)) {
                  if (!$$8.d()) {
                     this.a($$1, $$2, $$3, $$8, $$0, $$6);
                  }
               }

               $$3.j().forEach($$0x -> {
                  if (!$$0x.d()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<cxf<cwu>> a(dad $$0, cou $$1) {
      return g.a($$0, $$1);
   }

   private void a(aqh $$0, in $$1, doa $$2, csz $$3, dqh $$4, cxf<cwu> $$5) {
      is $$6 = $$4.c(d).a();
      bpf $$7 = dol.a($$0, $$1.a($$6));
      csz $$8 = $$3.r();
      if ($$7 != null && ($$7 instanceof doa || $$3.G() > $$7.a($$3))) {
         while (!$$8.d()) {
            csz $$9 = $$8.c(1);
            csz $$10 = dol.a($$2, $$7, $$9, $$6.g());
            if (!$$10.d()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.d()) {
            int $$11 = $$8.G();
            $$8 = dol.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.G()) {
               break;
            }
         }
      }

      if (!$$8.d()) {
         etp $$12 = etp.b($$1);
         etp $$13 = $$12.a($$6, 0.7);
         kh.a($$0, $$8, 6, $$6, $$13);

         for (aqi $$14 : $$0.a(aqi.class, etk.a($$12, 17.0, 17.0, 17.0))) {
            am.ad.a($$14, $$5.a(), $$2.j());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(d, c, b);
   }
}
