import com.mojang.serialization.MapCodec;

public interface emv<P extends emu> {
   emv<ems> a = a("clear", ems.a);
   emv<emt> b = a("passthrough", emt.b);
   emv<emr> c = a("append_static", emr.a);
   emv<emq> d = a("append_loot", emq.a);

   MapCodec<P> codec();

   private static <P extends emu> emv<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.p, $$0, () -> $$1);
   }
}
