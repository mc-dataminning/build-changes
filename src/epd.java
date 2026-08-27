import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epd extends epo {
   public static final Codec<epd> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(epd.b.b.fieldOf("source").forGetter($$0x -> $$0x.b), jy.a.listOf().fieldOf("components").forGetter($$0x -> $$0x.c)))
            .apply($$0, epd::new)
   );
   private final epd.b b;
   private final List<jy<?>> c;

   epd(List<erh> $$0, epd.b $$1, List<jy<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public epq b() {
      return epr.E;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.b.a();
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      jv $$2 = this.b.a($$1);
      $$0.a($$2.a(this.c::contains));
      return $$0;
   }

   public static epd.a a(epd.b $$0) {
      return new epd.a($$0);
   }

   public static class a extends epo.a<epd.a> {
      private final epd.b a;
      private final Builder<jy<?>> b = ImmutableList.builder();

      a(epd.b $$0) {
         this.a = $$0;
      }

      public epd.a a(jy<?> $$0) {
         this.b.add($$0);
         return this;
      }

      protected epd.a a() {
         return this;
      }

      @Override
      public epp b() {
         return new epd(this.g(), this.a, this.b.build());
      }
   }

   public static enum b implements ayq {
      a("block_entity");

      public static final Codec<epd.b> b = ayq.b(epd.b::values);
      private final String c;

      private b(String $$0) {
         this.c = $$0;
      }

      public jv a(eoa $$0) {
         switch (this) {
            case a:
               dnd $$1 = $$0.c(eqt.h);
               return $$1 != null ? $$1.s() : jv.a;
            default:
               throw new IncompatibleClassChangeError();
         }
      }

      public Set<eqq<?>> a() {
         switch (this) {
            case a:
               return Set.of(eqt.h);
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
