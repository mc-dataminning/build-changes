import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbj extends fam {
   static final MapCodec<fbj> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fdf.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, fbj::new));
   private final fde b;

   private fbj(List<fci> $$0, fde $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public fao<fbj> b() {
      return fap.Q;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      int $$2 = azm.a(this.b.a($$1), 0, 4);
      $$0.b(kj.ad, new dbw($$2));
      return $$0;
   }

   public fde c() {
      return this.b;
   }

   public static fam.a<?> a(fde $$0) {
      return a($$1 -> new fbj($$1, $$0));
   }
}
