import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpl {
   public static final Codec<dpl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(duh.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, dpl::new)
   );
   public final hg<duh> b;
   public final float c;

   public dpl(hg<duh> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(cqk $$0, dhb $$1, arx $$2, gw $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
