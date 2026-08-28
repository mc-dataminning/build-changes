import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dnw extends dgh implements dnx {
   public static final dur f = duq.C;
   protected static final float g = 4.0F;
   protected static final eyx h = dgv.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dvn a;

   protected dnw(dvn $$0, dtz.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dnw> a();

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return h;
   }

   @Override
   public boolean a(dua $$0) {
      return true;
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsq($$0, $$1);
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if ($$2.c_($$3) instanceof dsq $$7) {
         cwq $$10 = $$0.h() instanceof cwq $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.go();
         if (!$$2.B) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(awn.c.b($$0.h()));
                  $$2.a(dyx.c, $$7.aD_(), dyx.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return brk.a;
               } else {
                  return brk.f;
               }
            } else {
               return brk.f;
            }
         } else {
            return !$$11 && !$$7.v() ? brk.c : brk.a;
         }
      } else {
         return brk.e;
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if ($$1.c_($$2) instanceof dsq $$5) {
         if ($$1.B) {
            ad.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aD_(), $$5.d(), awe.e);
            return brk.b;
         } else if ($$8) {
            return brk.b;
         } else if (!this.a($$3, $$5) && $$3.go() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return brk.b;
         } else {
            return brk.e;
         }
      } else {
         return brk.e;
      }
   }

   private boolean b(cnp $$0, dsq $$1, boolean $$2) {
      dsr $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.ab())).allMatch($$0x -> $$0x.equals(xc.a) || $$0x.b() instanceof yk);
   }

   public abstract float h(dua var1);

   public eye o(dua $$0) {
      return new eye(0.5, 0.5, 0.5);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(f) ? eqc.c.a(false) : super.b_($$0);
   }

   public dvn d() {
      return this.a;
   }

   public static dvn a(dgv $$0) {
      dvn $$1;
      if ($$0 instanceof dnw) {
         $$1 = ((dnw)$$0).d();
      } else {
         $$1 = dvn.b;
      }

      return $$1;
   }

   public void a(cnp $$0, dsq $$1, boolean $$2) {
      $$1.a($$0.cD());
      $$0.a($$1, $$2);
   }

   private boolean a(cnp $$0, dsq $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cD());
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return a($$2, drg.h, dsq::a);
   }
}
