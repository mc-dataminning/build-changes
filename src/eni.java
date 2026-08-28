import com.mojang.serialization.MapCodec;

public interface eni<P extends enh> {
   eni<eml> a = a("always_true", eml.a);
   eni<emq> b = a("block_match", emq.a);
   eni<ems> c = a("blockstate_match", ems.a);
   eni<enp> d = a("tag_match", enp.a);
   eni<ene> e = a("random_block_match", ene.a);
   eni<enf> f = a("random_blockstate_match", enf.a);

   MapCodec<P> codec();

   static <P extends enh> eni<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.m, $$0, () -> $$1);
   }
}
