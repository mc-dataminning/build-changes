import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eqn extends eqs {
   public static final MapCodec<eqn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(eph.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eqn::new)
   );
   private final eph.b b;

   public eqn(List<esn> $$0, eph.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public equ b() {
      return eqv.y;
   }

   @Override
   public Set<erw<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      if ($$0.a(ctt.un) && $$1.c(this.b.a()) instanceof cly $$2) {
         $$0.b(kb.U, new cws($$2.gb()));
      }

      return $$0;
   }

   public static eqs.a<?> a(eph.b $$0) {
      return a($$1 -> new eqn($$1, $$0));
   }
}
