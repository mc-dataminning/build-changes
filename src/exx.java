import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exx extends exd {
   public static final MapCodec<exx> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cwk.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, exx::new));
   private final jr<cwk> b;

   private exx(List<eyz> $$0, jr<cwk> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exf<exx> b() {
      return exg.f;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      return $$0.a(this.b.a());
   }
}
