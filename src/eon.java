import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eon extends eov {
   public static final Codec<eon> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akf.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eon::new)
   );
   private final akf j;

   private eon(akf $$0, int $$1, int $$2, List<erh> $$3, List<epp> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eou a() {
      return eor.e;
   }

   @Override
   public void a(Consumer<csd> $$0, eoa $$1) {
      $$1.a(this.j, $$0);
   }

   public static eov.a<?> a(akf $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eon($$0, $$1, $$2, $$3, $$4));
   }
}
