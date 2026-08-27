import com.mojang.serialization.MapCodec;

public interface els<P extends elr> {
   els<elp> a = a("clear", elp.a);
   els<elq> b = a("passthrough", elq.b);
   els<elo> c = a("append_static", elo.a);
   els<eln> d = a("append_loot", eln.a);

   MapCodec<P> codec();

   private static <P extends elr> els<P> a(String $$0, MapCodec<P> $$1) {
      return jk.a(le.p, $$0, () -> $$1);
   }
}
