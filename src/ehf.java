import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehf extends ego {
   public static final Codec<ehf> a = RecordCodecBuilder.create($$0 -> a($$0).and(kc.j.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, ehf::new));
   private final ig<cnl> b;

   private ehf(List<eib> $$0, ig<cnl> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public egq b() {
      return egr.z;
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      cnn.a($$0, this.b.a());
      return $$0;
   }

   public static ego.a<?> a(cnl $$0) {
      return a($$1 -> new ehf($$1, $$0.c()));
   }
}
