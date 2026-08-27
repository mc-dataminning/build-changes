import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edo extends edx {
   public static final Codec<edo> a = RecordCodecBuilder.create($$0 -> a($$0).and(edo.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, edo::new));
   private final edo.a b;

   private edo(List<efk> $$0, edo.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edz b() {
      return eea.o;
   }

   @Override
   public Set<eet<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      if ($$1.c(this.b.g) instanceof bgx $$3 && $$3.ac()) {
         $$0.a($$3.H_());
      }

      return $$0;
   }

   public static edx.a<?> a(edo.a $$0) {
      return a($$1 -> new edo($$1, $$0));
   }

   public static enum a implements ask {
      a("this", eew.a),
      b("killer", eew.d),
      c("killer_player", eew.b),
      d("block_entity", eew.h);

      public static final Codec<edo.a> e = ask.a(edo.a::values);
      private final String f;
      final eet<?> g;

      private a(String $$0, eet<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
