import com.mojang.serialization.MapCodec;

public interface bsn<P extends bsm> {
   bsn<bsk> a = a("constant", bsk.b);
   bsn<bst> b = a("uniform", bst.a);
   bsn<bsi> c = a("clamped_normal", bsi.a);
   bsn<bss> d = a("trapezoid", bss.a);

   MapCodec<P> codec();

   static <P extends bsm> bsn<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.J, $$0, () -> $$1);
   }
}
