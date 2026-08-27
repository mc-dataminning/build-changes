import com.mojang.serialization.Codec;

public interface ecx<P extends ecw> {
   ecx<ecu> a = a("clear", ecu.a);
   ecx<ecv> b = a("passthrough", ecv.b);
   ecx<ect> c = a("append_static", ect.a);
   ecx<ecs> d = a("append_loot", ecs.a);

   Codec<P> codec();

   private static <P extends ecw> ecx<P> a(String $$0, Codec<P> $$1) {
      return ir.a(kb.p, $$0, () -> $$1);
   }
}
