import com.mojang.serialization.MapCodec;

public interface elu<P extends elt> {
   elu<elr> a = a("clear", elr.a);
   elu<els> b = a("passthrough", els.b);
   elu<elq> c = a("append_static", elq.a);
   elu<elp> d = a("append_loot", elp.a);

   MapCodec<P> codec();

   private static <P extends elt> elu<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.p, $$0, () -> $$1);
   }
}
