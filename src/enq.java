import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record enq(Map<String, ekv> b, ekw.b c) implements env {
   public static final Codec<enq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ekv.a).fieldOf("scores").forGetter(enq::c), ekw.b.e.fieldOf("entity").forGetter(enq::d))
            .apply($$0, enq::new)
   );

   @Override
   public enw b() {
      return enx.i;
   }

   @Override
   public Set<ene<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ekw $$0) {
      box $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eqx $$2 = $$0.d().f();

         for (Entry<String, ekv> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ekw $$0, box $$1, eqx $$2, String $$3, ekv $$4) {
      eqp $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         eqt $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static enq.a a(ekw.b $$0) {
      return new enq.a($$0);
   }

   public Map<String, ekv> c() {
      return this.b;
   }

   public ekw.b d() {
      return this.c;
   }

   public static class a implements env.a {
      private final Builder<String, ekv> a = ImmutableMap.builder();
      private final ekw.b b;

      public a(ekw.b $$0) {
         this.b = $$0;
      }

      public enq.a a(String $$0, ekv $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public env build() {
         return new enq(this.a.build(), this.b);
      }
   }
}
