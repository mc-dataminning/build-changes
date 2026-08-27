import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ero extends eqs {
   public static final MapCodec<ero> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(le.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, ero::new));
   private final ix<cvp> b;

   private ero(List<esn> $$0, ix<cvp> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public equ b() {
      return eqv.C;
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      $$0.a(kb.F, cvr.a, this.b, cvr::b);
      return $$0;
   }

   public static eqs.a<?> a(ix<cvp> $$0) {
      return a($$1 -> new ero($$1, $$0));
   }
}
