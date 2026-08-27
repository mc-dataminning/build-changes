import javax.annotation.Nullable;

public abstract class crc extends cry {
   private final chl a;

   protected crc(chl $$0, dey.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public boolean a(dez $$0) {
      return true;
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dcb($$0, $$1, this.a);
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, @Nullable biy $$3, cix $$4) {
      if ($$0.B) {
         $$0.a($$1, dcn.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dcn.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      dcl $$3 = $$0.c_($$1);
      return $$3 instanceof dcb ? ((dcb)$$3).f() : super.a($$0, $$1, $$2);
   }

   public chl a() {
      return this.a;
   }
}
