import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evs extends euy {
   public static final MapCodec<evs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alb.a(lw.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, evs::new)
   );
   private final jo<cvn> b;

   private evs(List<eww> $$0, jo<cvn> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eva<evs> b() {
      return evb.f;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      return $$0.a(this.b.a());
   }
}
