import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esp extends eta {
   public static final Codec<esp> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(esp.b.b.fieldOf("source").forGetter($$0x -> $$0x.b), kd.a.listOf().fieldOf("components").forGetter($$0x -> $$0x.c)))
            .apply($$0, esp::new)
   );
   private final esp.b b;
   private final List<kd<?>> c;

   esp(List<euu> $$0, esp.b $$1, List<kd<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public etc b() {
      return etd.G;
   }

   @Override
   public Set<eud<?>> a() {
      return this.b.a();
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      ka $$2 = this.b.a($$1);
      $$0.a($$2.a(this.c::contains));
      return $$0;
   }

   public static esp.a a(esp.b $$0) {
      return new esp.a($$0);
   }

   public static class a extends eta.a<esp.a> {
      private final esp.b a;
      private final Builder<kd<?>> b = ImmutableList.builder();

      a(esp.b $$0) {
         this.a = $$0;
      }

      public esp.a a(kd<?> $$0) {
         this.b.add($$0);
         return this;
      }

      protected esp.a a() {
         return this;
      }

      @Override
      public etb b() {
         return new esp(this.g(), this.a, this.b.build());
      }
   }

   public static enum b implements azg {
      a("block_entity");

      public static final Codec<esp.b> b = azg.b(esp.b::values);
      private final String c;

      private b(String $$0) {
         this.c = $$0;
      }

      public ka a(erp $$0) {
         switch (this) {
            case a:
               dqc $$1 = $$0.c(eug.h);
               return $$1 != null ? $$1.s() : ka.a;
            default:
               throw new IncompatibleClassChangeError();
         }
      }

      public Set<eud<?>> a() {
         switch (this) {
            case a:
               return Set.of(eug.h);
            default:
               throw new IncompatibleClassChangeError();
         }
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
