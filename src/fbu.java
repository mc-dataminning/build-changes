import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbu extends fbw {
   public static final MapCodec<fbu> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fai.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, fbu::new));
   private final fai b;

   private fbu(List<fds> $$0, fai $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fby<fbu> b() {
      return fbz.w;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.b.a();
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static fbw.a<?> a(fai $$0) {
      return a($$1 -> new fbu($$1, $$0));
   }
}
