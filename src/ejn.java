import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejn implements eiy {
   public static final Codec<ejn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxq.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dxq.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bsd.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ejn::new)
   );
   public final dxq b;
   public final dxq c;
   private final bsd d;

   public ejn(dxq $$0, dxq $$1, bsd $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bsd a() {
      return this.d;
   }
}
