import com.mojang.serialization.MapCodec;

public interface eph<P extends epg> {
   eph<epf> a = a("always_true", epf.a);
   eph<epc> b = a("linear_pos", epc.a);
   eph<eor> c = a("axis_aligned_linear_pos", eor.a);

   MapCodec<P> codec();

   static <P extends epg> eph<P> a(String $$0, MapCodec<P> $$1) {
      return kc.a(lx.o, $$0, () -> $$1);
   }
}
