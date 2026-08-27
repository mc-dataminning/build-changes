import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebt {
   public static final Codec<ebt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egp.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ebt::new)
   );
   public final ix<egp> b;
   public final float c;

   public ebt(ix<egp> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dbu $$0, dta $$1, aym $$2, io $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
