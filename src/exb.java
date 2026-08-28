import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exb extends exd {
   public static final MapCodec<exb> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(evp.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, exb::new));
   private final evp b;

   private exb(List<eyz> $$0, evp $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exf<exb> b() {
      return exg.w;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static exd.a<?> a(evp $$0) {
      return a($$1 -> new exb($$1, $$0));
   }
}
