import com.mojang.serialization.MapCodec;

public interface ewd<P extends ewc> {
   ewd<ewb> a = a("always_true", ewb.a);
   ewd<evy> b = a("linear_pos", evy.a);
   ewd<evn> c = a("axis_aligned_linear_pos", evn.a);

   MapCodec<P> codec();

   static <P extends ewc> ewd<P> a(String $$0, MapCodec<P> $$1) {
      return jt.a(mh.o, $$0, () -> $$1);
   }
}
