import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fax extends faa {
   static final MapCodec<fax> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fct.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, fax::new));
   private final fcs b;

   private fax(List<fbw> $$0, fcs $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bav<?>> a() {
      return this.b.a();
   }

   @Override
   public fac<fax> b() {
      return fad.Q;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      int $$2 = azk.a(this.b.a($$1), 0, 4);
      $$0.b(kj.ad, new dbq($$2));
      return $$0;
   }

   public fcs c() {
      return this.b;
   }

   public static faa.a<?> a(fcs $$0) {
      return a($$1 -> new fax($$1, $$0));
   }
}
