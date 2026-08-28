import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehi extends ehd {
   public static final MapCodec<ehi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(boq.b(ehd.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ehi::new)
   );
   private final boq<ehd> b;

   public ehi(boq<ehd> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ayo $$0, dzc $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ehe<?> a() {
      return ehe.f;
   }
}
