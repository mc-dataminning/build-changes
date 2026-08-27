import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtp extends dtk {
   public static final Codec<dtp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfd.b(dtk.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dtp::new)
   );
   private final bfd<dtk> b;

   public dtp(bfd<dtk> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(arx $$0, dlk $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dtl<?> a() {
      return dtl.f;
   }
}
