import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtl extends dtg {
   public static final Codec<dtl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfa.b(dtg.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dtl::new)
   );
   private final bfa<dtg> b;

   public dtl(bfa<dtg> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(aru $$0, dlg $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dth<?> a() {
      return dth.f;
   }
}
