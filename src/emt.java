import com.mojang.serialization.MapCodec;

public interface emt<P extends ems> {
   emt<emq> a = a("clear", emq.a);
   emt<emr> b = a("passthrough", emr.b);
   emt<emp> c = a("append_static", emp.a);
   emt<emo> d = a("append_loot", emo.a);

   MapCodec<P> codec();

   private static <P extends ems> emt<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.p, $$0, () -> $$1);
   }
}
