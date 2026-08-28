import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbn extends fbb {
   public static final MapCodec<fbn> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ux.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, fbn::new));
   private final tz b;

   private fbn(List<fcx> $$0, tz $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbd<fbn> b() {
      return fbe.j;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      dbs.a(kk.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static fbb.a<?> a(tz $$0) {
      return a($$1 -> new fbn($$1, $$0));
   }
}
