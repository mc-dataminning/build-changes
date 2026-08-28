import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ezr extends ezz {
   public static final MapCodec<ezr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ezr::new)
   );
   private final alg j;

   private ezr(alg $$0, int $$1, int $$2, List<fcq> $$3, List<fav> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ezy a() {
      return ezv.e;
   }

   @Override
   public void a(Consumer<czd> $$0, ezh $$1) {
      $$1.a(this.j, $$0);
   }

   public static ezz.a<?> a(alg $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ezr($$0, $$1, $$2, $$3, $$4));
   }
}
