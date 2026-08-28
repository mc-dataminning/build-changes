import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elw extends elr {
   public static final MapCodec<elw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqq.b(elr.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, elw::new)
   );
   private final bqq<elr> b;

   public elw(bqq<elr> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azg $$0, edn $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public els<?> a() {
      return els.f;
   }
}
