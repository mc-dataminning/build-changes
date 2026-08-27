import javax.annotation.Nullable;

public abstract class crb extends crx {
   private final chk a;

   protected crb(chk $$0, dex.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public boolean a(dey $$0) {
      return true;
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new dca($$0, $$1, this.a);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, @Nullable biw $$3, ciw $$4) {
      if ($$0.B) {
         $$0.a($$1, dcm.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dcm.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      dck $$3 = $$0.c_($$1);
      return $$3 instanceof dca ? ((dca)$$3).f() : super.a($$0, $$1, $$2);
   }

   public chk a() {
      return this.a;
   }
}
