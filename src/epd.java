import com.mojang.serialization.MapCodec;

public interface epd<P extends epc> {
   epd<eof> a = a("always_true", eof.a);
   epd<eok> b = a("block_match", eok.a);
   epd<eom> c = a("blockstate_match", eom.a);
   epd<epk> d = a("tag_match", epk.a);
   epd<eoz> e = a("random_block_match", eoz.a);
   epd<epa> f = a("random_blockstate_match", epa.a);

   MapCodec<P> codec();

   static <P extends epc> epd<P> a(String $$0, MapCodec<P> $$1) {
      return kb.a(lv.m, $$0, () -> $$1);
   }
}
