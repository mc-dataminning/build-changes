import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edk extends edt {
   public static final Codec<edk> a = RecordCodecBuilder.create($$0 -> a($$0).and(edk.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, edk::new));
   private final edk.a b;

   private edk(List<efg> $$0, edk.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edv b() {
      return edw.o;
   }

   @Override
   public Set<eep<?>> a() {
      return ImmutableSet.of(this.b.g);
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      if ($$1.c(this.b.g) instanceof bgu $$3 && $$3.ac()) {
         $$0.a($$3.H_());
      }

      return $$0;
   }

   public static edt.a<?> a(edk.a $$0) {
      return a($$1 -> new edk($$1, $$0));
   }

   public static enum a implements ash {
      a("this", ees.a),
      b("killer", ees.d),
      c("killer_player", ees.b),
      d("block_entity", ees.h);

      public static final Codec<edk.a> e = ash.a(edk.a::values);
      private final String f;
      final eep<?> g;

      private a(String $$0, eep<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
