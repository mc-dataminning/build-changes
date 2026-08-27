import com.mojang.serialization.Codec;

public interface efu<P extends eft> {
   efu<efr> a = a("clear", efr.a);
   efu<efs> b = a("passthrough", efs.b);
   efu<efq> c = a("append_static", efq.a);
   efu<efp> d = a("append_loot", efp.a);

   Codec<P> codec();

   private static <P extends eft> efu<P> a(String $$0, Codec<P> $$1) {
      return iv.a(kf.p, $$0, () -> $$1);
   }
}
