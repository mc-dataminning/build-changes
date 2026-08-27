import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epl extends epw {
   public static final Codec<epl> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(epl.b.b.fieldOf("source").forGetter($$0x -> $$0x.b), jz.a.listOf().fieldOf("components").forGetter($$0x -> $$0x.c)))
            .apply($$0, epl::new)
   );
   private final epl.b b;
   private final List<jz<?>> c;

   epl(List<erq> $$0, epl.b $$1, List<jz<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public epy b() {
      return epz.G;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.b.a();
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      jw $$2 = this.b.a($$1);
      $$0.a($$2.a(this.c::contains));
      return $$0;
   }

   public static epl.a a(epl.b $$0) {
      return new epl.a($$0);
   }

   public static class a extends epw.a<epl.a> {
      private final epl.b a;
      private final Builder<jz<?>> b = ImmutableList.builder();

      a(epl.b $$0) {
         this.a = $$0;
      }

      public epl.a a(jz<?> $$0) {
         this.b.add($$0);
         return this;
      }

      protected epl.a a() {
         return this;
      }

      @Override
      public epx b() {
         return new epl(this.g(), this.a, this.b.build());
      }
   }

   public static enum b implements ayt {
      a("block_entity");

      public static final Codec<epl.b> b = ayt.b(epl.b::values);
      private final String c;

      private b(String $$0) {
         this.c = $$0;
      }

      public jw a(eol $$0) {
         switch (this) {
            case a:
               dnm $$1 = $$0.c(erc.h);
               return $$1 != null ? $$1.s() : jw.a;
            default:
               throw new IncompatibleClassChangeError();
         }
      }

      public Set<eqz<?>> a() {
         switch (this) {
            case a:
               return Set.of(erc.h);
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
