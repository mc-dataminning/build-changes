import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dbz extends cum implements dca {
   public static final dhz f = dhy.C;
   protected static final float g = 4.0F;
   protected static final ekn h = cva.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final div a;

   protected dbz(div $$0, dhh.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dbz> a();

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return h;
   }

   @Override
   public boolean a(dhi $$0) {
      return true;
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgm($$0, $$1);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      clj $$6 = $$3.b($$4);
      cle $$7 = $$6.d();
      cmi $$9 = $$6.d() instanceof cmi $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.gf();
      if ($$1.c_($$2) instanceof dgm $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            dgn $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.x()) {
               $$1.a(null, $$11.p(), $$11.f(), aqs.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(dls.c, $$11.p(), dls.a.a($$3, $$11.q()));
               $$3.b(arb.c.b($$7));
               return bix.a;
            } else if ($$14) {
               return bix.a;
            } else if (!this.a($$3, $$11) && $$3.gf() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bix.d;
            }
         } else {
            return !$$10 && !$$11.x() ? bix.b : bix.a;
         }
      } else {
         return bix.d;
      }
   }

   private bix a(boolean $$0) {
      return $$0 ? bix.d : bix.a;
   }

   private boolean b(cdu $$0, dgm $$1, boolean $$2) {
      dgn $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(uq.a) || $$0x.b() instanceof vy);
   }

   public abstract float g(dhi var1);

   public eju h(dhi $$0) {
      return new eju(0.5, 0.5, 0.5);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(f) ? ect.c.a(false) : super.c_($$0);
   }

   public div d() {
      return this.a;
   }

   public static div a(cva $$0) {
      div $$1;
      if ($$0 instanceof dbz) {
         $$1 = ((dbz)$$0).d();
      } else {
         $$1 = div.b;
      }

      return $$1;
   }

   public void a(cdu $$0, dgm $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(cdu $$0, dgm $$1) {
      UUID $$2 = $$1.w();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return a($$2, dff.h, dgm::a);
   }
}
