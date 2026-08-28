import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyn extends exv {
   public static final MapCodec<eyn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fao.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eyn::new)
   );
   private final fan b;
   private final boolean c;

   private eyn(List<ezr> $$0, fan $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exx<eyn> b() {
      return exy.e;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.b.a();
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static exv.a<?> a(fan $$0) {
      return a($$1 -> new eyn($$1, $$0, false));
   }

   public static exv.a<?> a(fan $$0, boolean $$1) {
      return a($$2 -> new eyn($$2, $$0, $$1));
   }
}
