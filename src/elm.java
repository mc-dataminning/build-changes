import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elm implements ekx {
   public static final Codec<elm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzo.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dzo.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               btd.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, elm::new)
   );
   public final dzo b;
   public final dzo c;
   private final btd d;

   public elm(dzo $$0, dzo $$1, btd $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public btd a() {
      return this.d;
   }
}
