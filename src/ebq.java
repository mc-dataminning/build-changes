import com.mojang.serialization.Codec;

public interface ebq<P extends ebp> {
   ebq<ebn> a = a("clear", ebn.a);
   ebq<ebo> b = a("passthrough", ebo.b);
   ebq<ebm> c = a("append_static", ebm.a);
   ebq<ebl> d = a("append_loot", ebl.a);

   Codec<P> codec();

   private static <P extends ebp> ebq<P> a(String $$0, Codec<P> $$1) {
      return io.a(jy.q, $$0, () -> $$1);
   }
}
