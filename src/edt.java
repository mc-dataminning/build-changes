import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class edt implements edw {
   public static final Codec<edt> a = RecordCodecBuilder.create($$0 -> $$0.group(so.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, edt::new));
   private final so b;

   public edt(so $$0) {
      this.b = $$0;
   }

   @Override
   public so a(auw $$0, @Nullable so $$1) {
      return $$1 == null ? this.b.h() : $$1.a(this.b);
   }

   @Override
   public edx<?> a() {
      return edx.c;
   }
}
