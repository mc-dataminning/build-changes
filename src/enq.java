import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enq implements enb {
   public static final Codec<enq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebq.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               ebq.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               buh.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, enq::new)
   );
   public final ebq b;
   public final ebq c;
   private final buh d;

   public enq(ebq $$0, ebq $$1, buh $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public buh a() {
      return this.d;
   }
}
