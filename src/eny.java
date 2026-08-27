import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eny implements eob {
   public static final Codec<eny> a = RecordCodecBuilder.create($$0 -> $$0.group(uk.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, eny::new));
   private final uk b;

   public eny(uk $$0) {
      this.b = $$0;
   }

   @Override
   public uk a(ayt $$0, @Nullable uk $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public eoc<?> a() {
      return eoc.c;
   }
}
