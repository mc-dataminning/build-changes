import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyj extends cwc {
   public static final MapCodec<cyj> a = b(cyj::new);
   public static final djy b = djx.bx;
   public static final djy c = djx.A;
   private static final dkf<ie> d = djx.T;
   private static final int e = 6;
   private static final int f = 4;
   private static final cqd g = new cqd(10);

   public cyj(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ie.k).a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected MapCodec<cyj> a() {
      return a;
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return $$1.c_($$2) instanceof dhj $$4 ? $$4.w() : 0;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      boolean $$7 = $$0.c(c);
      dgv $$8 = $$1.c_($$2);
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
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return $$0.B ? null : a($$2, dgx.P, dhj::a);
   }

   private void a(@Nullable dgv $$0, boolean $$1) {
      if ($$0 instanceof dhj $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      dhj $$2 = new dhj($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public djh a(cph $$0) {
      ic $$1 = $$0.d().g();

      ic $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> ic.b;
      };
      return this.o().a(d, ie.a($$1, $$2)).a(c, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      if ($$4.A() && $$0.c_($$1) instanceof dhj $$5) {
         $$5.a($$4.y());
      }

      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      bjx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         dgv $$6 = $$1.c_($$2);
         if ($$6 instanceof dhj) {
            $$3.a((dhj)$$6);
         }

         return bkb.b;
      }
   }

   protected void a(djh $$0, and $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dhj $$3) {
         Optional<cpt> $$5 = a($$1, $$3);
         if ($$5.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            $$3.d(6);
            $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
            cpt $$6 = $$5.get();
            cmy $$7 = $$6.a($$3, $$1.I_());
            $$7.a($$1);
            this.a($$1, $$2, $$3, $$7, $$0);
            $$6.a($$3).forEach($$4x -> this.a($$1, $$2, $$3, $$4x, $$0));
            $$3.k().forEach($$0x -> {
               if (!$$0x.b()) {
                  $$0x.h(1);
               }
            });
            $$3.e();
         }
      }
   }

   public static Optional<cpt> a(ctp $$0, cir $$1) {
      return g.a($$0, $$1);
   }

   private void a(ctp $$0, hx $$1, dhj $$2, cmy $$3, djh $$4) {
      ic $$5 = $$4.c(d).a();
      bju $$6 = dhu.a($$0, $$1.a($$5));
      cmy $$7 = $$3.p();
      if ($$6 != null && ($$6 instanceof dhj || $$3.L() > $$6.ak_())) {
         while (!$$7.b()) {
            cmy $$8 = $$7.c(1);
            cmy $$9 = dhu.a($$2, $$6, $$8, $$5.g());
            if (!$$9.b()) {
               break;
            }

            $$7.h(1);
         }
      } else if ($$6 != null) {
         while (!$$7.b()) {
            int $$10 = $$7.L();
            $$7 = dhu.a($$2, $$6, $$7, $$5.g());
            if ($$10 == $$7.L()) {
               break;
            }
         }
      }

      if (!$$7.b()) {
         elt $$11 = elt.b($$1).a($$5, 0.7);
         ji.a($$0, $$7, 6, $$5, $$11);
         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$5.d());
      }
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.c;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(d, c, b);
   }
}
