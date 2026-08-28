import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dnt extends dlm {
   public static final MapCodec<dnt> a = b(dnt::new);
   public static final eaq b = eap.bA;
   public static final eaq c = eap.G;
   private static final eax<jc> d = eap.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final ddt g = new ddt(10);
   private static final int h = 17;

   public dnt(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(d, jc.k).b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<dnt> a() {
      return a;
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return $$1.c_($$2) instanceof dxm $$4 ? $$4.s() : 0;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      boolean $$7 = $$0.c(c);
      dwx $$8 = $$1.c_($$2);
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
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return $$0.C ? null : a($$2, dwz.Q, dxm::a);
   }

   private void a(@Nullable dwx $$0, boolean $$1) {
      if ($$0 instanceof dxm $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      dxm $$2 = new dxm($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public dzz a(dcr $$0) {
      ja $$1 = $$0.d().g();

      ja $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ja.b;
      };
      return this.m().b(d, jc.a($$1, $$2)).b(c, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, bxc $$3, cyy $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      btx.a($$0, $$1, $$2);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxm $$5) {
         $$3.a($$5);
      }

      return bub.a;
   }

   protected void a(dzz $$0, arq $$1, iu $$2) {
      if ($$1.c_($$2) instanceof dxm $$3) {
         ddd var11 = $$3.ax_();
         Optional<ddu<dde>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            ddu<dde> $$7 = $$6.get();
            cyy $$8 = $$7.b().a(var11, $$1.F_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (cyy $$9 : $$7.b().a(var11)) {
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

   public static Optional<ddu<dde>> a(arq $$0, ddd $$1) {
      return g.a($$0, $$1);
   }

   private void a(arq $$0, iu $$1, dxm $$2, cyy $$3, dzz $$4, ddu<?> $$5) {
      ja $$6 = $$4.c(d).a();
      btu $$7 = dya.a($$0, $$1.a($$6));
      cyy $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof dxm || $$3.M() > $$7.f_($$3))) {
         while (!$$8.f()) {
            cyy $$9 = $$8.c(1);
            cyy $$10 = dya.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = dya.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fei $$12 = fei.b($$1);
         fei $$13 = $$12.a($$6, 0.7);
         lf.a($$0, $$8, 6, $$6, $$13);

         for (arr $$14 : $$0.a(arr.class, fed.a($$12, 17.0, 17.0, 17.0))) {
            ap.ad.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(d, c, b);
   }
}
