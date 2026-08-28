import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fas extends faa {
   public static final MapCodec<fas> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fct.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, fas::new)
   );
   private final fcs b;
   private final boolean c;

   private fas(List<fbw> $$0, fcs $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fac<fas> b() {
      return fad.e;
   }

   @Override
   public Set<bav<?>> a() {
      return this.b.a();
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static faa.a<?> a(fcs $$0) {
      return a($$1 -> new fas($$1, $$0, false));
   }

   public static faa.a<?> a(fcs $$0, boolean $$1) {
      return a($$2 -> new fas($$2, $$0, $$1));
   }
}
