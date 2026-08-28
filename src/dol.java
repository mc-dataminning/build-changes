import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dol extends dmd {
   public static final MapCodec<dol> a = b(dol::new);
   public static final ebk b = ebj.bA;
   public static final ebk c = ebj.G;
   private static final ebr<jd> d = ebj.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final dei g = new dei(10);
   private static final int h = 17;

   public dol(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, jd.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dol> a() {
      return a;
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return $$1.c_($$2) instanceof dyg $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      boolean $$7 = $$0.c(c);
      dxr $$8 = $$1.c_($$2);
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
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return $$0.C ? null : a($$2, dxt.Q, dyg::a);
   }

   private void a(@Nullable dxr $$0, boolean $$1) {
      if ($$0 instanceof dyg $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      dyg $$2 = new dyg($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public eat a(ddg $$0) {
      jb $$1 = $$0.d().g();

      jb $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jb.b;
      };
      return this.m().b(d, jd.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, bxj $$3, czn $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyg $$5) {
         $$3.a($$5);
      }

      return bug.a;
   }

   protected void a(eat $$0, arq $$1, iv $$2) {
      if ($$1.c_($$2) instanceof dyg $$3) {
         dds var11 = $$3.ay_();
         Optional<dej<ddt>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dej<ddt> $$7 = $$6.get();
            czn $$8 = $$7.b().a(var11, $$1.F_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (czn $$9 : $$7.b().a(var11)) {
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

   public static Optional<dej<ddt>> a(arq $$0, dds $$1) {
      return g.a($$0, $$1);
   }

   private void a(arq $$0, iv $$1, dyg $$2, czn $$3, eat $$4, dej<?> $$5) {
      jb $$6 = $$4.c(d).a();
      btz $$7 = dyu.a($$0, $$1.a($$6));
      czn $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dyg || $$3.M() > $$7.f_($$3))) {
         while (!$$8.f()) {
            czn $$9 = $$8.c(1);
            czn $$10 = dyu.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dyu.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         ffc $$12 = ffc.b($$1);
         ffc $$13 = $$12.a($$6, 0.7);
         lg.a($$0, $$8, 6, $$6, $$13);

         for (arr $$14 : $$0.a(arr.class, fex.a($$12, 17.0, 17.0, 17.0))) {
            aq.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(d, c, b);
   }
}
