import com.mojang.serialization.MapCodec;

public interface emr<P extends emq> {
   emr<emo> a = a("clear", emo.a);
   emr<emp> b = a("passthrough", emp.b);
   emr<emn> c = a("append_static", emn.a);
   emr<emm> d = a("append_loot", emm.a);

   MapCodec<P> codec();

   private static <P extends emq> emr<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.p, $$0, () -> $$1);
   }
}
