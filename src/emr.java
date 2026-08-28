import com.mojang.serialization.MapCodec;

public interface emr<P extends emq> {
   emr<emp> a = a("constant", emp.b);
   emr<emt> b = a("uniform", emt.a);
   emr<emo> c = a("biased_to_bottom", emo.a);
   emr<emu> d = a("very_biased_to_bottom", emu.a);
   emr<ems> e = a("trapezoid", ems.a);
   emr<emv> f = a("weighted_list", emv.a);

   MapCodec<P> codec();

   private static <P extends emq> emr<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.L, $$0, () -> $$1);
   }
}
