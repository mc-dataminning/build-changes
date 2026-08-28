import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezs extends eyy {
   public static final MapCodec<ezs> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cxu.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, ezs::new));
   private final js<cxu> b;

   private ezs(List<fau> $$0, js<cxu> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eza<ezs> b() {
      return ezb.f;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      return $$0.a(this.b.a());
   }
}
