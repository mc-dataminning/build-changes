import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbs extends fbg {
   public static final MapCodec<fbs> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ux.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, fbs::new));
   private final tz b;

   private fbs(List<fdc> $$0, tz $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbi<fbs> b() {
      return fbj.j;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      dbv.a(kk.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static fbg.a<?> a(tz $$0) {
      return a($$1 -> new fbs($$1, $$0));
   }
}
