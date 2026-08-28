import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ewu extends ewz {
   public static final MapCodec<ewu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.g.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ewu::new)
   );
   private final jq<cxg> j;

   private ewu(jq<cxg> $$0, int $$1, int $$2, List<ezs> $$3, List<exv> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ewy a() {
      return ewv.c;
   }

   @Override
   public void a(Consumer<cxk> $$0, ewh $$1) {
      $$0.accept(new cxk(this.j));
   }

   public static ewz.a<?> a(dgz $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ewu($$0.j().f(), $$1, $$2, $$3, $$4));
   }
}
