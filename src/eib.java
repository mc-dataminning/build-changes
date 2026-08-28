import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eib extends ehw {
   public static final MapCodec<eib> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpb.b(ehw.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, eib::new)
   );
   private final bpb<ehw> b;

   public eib(bpb<ehw> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ayw $$0, dzv $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ehx<?> a() {
      return ehx.f;
   }
}
