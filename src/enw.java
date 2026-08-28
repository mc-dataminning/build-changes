import com.mojang.serialization.MapCodec;

public interface enw<P extends env> {
   enw<ent> a = a("clear", ent.a);
   enw<enu> b = a("passthrough", enu.b);
   enw<ens> c = a("append_static", ens.a);
   enw<enr> d = a("append_loot", enr.a);

   MapCodec<P> codec();

   private static <P extends env> enw<P> a(String $$0, MapCodec<P> $$1) {
      return jz.a(lt.n, $$0, () -> $$1);
   }
}
