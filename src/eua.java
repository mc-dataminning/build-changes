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

public record eua(Map<String, eqt> b, equ.b c) implements euf {
   public static final MapCodec<eua> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eqt.a).fieldOf("scores").forGetter(eua::c), equ.b.e.fieldOf("entity").forGetter(eua::d))
            .apply($$0, eua::new)
   );

   @Override
   public eug b() {
      return euh.h;
   }

   @Override
   public Set<etn<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(equ $$0) {
      bsg $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         exj $$2 = $$0.d().f();

         for (Entry<String, eqt> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(equ $$0, bsg $$1, exj $$2, String $$3, eqt $$4) {
      exb $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         exf $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static eua.a a(equ.b $$0) {
      return new eua.a($$0);
   }

   public Map<String, eqt> c() {
      return this.b;
   }

   public equ.b d() {
      return this.c;
   }

   public static class a implements euf.a {
      private final Builder<String, eqt> a = ImmutableMap.builder();
      private final equ.b b;

      public a(equ.b $$0) {
         this.b = $$0;
      }

      public eua.a a(String $$0, eqt $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public euf build() {
         return new eua(this.a.build(), this.b);
      }
   }
}
