import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class czm extends crz implements czn {
   public static final dfr e = dfq.C;
   protected static final float f = 4.0F;
   protected static final ehx g = csm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dgn a;

   protected czm(dez.d $$0, dgn $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return g;
   }

   @Override
   public boolean a(dfa $$0) {
      return true;
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddu($$0, $$1);
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      ciy $$6 = $$3.b($$4);
      cit $$7 = $$6.d();
      cjx $$9 = $$6.d() instanceof cjx $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.gc();
      if ($$1.c_($$2) instanceof ddu $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            ddv $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.w()) {
               $$1.a(null, $$11.p(), aow.zK, aox.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(djk.c, $$11.p(), djk.a.a($$3, $$11.q()));
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

   private boolean b(cbn $$0, ddu $$1, boolean $$2) {
      ddv $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.W())).allMatch($$0x -> $$0x.equals(te.a) || $$0x.b() instanceof uk);
   }

   public abstract float g(dfa var1);

   public ehe h(dfa $$0) {
      return new ehe(0.5, 0.5, 0.5);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(e) ? eae.c.a(false) : super.c_($$0);
   }

   public dgn c() {
      return this.a;
   }

   public static dgn a(csm $$0) {
      dgn $$1;
      if ($$0 instanceof czm) {
         $$1 = ((czm)$$0).c();
      } else {
         $$1 = dgn.a;
      }

      return $$1;
   }

   public void a(cbn $$0, ddu $$1, boolean $$2) {
      $$1.a($$0.cv());
      $$0.a($$1, $$2);
   }

   private boolean a(cbn $$0, ddu $$1) {
      UUID $$2 = $$1.v();
      return $$2 != null && !$$2.equals($$0.cv());
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return a($$2, dco.h, ddu::a);
   }
}
