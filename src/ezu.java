import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ezu extends ezz {
   public static final MapCodec<ezu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cyz.e.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ezu::new)
   );
   private final je<cyz> j;

   private ezu(je<cyz> $$0, int $$1, int $$2, List<fcq> $$3, List<fav> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ezy a() {
      return ezv.c;
   }

   @Override
   public void a(Consumer<czd> $$0, ezh $$1) {
      $$0.accept(new czd(this.j));
   }

   public static ezz.a<?> a(diz $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezu($$0.h().e(), $$1, $$2, $$3, $$4));
   }
}
