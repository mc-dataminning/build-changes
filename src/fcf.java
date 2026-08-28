import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcf extends fbw {
   public static final MapCodec<fcf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kj.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, fcf::new)
   );
   private final kj b;

   private fcf(List<fds> $$0, kj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fby<fcf> b() {
      return fbz.k;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> fbw.a<?> a(kk<T> $$0, T $$1) {
      return a($$2 -> new fcf($$2, kj.a().a($$0, $$1).a()));
   }
}
