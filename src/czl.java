import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class czl extends cry implements czm {
   public static final dfq e = dfp.C;
   protected static final float f = 4.0F;
   protected static final ehw g = csl.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dgm a;

   protected czl(dey.d $$0, dgm $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return g;
   }

   @Override
   public boolean a(dez $$0) {
      return true;
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddt($$0, $$1);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      cix $$6 = $$3.b($$4);
      cis $$7 = $$6.d();
      cjw $$9 = $$6.d() instanceof cjw $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.gc();
      if ($$1.c_($$2) instanceof ddt $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            ddu $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.w()) {
               $$1.a(null, $$11.p(), aow.zP, aox.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(djj.c, $$11.p(), djj.a.a($$3, $$11.q()));
               $$3.b(apg.c.b($$7));
               return bgq.a;
            } else if ($$14) {
               return bgq.a;
            } else if (!this.a($$3, $$11) && $$3.gc() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bgq.d;
            }
         } else {
            return !$$10 && !$$11.w() ? bgq.b : bgq.a;
         }
      } else {
         return bgq.d;
      }
   }

   private bgq a(boolean $$0) {
      return $$0 ? bgq.d : bgq.a;
   }

   private boolean b(cbm $$0, ddt $$1, boolean $$2) {
      ddu $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.W())).allMatch($$0x -> $$0x.equals(te.a) || $$0x.b() instanceof uk);
   }

   public abstract float g(dez var1);

   public ehd h(dez $$0) {
      return new ehd(0.5, 0.5, 0.5);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(e) ? ead.c.a(false) : super.c_($$0);
   }

   public dgm c() {
      return this.a;
   }

   public static dgm a(csl $$0) {
      dgm $$1;
      if ($$0 instanceof czl) {
         $$1 = ((czl)$$0).c();
      } else {
         $$1 = dgm.a;
      }

      return $$1;
   }

   public void a(cbm $$0, ddt $$1, boolean $$2) {
      $$1.a($$0.cv());
      $$0.a($$1, $$2);
   }

   private boolean a(cbm $$0, ddt $$1) {
      UUID $$2 = $$1.v();
      return $$2 != null && !$$2.equals($$0.cv());
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return a($$2, dcn.h, ddt::a);
   }
}
