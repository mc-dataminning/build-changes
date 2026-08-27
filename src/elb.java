import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class elb extends elk {
   public static final Codec<elb> a = RecordCodecBuilder.create($$0 -> a($$0).and(elb.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, elb::new));
   private final elb.a b;

   private elb(List<emx> $$0, elb.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public elm b() {
      return eln.o;
   }

   @Override
   public Set<emg<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      if ($$1.c(this.b.g) instanceof bmq $$3 && $$3.ae()) {
         $$0.a($$3.Q_());
      }

      return $$0;
   }

   public static elk.a<?> a(elb.a $$0) {
      return a($$1 -> new elb($$1, $$0));
   }

   public static enum a implements axg {
      a("this", emj.a),
      b("killer", emj.d),
      c("killer_player", emj.b),
      d("block_entity", emj.h);

      public static final Codec<elb.a> e = axg.a(elb.a::values);
      private final String f;
      final emg<?> g;

      private a(String $$0, emg<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
