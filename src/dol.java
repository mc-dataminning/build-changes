import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dol implements dny {
   public static final Codec<dol> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.v(16).optionalFieldOf("offset", iw.g).forGetter($$0x -> $$0x.e), dhi.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dol::new)
   );
   private final iw e;
   private final dhi f;

   protected dol(iw $$0, dhi $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(csu $$0, ht $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dnz<?> a() {
      return dnz.g;
   }
}
