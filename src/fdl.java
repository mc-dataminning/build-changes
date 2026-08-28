import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record fdl(Map<String, fag> b, fah.b c) implements fdq {
   public static final MapCodec<fdl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, fag.a).fieldOf("scores").forGetter(fdl::c), fah.b.e.fieldOf("entity").forGetter(fdl::d))
            .apply($$0, fdl::new)
   );

   @Override
   public fdr b() {
      return fds.h;
   }

   @Override
   public Set<baz<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(fah $$0) {
      bwt $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fgv $$2 = $$0.d().g();

         for (Entry<String, fag> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(fah $$0, bwt $$1, fgv $$2, String $$3, fag $$4) {
      fgn $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fgr $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static fdl.a a(fah.b $$0) {
      return new fdl.a($$0);
   }

   public Map<String, fag> c() {
      return this.b;
   }

   public fah.b d() {
      return this.c;
   }

   public static class a implements fdq.a {
      private final Builder<String, fag> a = ImmutableMap.builder();
      private final fah.b b;

      public a(fah.b $$0) {
         this.b = $$0;
      }

      public fdl.a a(String $$0, fag $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fdq build() {
         return new fdl(this.a.build(), this.b);
      }
   }
}
