import com.mojang.serialization.Codec;

public interface ejq<P extends ejp> {
   ejq<ejn> a = a("clear", ejn.a);
   ejq<ejo> b = a("passthrough", ejo.b);
   ejq<ejm> c = a("append_static", ejm.a);
   ejq<ejl> d = a("append_loot", ejl.a);

   Codec<P> codec();

   private static <P extends ejp> ejq<P> a(String $$0, Codec<P> $$1) {
      return iy.a(kr.p, $$0, () -> $$1);
   }
}
