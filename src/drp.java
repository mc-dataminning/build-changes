import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drp {
   public static final Codec<drp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwl.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, drp::new)
   );
   public final ib<dwl> b;
   public final float c;

   public drp(ib<dwl> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(csu $$0, djf $$1, ats $$2, ht $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
