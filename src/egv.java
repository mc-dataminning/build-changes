import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egv extends egq {
   public static final MapCodec<egv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpd.b(egq.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, egv::new)
   );
   private final bpd<egq> b;

   public egv(bpd<egq> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azg $$0, dyq $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public egr<?> a() {
      return egr.f;
   }
}
