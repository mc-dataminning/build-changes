import com.mojang.serialization.MapCodec;

public interface bsi<P extends bsh> {
   bsi<bsf> a = a("constant", bsf.b);
   bsi<bso> b = a("uniform", bso.a);
   bsi<bsd> c = a("clamped_normal", bsd.a);
   bsi<bsn> d = a("trapezoid", bsn.a);

   MapCodec<P> codec();

   static <P extends bsh> bsi<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ma.J, $$0, () -> $$1);
   }
}
