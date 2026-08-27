import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erj extends eqs {
   public static final MapCodec<erj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(etj.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, erj::new)
   );
   private final eti b;
   private final boolean c;

   private erj(List<esn> $$0, eti $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public equ b() {
      return eqv.e;
   }

   @Override
   public Set<erw<?>> a() {
      return this.b.a();
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      int $$2 = this.c ? $$0.I() : 0;
      $$0.e(ayf.a($$2 + this.b.a($$1), 0, $$0.j()));
      return $$0;
   }

   public static eqs.a<?> a(eti $$0) {
      return a($$1 -> new erj($$1, $$0, false));
   }

   public static eqs.a<?> a(eti $$0, boolean $$1) {
      return a($$2 -> new erj($$2, $$0, $$1));
   }
}
