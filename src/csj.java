import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class csj extends ctc implements dab {
   public static final MapCodec<csj> a = b(csj::new);
   public static final dfu b = dft.C;

   @Override
   public MapCodec<csj> a() {
      return a;
   }

   protected csj(dfc.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean c(dfd $$0, cph $$1, gw $$2) {
      return true;
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.a;
   }

   @Override
   public float b(dfd $$0, cph $$1, gw $$2) {
      return 1.0F;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(b) ? eah.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eah.c));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public cjl a(@Nullable cca $$0, cqc $$1, gw $$2, dfd $$3) {
      return $$0 != null && $$0.f() ? dab.super.a($$0, $$1, $$2, $$3) : cjl.b;
   }

   @Override
   public boolean a(@Nullable cca $$0, cph $$1, gw $$2, dfd $$3, eaf $$4) {
      return $$0 != null && $$0.f() ? dab.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
