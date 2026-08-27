import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eeo extends edx {
   public static final Codec<eeo> a = RecordCodecBuilder.create($$0 -> a($$0).and(jd.j.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eeo::new));
   private final hg<ckx> b;

   private eeo(List<efk> $$0, hg<ckx> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edz b() {
      return eea.z;
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      ckz.a($$0, this.b.a());
      return $$0;
   }

   public static edx.a<?> a(ckx $$0) {
      return a($$1 -> new eeo($$1, $$0.c()));
   }
}
