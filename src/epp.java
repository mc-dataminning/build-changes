import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epp extends eox {
   public static final Codec<epp> a = RecordCodecBuilder.create($$0 -> a($$0).and(kt.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, epp::new));
   private final in<cto> b;

   private epp(List<eql> $$0, in<cto> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoz b() {
      return epa.A;
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      $$0.a(jr.x, ctq.a, this.b, ctq::b);
      return $$0;
   }

   public static eox.a<?> a(in<cto> $$0) {
      return a($$1 -> new epp($$1, $$0));
   }
}
