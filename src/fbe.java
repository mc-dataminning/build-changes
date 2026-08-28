import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbe extends fam {
   public static final MapCodec<fbe> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fdf.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, fbe::new)
   );
   private final fde b;
   private final boolean c;

   private fbe(List<fci> $$0, fde $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fao<fbe> b() {
      return fap.e;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static fam.a<?> a(fde $$0) {
      return a($$1 -> new fbe($$1, $$0, false));
   }

   public static fam.a<?> a(fde $$0, boolean $$1) {
      return a($$2 -> new fbe($$2, $$0, $$1));
   }
}
