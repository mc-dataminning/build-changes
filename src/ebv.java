import com.mojang.serialization.Codec;

public interface ebv<P extends ebu> {
   ebv<ebs> a = a("clear", ebs.a);
   ebv<ebt> b = a("passthrough", ebt.b);
   ebv<ebr> c = a("append_static", ebr.a);
   ebv<ebq> d = a("append_loot", ebq.a);

   Codec<P> codec();

   private static <P extends ebu> ebv<P> a(String $$0, Codec<P> $$1) {
      return is.a(kc.q, $$0, () -> $$1);
   }
}
