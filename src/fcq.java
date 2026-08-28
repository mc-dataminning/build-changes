import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcq extends fbw {
   public static final MapCodec<fcq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(czw.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, fcq::new));
   private final jg<czw> b;

   private fcq(List<fds> $$0, jg<czw> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fby<fcq> b() {
      return fbz.f;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      return $$0.a(this.b.a());
   }
}
