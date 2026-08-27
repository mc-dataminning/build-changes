import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elv extends elk {
   public static final Codec<elv> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aut.b(ki.D).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, elv::new)
   );
   private final aut<cpi> b;

   private elv(List<emx> $$0, aut<cpi> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public elm b() {
      return eln.A;
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      cpj.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static elk.a<?> a(aut<cpi> $$0) {
      return a($$1 -> new elv($$1, $$0));
   }
}
