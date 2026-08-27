import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class czk extends crx implements czl {
   public static final dfp e = dfo.C;
   protected static final float f = 4.0F;
   protected static final ehy g = csk.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dgl a;

   protected czk(dex.d $$0, dgl $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return g;
   }

   @Override
   public boolean a(dey $$0) {
      return true;
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new dds($$0, $$1);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      ciw $$6 = $$3.b($$4);
      cir $$7 = $$6.d();
      cjv $$9 = $$6.d() instanceof cjv $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.gc();
      if ($$1.c_($$2) instanceof dds $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            ddt $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.w()) {
               $$1.a(null, $$11.p(), aou.zK, aov.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(dji.c, $$11.p(), dji.a.a($$3, $$11.q()));
               $$3.b(ape.c.b($$7));
               return bgo.a;
            } else if ($$14) {
               return bgo.a;
            } else if (!this.a($$3, $$11) && $$3.gc() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bgo.d;
            }
         } else {
            return !$$10 && !$$11.w() ? bgo.b : bgo.a;
         }
      } else {
         return bgo.d;
      }
   }

   private bgo a(boolean $$0) {
      return $$0 ? bgo.d : bgo.a;
   }

   private boolean b(cbl $$0, dds $$1, boolean $$2) {
      ddt $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.W())).allMatch($$0x -> $$0x.equals(td.a) || $$0x.b() instanceof uj);
   }

   public abstract float g(dey var1);

   public ehf h(dey $$0) {
      return new ehf(0.5, 0.5, 0.5);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(e) ? eac.c.a(false) : super.c_($$0);
   }

   public dgl c() {
      return this.a;
   }

   public static dgl a(csk $$0) {
      dgl $$1;
      if ($$0 instanceof czk) {
         $$1 = ((czk)$$0).c();
      } else {
         $$1 = dgl.a;
      }

      return $$1;
   }

   public void a(cbl $$0, dds $$1, boolean $$2) {
      $$1.a($$0.cv());
      $$0.a($$1, $$2);
   }

   private boolean a(cbl $$0, dds $$1) {
      UUID $$2 = $$1.v();
      return $$2 != null && !$$2.equals($$0.cv());
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return a($$2, dcm.h, dds::a);
   }
}
