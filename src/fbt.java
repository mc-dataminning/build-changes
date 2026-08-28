import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbt extends fbb {
   public static final MapCodec<fbt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fdu.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, fbt::new)
   );
   private final fdt b;
   private final boolean c;

   private fbt(List<fcx> $$0, fdt $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbd<fbt> b() {
      return fbe.e;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static fbb.a<?> a(fdt $$0) {
      return a($$1 -> new fbt($$1, $$0, false));
   }

   public static fbb.a<?> a(fdt $$0, boolean $$1) {
      return a($$2 -> new fbt($$2, $$0, $$1));
   }
}
