import com.mojang.serialization.MapCodec;

public interface ems<P extends emr> {
   ems<emq> a = a("constant", emq.b);
   ems<emu> b = a("uniform", emu.a);
   ems<emp> c = a("biased_to_bottom", emp.a);
   ems<emv> d = a("very_biased_to_bottom", emv.a);
   ems<emt> e = a("trapezoid", emt.a);
   ems<emw> f = a("weighted_list", emw.a);

   MapCodec<P> codec();

   private static <P extends emr> ems<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.L, $$0, () -> $$1);
   }
}
