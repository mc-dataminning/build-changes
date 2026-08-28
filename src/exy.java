import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class exy extends eyd {
   public static final MapCodec<exy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cxu.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, exy::new)
   );
   private final js<cxu> j;

   private exy(js<cxu> $$0, int $$1, int $$2, List<fau> $$3, List<eyz> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eyc a() {
      return exz.c;
   }

   @Override
   public void a(Consumer<cxy> $$0, exl $$1) {
      $$0.accept(new cxy(this.j));
   }

   public static eyd.a<?> a(dho $$0) {
      return a(($$1, $$2, $$3, $$4) -> new exy($$0.i().f(), $$1, $$2, $$3, $$4));
   }
}
