import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edv extends eed {
   public static final Codec<edv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(afw.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, edv::new)
   );
   private final afw j;

   private edv(afw $$0, int $$1, int $$2, List<egh> $$3, List<eev> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eec a() {
      return edz.e;
   }

   @Override
   public void a(Consumer<ckj> $$0, edi $$1) {
      $$1.a(this.j, $$0);
   }

   public static eed.a<?> a(afw $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edv($$0, $$1, $$2, $$3, $$4));
   }
}
