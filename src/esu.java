import com.mojang.serialization.MapCodec;

public interface esu<P extends est> {
   esu<esr> a = a("clear", esr.a);
   esu<ess> b = a("passthrough", ess.b);
   esu<esq> c = a("append_static", esq.a);
   esu<esp> d = a("append_loot", esp.a);

   MapCodec<P> codec();

   private static <P extends est> esu<P> a(String $$0, MapCodec<P> $$1) {
      return ke.a(mb.n, $$0, () -> $$1);
   }
}
