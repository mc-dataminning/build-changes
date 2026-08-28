import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dls extends dni implements dim, dpk {
   public static final MapCodec<dls> a = b(dls::new);
   private static final dwf c = dwe.C;
   private final dnj d = new dnj(this);

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(dvn.d $$0) {
      super($$0);
      this.l(this.m().b(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dvo> b(int $$0) {
      return $$1 -> dni.q($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvo $$0, czw $$1) {
      return !$$1.n().a(cwj.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return jm.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(c) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dvo $$0) {
      return $$0.y().c();
   }

   @Override
   public dnj c() {
      return this.d;
   }
}
