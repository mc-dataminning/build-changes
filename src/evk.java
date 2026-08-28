import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evk extends euy {
   public static final MapCodec<evk> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ve.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, evk::new));
   private final ug b;

   private evk(List<eww> $$0, ug $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eva<evk> b() {
      return evb.j;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      cyh.a(ks.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static euy.a<?> a(ug $$0) {
      return a($$1 -> new evk($$1, $$0));
   }
}
