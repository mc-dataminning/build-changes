import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class elz extends emi {
   public static final Codec<elz> a = RecordCodecBuilder.create($$0 -> a($$0).and(elz.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, elz::new));
   private final elz.a b;

   private elz(List<env> $$0, elz.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public emk b() {
      return eml.o;
   }

   @Override
   public Set<ene<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      if ($$1.c(this.b.g) instanceof bni $$3 && $$3.ae()) {
         $$0.a($$3.O_());
      }

      return $$0;
   }

   public static emi.a<?> a(elz.a $$0) {
      return a($$1 -> new elz($$1, $$0));
   }

   public static enum a implements axq {
      a("this", enh.a),
      b("killer", enh.d),
      c("killer_player", enh.b),
      d("block_entity", enh.h);

      public static final Codec<elz.a> e = axq.a(elz.a::values);
      private final String f;
      final ene<?> g;

      private a(String $$0, ene<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
