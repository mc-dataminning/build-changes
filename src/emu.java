import com.mojang.serialization.MapCodec;

public interface emu<P extends emt> {
   emu<emr> a = a("clear", emr.a);
   emu<ems> b = a("passthrough", ems.b);
   emu<emq> c = a("append_static", emq.a);
   emu<emp> d = a("append_loot", emp.a);

   MapCodec<P> codec();

   private static <P extends emt> emu<P> a(String $$0, MapCodec<P> $$1) {
      return jv.a(lp.p, $$0, () -> $$1);
   }
}
