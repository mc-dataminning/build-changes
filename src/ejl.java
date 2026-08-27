import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ejl extends ejq {
   public static final Codec<ejl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.h.r().fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, ejl::new)
   );
   private final ij<cou> j;

   private ejl(ij<cou> $$0, int $$1, int $$2, List<elu> $$3, List<eki> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public ejp a() {
      return ejm.c;
   }

   @Override
   public void a(Consumer<coz> $$0, eiv $$1) {
      $$0.accept(new coz(this.j));
   }

   public static ejq.a<?> a(cvm $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ejl($$0.j().i(), $$1, $$2, $$3, $$4));
   }
}
