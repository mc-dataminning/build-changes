import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epf extends epo {
   public static final Codec<epf> a = RecordCodecBuilder.create($$0 -> a($$0).and(epf.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, epf::new));
   private final epf.a b;

   private epf(List<erh> $$0, epf.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epq b() {
      return epr.p;
   }

   @Override
   public Set<eqq<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      if ($$1.c(this.b.g) instanceof bov $$3) {
         $$0.b(jz.d, $$3.af());
      }

      return $$0;
   }

   public static epo.a<?> a(epf.a $$0) {
      return a($$1 -> new epf($$1, $$0));
   }

   public static enum a implements ayq {
      a("this", eqt.a),
      b("killer", eqt.d),
      c("killer_player", eqt.b),
      d("block_entity", eqt.h);

      public static final Codec<epf.a> e = ayq.a(epf.a::values);
      private final String f;
      final eqq<?> g;

      private a(String $$0, eqq<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
