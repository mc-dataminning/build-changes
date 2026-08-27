import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epx extends epo {
   public static final Codec<epx> a = RecordCodecBuilder.create($$0 -> a($$0).and(jw.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, epx::new));
   private final jw b;

   private epx(List<erh> $$0, jw $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epq b() {
      return epr.h;
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> epo.a<?> a(jy<T> $$0, T $$1) {
      return a($$2 -> new epx($$2, jw.a().a($$0, $$1).a()));
   }
}
