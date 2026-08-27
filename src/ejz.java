import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record ejz(Map<String, ehe> b, ehf.b c) implements eke {
   public static final Codec<ejz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ehe.a).fieldOf("scores").forGetter(ejz::c), ehf.b.e.fieldOf("entity").forGetter(ejz::d))
            .apply($$0, ejz::new)
   );

   @Override
   public ekf b() {
      return ekg.i;
   }

   @Override
   public Set<ejn<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ehf $$0) {
      blw $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eng $$2 = $$0.d().f();

         for (Entry<String, ehe> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ehf $$0, blw $$1, eng $$2, String $$3, ehe $$4) {
      emy $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         enc $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static ejz.a a(ehf.b $$0) {
      return new ejz.a($$0);
   }

   public Map<String, ehe> c() {
      return this.b;
   }

   public ehf.b d() {
      return this.c;
   }

   public static class a implements eke.a {
      private final Builder<String, ehe> a = ImmutableMap.builder();
      private final ehf.b b;

      public a(ehf.b $$0) {
         this.b = $$0;
      }

      public ejz.a a(String $$0, ehe $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eke build() {
         return new ejz(this.a.build(), this.b);
      }
   }
}
