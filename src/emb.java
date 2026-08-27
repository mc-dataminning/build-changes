import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emb extends elk {
   public static final Codec<emb> a = RecordCodecBuilder.create($$0 -> a($$0).and(kh.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, emb::new));
   private final il<crm> b;

   private emb(List<emx> $$0, il<crm> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public elm b() {
      return eln.z;
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      cro.a($$0, this.b);
      return $$0;
   }

   public static elk.a<?> a(il<crm> $$0) {
      return a($$1 -> new emb($$1, $$0));
   }
}
