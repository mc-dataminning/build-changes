import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ddw extends dem implements cts {
   public static final dsu a = dst.w;
   private final dmc.a b;

   public ddw(dmc.a $$0, dsc.d $$1) {
      super($$1);
      this.b = $$0;
      this.k(this.E.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends ddw> a();

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      if ($$0.B) {
         boolean $$3 = $$1.a(dfc.gO) || $$1.a(dfc.gP) || $$1.a(dfc.gQ) || $$1.a(dfc.gR);
         if ($$3) {
            return a($$2, dpk.p, dqu::a);
         }
      }

      return null;
   }

   public dmc.a b() {
      return this.b;
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   @Override
   public btc m() {
      return btc.f;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(a);
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(a, Boolean.valueOf($$0.q().C($$0.a())));
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.a(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
