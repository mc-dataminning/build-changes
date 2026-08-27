import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class elx extends emg {
   public static final Codec<elx> a = RecordCodecBuilder.create($$0 -> a($$0).and(elx.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, elx::new));
   private final elx.a b;

   private elx(List<ent> $$0, elx.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public emi b() {
      return emj.o;
   }

   @Override
   public Set<enc<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      if ($$1.c(this.b.g) instanceof bnh $$3 && $$3.ae()) {
         $$0.a($$3.O_());
      }

      return $$0;
   }

   public static emg.a<?> a(elx.a $$0) {
      return a($$1 -> new elx($$1, $$0));
   }

   public static enum a implements axq {
      a("this", enf.a),
      b("killer", enf.d),
      c("killer_player", enf.b),
      d("block_entity", enf.h);

      public static final Codec<elx.a> e = axq.a(elx.a::values);
      private final String f;
      final enc<?> g;

      private a(String $$0, enc<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
