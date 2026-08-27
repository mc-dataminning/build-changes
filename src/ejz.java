import com.mojang.serialization.Codec;

public interface ejz<P extends ejy> {
   ejz<ejw> a = a("clear", ejw.a);
   ejz<ejx> b = a("passthrough", ejx.b);
   ejz<ejv> c = a("append_static", ejv.a);
   ejz<eju> d = a("append_loot", eju.a);

   Codec<P> codec();

   private static <P extends ejy> ejz<P> a(String $$0, Codec<P> $$1) {
      return ja.a(kt.p, $$0, () -> $$1);
   }
}
