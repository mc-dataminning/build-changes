import javax.annotation.Nullable;

public class cru extends csm implements czn {
   public static final dfr a = dfq.C;

   protected cru(dez.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public boolean c(dfa $$0, cos $$1, gu $$2) {
      return true;
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.a;
   }

   @Override
   public float b(dfa $$0, cos $$1, gu $$2) {
      return 1.0F;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(a) ? eae.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().b_($$0.a()).a() == eae.c));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   @Override
   public ciy a(@Nullable cbn $$0, cpn $$1, gu $$2, dfa $$3) {
      return $$0 != null && $$0.f() ? czn.super.a($$0, $$1, $$2, $$3) : ciy.b;
   }

   @Override
   public boolean a(@Nullable cbn $$0, cos $$1, gu $$2, dfa $$3, eac $$4) {
      return $$0 != null && $$0.f() ? czn.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
