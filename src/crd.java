import javax.annotation.Nullable;

public abstract class crd extends crz {
   private final chm a;

   protected crd(chm $$0, dez.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public boolean a(dfa $$0) {
      return true;
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dcc($$0, $$1, this.a);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, @Nullable biy $$3, ciy $$4) {
      if ($$0.B) {
         $$0.a($$1, dco.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dco.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      dcm $$3 = $$0.c_($$1);
      return $$3 instanceof dcc ? ((dcc)$$3).f() : super.a($$0, $$1, $$2);
   }

   public chm a() {
      return this.a;
   }
}
