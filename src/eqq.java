import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eqq extends eqs {
   public static final MapCodec<eqq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(epg.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eqq::new));
   private final epg b;

   private eqq(List<esn> $$0, epg $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public equ b() {
      return eqv.t;
   }

   @Override
   public Set<erw<?>> a() {
      return this.b.a();
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      int $$2 = this.b.a($$1, $$0.I());
      $$0.e($$2);
      return $$0;
   }

   public static eqs.a<?> a(epg $$0) {
      return a($$1 -> new eqq($$1, $$0));
   }
}
