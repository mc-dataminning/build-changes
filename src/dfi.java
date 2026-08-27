import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dfi extends dgx implements dcb, diy {
   public static final MapCodec<dfi> a = b(dfi::new);
   private static final dpq c = dpp.C;
   private final dgy d = new dgy(this);

   @Override
   public MapCodec<dfi> a() {
      return a;
   }

   public dfi(doy.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<doz> b(int $$0) {
      return $$1 -> dgx.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, cuo $$1) {
      return !$$1.n().a(crm.fV) || super.a($$0, $$1);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return ih.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(c) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(doz $$0, cyd $$1, ib $$2) {
      return $$0.u().c();
   }

   @Override
   public dgy c() {
      return this.d;
   }
}
