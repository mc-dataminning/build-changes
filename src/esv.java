import com.mojang.serialization.MapCodec;

public interface esv<P extends esu> {
   esv<ess> a = a("clear", ess.a);
   esv<est> b = a("passthrough", est.b);
   esv<esr> c = a("append_static", esr.a);
   esv<esq> d = a("append_loot", esq.a);

   MapCodec<P> codec();

   private static <P extends esu> esv<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.n, $$0, () -> $$1);
   }
}
