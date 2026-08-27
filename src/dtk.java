import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtk extends dtf {
   public static final Codec<dtk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfa.b(dtf.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dtk::new)
   );
   private final bfa<dtf> b;

   public dtk(bfa<dtf> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(aru $$0, dlf $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dtg<?> a() {
      return dtg.f;
   }
}
