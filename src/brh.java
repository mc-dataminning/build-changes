import com.mojang.serialization.MapCodec;

public interface brh<P extends brg> {
   brh<bre> a = a("constant", bre.b);
   brh<brn> b = a("uniform", brn.a);
   brh<brc> c = a("clamped_normal", brc.a);
   brh<brm> d = a("trapezoid", brm.a);

   MapCodec<P> codec();

   static <P extends brg> brh<P> a(String $$0, MapCodec<P> $$1) {
      return kd.a(ly.J, $$0, () -> $$1);
   }
}
