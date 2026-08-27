import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dui implements dtv {
   public static final Codec<dui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jg.v(16).optionalFieldOf("offset", jg.g).forGetter($$0x -> $$0x.e), dnb.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dui::new)
   );
   private final jg e;
   private final dnb f;

   protected dui(jg $$0, dnb $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cxw $$0, ib $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dtw<?> a() {
      return dtw.g;
   }
}
