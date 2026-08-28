import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efo {
   public static final Codec<efo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekk.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, efo::new)
   );
   public final jo<ekk> b;
   public final float c;

   public efo(jo<ekk> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dfg $$0, dwp $$1, azn $$2, jf $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
