import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eoe extends eoo {
   public static final Codec<eoe> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eoe.b.b.fieldOf("source").forGetter($$0x -> $$0x.b), jo.a.listOf().fieldOf("components").forGetter($$0x -> $$0x.c)))
            .apply($$0, eoe::new)
   );
   private final eoe.b b;
   private final List<jo<?>> c;

   eoe(List<eqc> $$0, eoe.b $$1, List<jo<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eoq b() {
      return eor.E;
   }

   @Override
   public Set<epl<?>> a() {
      return this.b.a();
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      jl $$2 = this.b.a($$1);
      $$0.a($$2.a(this.c::contains));
      return $$0;
   }

   public static eoe.a a(eoe.b $$0) {
      return new eoe.a($$0);
   }

   public static class a extends eoo.a<eoe.a> {
      private final eoe.b a;
      private final Builder<jo<?>> b = ImmutableList.builder();

      a(eoe.b $$0) {
         this.a = $$0;
      }

      public eoe.a a(jo<?> $$0) {
         this.b.add($$0);
         return this;
      }

      protected eoe.a a() {
         return this;
      }

      @Override
      public eop b() {
         return new eoe(this.g(), this.a, this.b.build());
      }
   }

   public static enum b implements aye {
      a("block_entity");

      public static final Codec<eoe.b> b = aye.b(eoe.b::values);
      private final String c;

      private b(String $$0) {
         this.c = $$0;
      }

      public jl a(enb $$0) {
         switch (this) {
            case a:
               dmf $$1 = $$0.c(epo.h);
               return $$1 != null ? $$1.s() : jl.a;
            default:
               throw new IncompatibleClassChangeError();
         }
      }

      public Set<epl<?>> a() {
         switch (this) {
            case a:
               return Set.of(epo.h);
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
