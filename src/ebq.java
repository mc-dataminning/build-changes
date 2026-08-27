import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebq extends ebl {
   public static final Codec<ebq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bln.b(ebl.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, ebq::new)
   );
   private final bln<ebl> b;

   public ebq(bln<ebl> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(axd $$0, dtl $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public ebm<?> a() {
      return ebm.f;
   }
}
