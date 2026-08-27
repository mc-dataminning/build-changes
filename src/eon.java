import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eon extends eox {
   public static final Codec<eon> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eon.b.b.fieldOf("source").forGetter($$0x -> $$0x.b), jq.a.listOf().fieldOf("components").forGetter($$0x -> $$0x.c)))
            .apply($$0, eon::new)
   );
   private final eon.b b;
   private final List<jq<?>> c;

   eon(List<eql> $$0, eon.b $$1, List<jq<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eoz b() {
      return epa.E;
   }

   @Override
   public Set<epu<?>> a() {
      return this.b.a();
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      jn $$2 = this.b.a($$1);
      $$0.a($$2.a(this.c::contains));
      return $$0;
   }

   public static eon.a a(eon.b $$0) {
      return new eon.a($$0);
   }

   public static class a extends eox.a<eon.a> {
      private final eon.b a;
      private final Builder<jq<?>> b = ImmutableList.builder();

      a(eon.b $$0) {
         this.a = $$0;
      }

      public eon.a a(jq<?> $$0) {
         this.b.add($$0);
         return this;
      }

      protected eon.a a() {
         return this;
      }

      @Override
      public eoy b() {
         return new eon(this.g(), this.a, this.b.build());
      }
   }

   public static enum b implements ayg {
      a("block_entity");

      public static final Codec<eon.b> b = ayg.b(eon.b::values);
      private final String c;

      private b(String $$0) {
         this.c = $$0;
      }

      public jn a(enk $$0) {
         switch (this) {
            case a:
               dmo $$1 = $$0.c(epx.h);
               return $$1 != null ? $$1.s() : jn.a;
            default:
               throw new IncompatibleClassChangeError();
         }
      }

      public Set<epu<?>> a() {
         switch (this) {
            case a:
               return Set.of(epx.h);
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
