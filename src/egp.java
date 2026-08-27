import com.mojang.serialization.Codec;

public interface egp<P extends ego> {
   egp<egm> a = a("clear", egm.a);
   egp<egn> b = a("passthrough", egn.b);
   egp<egl> c = a("append_static", egl.a);
   egp<egk> d = a("append_loot", egk.a);

   Codec<P> codec();

   private static <P extends ego> egp<P> a(String $$0, Codec<P> $$1) {
      return ix.a(kh.p, $$0, () -> $$1);
   }
}
