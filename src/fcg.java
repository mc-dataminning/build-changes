import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcg extends fbu {
   public static final MapCodec<fcg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uz.f.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, fcg::new));
   private final tz b;

   private fcg(List<fdq> $$0, tz $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbw<fcg> b() {
      return fbx.j;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      dcg.a(kk.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static fbu.a<?> a(tz $$0) {
      return a($$1 -> new fcg($$1, $$0));
   }
}
