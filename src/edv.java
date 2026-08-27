import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edv extends eee {
   public static final Codec<edv> a = RecordCodecBuilder.create($$0 -> a($$0).and(edv.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, edv::new));
   private final edv.a b;

   private edv(List<efr> $$0, edv.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eeg b() {
      return eeh.o;
   }

   @Override
   public Set<efa<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      if ($$1.c(this.b.g) instanceof bhe $$3 && $$3.ac()) {
         $$0.a($$3.N_());
      }

      return $$0;
   }

   public static eee.a<?> a(edv.a $$0) {
      return a($$1 -> new edv($$1, $$0));
   }

   public static enum a implements asr {
      a("this", efd.a),
      b("killer", efd.d),
      c("killer_player", efd.b),
      d("block_entity", efd.h);

      public static final Codec<edv.a> e = asr.a(edv.a::values);
      private final String f;
      final efa<?> g;

      private a(String $$0, efa<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
