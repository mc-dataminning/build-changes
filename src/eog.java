import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eog extends eoo {
   public static final Codec<eog> a = RecordCodecBuilder.create($$0 -> a($$0).and(eog.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, eog::new));
   private final eog.a b;

   private eog(List<eqc> $$0, eog.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoq b() {
      return eor.p;
   }

   @Override
   public Set<epl<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      if ($$1.c(this.b.g) instanceof bof $$3) {
         $$0.b(jp.d, $$3.af());
      }

      return $$0;
   }

   public static eoo.a<?> a(eog.a $$0) {
      return a($$1 -> new eog($$1, $$0));
   }

   public static enum a implements aye {
      a("this", epo.a),
      b("killer", epo.d),
      c("killer_player", epo.b),
      d("block_entity", epo.h);

      public static final Codec<eog.a> e = aye.a(eog.a::values);
      private final String f;
      final epl<?> g;

      private a(String $$0, epl<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
