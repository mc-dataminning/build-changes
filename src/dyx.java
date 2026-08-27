import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dyx implements dza {
   public static final Codec<dyx> a = RecordCodecBuilder.create($$0 -> $$0.group(qr.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, dyx::new));
   private final qr b;

   public dyx(qr $$0) {
      this.b = $$0;
   }

   @Override
   public qr a(aru $$0, @Nullable qr $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public dzb<?> a() {
      return dzb.c;
   }
}
