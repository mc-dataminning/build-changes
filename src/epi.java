import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epi extends eox {
   public static final Codec<epi> a = RecordCodecBuilder.create($$0 -> a($$0).and(um.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, epi::new));
   private final to b;

   private epi(List<eql> $$0, to $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoz b() {
      return epa.g;
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      cuc.a(jr.a, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static eox.a<?> a(to $$0) {
      return a($$1 -> new epi($$1, $$0));
   }
}
