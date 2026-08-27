import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ere extends eqs {
   public static final MapCodec<ere> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vb.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ere::new));
   private final ud b;

   private ere(List<esn> $$0, ud $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public equ b() {
      return eqv.i;
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      cwf.a(kb.a, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static eqs.a<?> a(ud $$0) {
      return a($$1 -> new ere($$1, $$0));
   }
}
