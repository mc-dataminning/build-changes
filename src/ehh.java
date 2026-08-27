import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ehh extends ehq {
   public static final Codec<ehh> a = RecordCodecBuilder.create($$0 -> a($$0).and(ehh.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, ehh::new));
   private final ehh.a b;

   private ehh(List<ejd> $$0, ehh.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ehs b() {
      return eht.o;
   }

   @Override
   public Set<eim<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      if ($$1.c(this.b.g) instanceof bjp $$3 && $$3.ae()) {
         $$0.a($$3.Q_());
      }

      return $$0;
   }

   public static ehq.a<?> a(ehh.a $$0) {
      return a($$1 -> new ehh($$1, $$0));
   }

   public static enum a implements aut {
      a("this", eip.a),
      b("killer", eip.d),
      c("killer_player", eip.b),
      d("block_entity", eip.h);

      public static final Codec<ehh.a> e = aut.a(ehh.a::values);
      private final String f;
      final eim<?> g;

      private a(String $$0, eim<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
