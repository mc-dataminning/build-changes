import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deh extends dfa implements dmb {
   public static final MapCodec<deh> a = b(deh::new);
   public static final dsu b = dst.C;

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   protected deh(dsc.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a_(dsd $$0, dbf $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.a;
   }

   @Override
   protected float d(dsd $$0, dbf $$1, iz $$2) {
      return 1.0F;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(b) ? enx.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      return this.o().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == enx.c));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   public cuq a(@Nullable cmy $$0, dca $$1, iz $$2, dsd $$3) {
      return $$0 != null && $$0.f() ? dmb.super.a($$0, $$1, $$2, $$3) : cuq.l;
   }

   @Override
   public boolean a(@Nullable cmy $$0, dbf $$1, iz $$2, dsd $$3, env $$4) {
      return $$0 != null && $$0.f() ? dmb.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
