import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eok extends eoo {
   public static final Codec<eok> a = RecordCodecBuilder.create($$0 -> a($$0).and(enb.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eok::new));
   private final enb.b b;

   public eok(List<eqc> $$0, enb.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoq b() {
      return eor.w;
   }

   @Override
   public Set<epl<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      if ($$0.a(crm.ul) && $$1.c(this.b.a()) instanceof cjt $$2) {
         $$0.b(jp.L, new cug($$2.fY()));
      }

      return $$0;
   }

   public static eoo.a<?> a(enb.b $$0) {
      return a($$1 -> new eok($$1, $$0));
   }
}
