import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eql extends eqq {
   public static final MapCodec<eql> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(epf.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eql::new)
   );
   private final epf.b b;

   public eql(List<esl> $$0, epf.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eqs b() {
      return eqt.y;
   }

   @Override
   public Set<eru<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      if ($$0.a(ctr.un) && $$1.c(this.b.a()) instanceof clw $$2) {
         $$0.b(kb.U, new cwq($$2.gb()));
      }

      return $$0;
   }

   public static eqq.a<?> a(epf.b $$0) {
      return a($$1 -> new eql($$1, $$0));
   }
}
