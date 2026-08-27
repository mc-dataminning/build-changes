import com.mojang.serialization.MapCodec;

public class dfx extends cyo {
   public static final MapCodec<dfx> b = b(dfx::new);
   public static final dlw c = dlv.z;

   @Override
   protected MapCodec<? extends dfx> a() {
      return b;
   }

   protected dfx(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == ie.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dlf a(crg $$0) {
      dlf $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dlf $$0) {
      return $$0.a(atz.by);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }
}
