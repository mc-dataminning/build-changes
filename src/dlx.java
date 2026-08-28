import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlx extends djq {
   public static final MapCodec<dlx> a = b(dlx::new);
   public static final dyh b = dyg.bA;
   public static final dyh c = dyg.G;
   private static final dyo<jp> d = dyg.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final dbz g = new dbz(10);
   private static final int h = 17;

   public dlx(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(d, jp.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dlx> a() {
      return a;
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return $$1.c_($$2) instanceof dvg $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dus $$8 = $$1.c_($$2);
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
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return $$0.C ? null : a($$2, duu.Q, dvg::a);
   }

   private void a(@Nullable dus $$0, boolean $$1) {
      if ($$0 instanceof dvg $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      dvg $$2 = new dvg($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dxq a(dax $$0) {
      jn $$1 = $$0.d().g();

      jn $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jn.b;
      };
      return this.m().b(d, jp.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bvy $$3, cxh $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      bsu.a($$0, $$1, $$2);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvg $$5) {
         $$3.a($$5);
      }

      return bsy.a;
   }

   protected void a(dxq $$0, ard $$1, ji $$2) {
      if ($$1.c_($$2) instanceof dvg $$3) {
         dbj var11 = $$3.aB_();
         Optional<dca<dbk>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dca<dbk> $$7 = $$6.get();
            cxh $$8 = $$7.b().a(var11, $$1.F_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cxh $$9 : $$7.b().a(var11)) {
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

   public static Optional<dca<dbk>> a(ard $$0, dbj $$1) {
      return g.a($$0, $$1);
   }

   private void a(ard $$0, ji $$1, dvg $$2, cxh $$3, dxq $$4, dca<?> $$5) {
      jn $$6 = $$4.c(d).a();
      bsr $$7 = dvu.a($$0, $$1.a($$6));
      cxh $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dvg || $$3.M() > $$7.e_($$3))) {
         while (!$$8.f()) {
            cxh $$9 = $$8.c(1);
            cxh $$10 = dvu.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dvu.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fbx $$12 = fbx.b($$1);
         fbx $$13 = $$12.a($$6, 0.7);
         lb.a($$0, $$8, 6, $$6, $$13);

         for (are $$14 : $$0.a(are.class, fbs.a($$12, 17.0, 17.0, 17.0))) {
            ap.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(d, c, b);
   }
}
