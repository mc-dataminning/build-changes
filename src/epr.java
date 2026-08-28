import com.mojang.serialization.MapCodec;

public interface epr<P extends epq> {
   epr<epo> a = a("clear", epo.a);
   epr<epp> b = a("passthrough", epp.b);
   epr<epn> c = a("append_static", epn.a);
   epr<epm> d = a("append_loot", epm.a);

   MapCodec<P> codec();

   private static <P extends epq> epr<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.n, $$0, () -> $$1);
   }
}
