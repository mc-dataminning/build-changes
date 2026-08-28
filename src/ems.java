import com.mojang.serialization.MapCodec;

public interface ems<P extends emr> {
   ems<emp> a = a("clear", emp.a);
   ems<emq> b = a("passthrough", emq.b);
   ems<emo> c = a("append_static", emo.a);
   ems<emn> d = a("append_loot", emn.a);

   MapCodec<P> codec();

   private static <P extends emr> ems<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.p, $$0, () -> $$1);
   }
}
