import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzq extends dzl {
   public static final Codec<dzq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bke.b(dzl.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dzq::new)
   );
   private final bke<dzl> b;

   public dzq(bke<dzl> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(awo $$0, drl $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dzm<?> a() {
      return dzm.f;
   }
}
