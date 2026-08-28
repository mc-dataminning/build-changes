import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezk extends eyy {
   public static final MapCodec<ezk> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uu.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ezk::new));
   private final tw b;

   private ezk(List<fau> $$0, tw $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eza<ezk> b() {
      return ezb.j;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      dae.a(kx.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static eyy.a<?> a(tw $$0) {
      return a($$1 -> new ezk($$1, $$0));
   }
}
