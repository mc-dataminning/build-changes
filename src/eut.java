import com.mojang.serialization.MapCodec;

public interface eut<P extends eus> {
   eut<euq> a = a("clear", euq.a);
   eut<eur> b = a("passthrough", eur.b);
   eut<eup> c = a("append_static", eup.a);
   eut<euo> d = a("append_loot", euo.a);

   MapCodec<P> codec();

   private static <P extends eus> eut<P> a(String $$0, MapCodec<P> $$1) {
      return jr.a(mf.n, $$0, () -> $$1);
   }
}
