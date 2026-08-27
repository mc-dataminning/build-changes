import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ecx extends edf {
   public static final Codec<ecx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aez.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ecx::new)
   );
   private final aez j;

   private ecx(aez $$0, int $$1, int $$2, List<efj> $$3, List<edx> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ede a() {
      return edb.e;
   }

   @Override
   public void a(Consumer<cjl> $$0, eck $$1) {
      $$1.a(this.j, $$0);
   }

   public static edf.a<?> a(aez $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ecx($$0, $$1, $$2, $$3, $$4));
   }
}
