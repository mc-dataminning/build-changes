import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eya extends exc {
   public static final MapCodec<eya> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cyk.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eya::new));
   private final jr<cyk> b;

   private eya(List<eyy> $$0, jr<cyk> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exe<eya> b() {
      return exf.F;
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      $$0.a(kv.Q, cym.a, this.b, cym::b);
      return $$0;
   }

   public static exc.a<?> a(jr<cyk> $$0) {
      return a($$1 -> new eya($$1, $$0));
   }
}
