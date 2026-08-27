import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ekl extends ekt {
   public static final Codec<ekl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajc.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ekl::new)
   );
   private final ajc j;

   private ekl(ajc $$0, int $$1, int $$2, List<emx> $$3, List<ell> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eks a() {
      return ekp.e;
   }

   @Override
   public void a(Consumer<cpq> $$0, ejy $$1) {
      $$1.a(this.j, $$0);
   }

   public static ekt.a<?> a(ajc $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ekl($$0, $$1, $$2, $$3, $$4));
   }
}
