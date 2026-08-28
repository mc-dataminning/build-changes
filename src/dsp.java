import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dsp(List<dsp.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dsp a = new dsp(List.of());
   public static final Codec<dsp> b = dsp.b.a.listOf().xmap(dsp::new, dsp::b);
   public static final zh<wu, dsp> c = dsp.b.b.a(zf.a()).a(dsp::new, dsp::b);

   public dsp a() {
      return new dsp(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dsp.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dsp.b> a = ImmutableList.builder();

      @Deprecated
      public dsp.a a(jr<dso> $$0, ali<dso> $$1, cvj $$2) {
         Optional<jq.c<dso>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dsp.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dsp.a a(jq<dso> $$0, cvj $$1) {
         return this.a(new dsp.b($$0, $$1));
      }

      public dsp.a a(dsp.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dsp.a a(dsp $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dsp a() {
         return new dsp(this.a.build());
      }
   }

   public static record b(jq<dso> c, cvj d) {
      public static final Codec<dsp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dso.c.fieldOf("pattern").forGetter(dsp.b::b), cvj.q.fieldOf("color").forGetter(dsp.b::c)).apply($$0, dsp.b::new)
      );
      public static final zh<wu, dsp.b> b = zh.a(dso.d, dsp.b::b, cvj.r, dsp.b::c, dsp.b::new);

      public xx a() {
         String $$0 = this.c.a().b();
         return xj.c($$0 + "." + this.d.b());
      }

      public jq<dso> b() {
         return this.c;
      }

      public cvj c() {
         return this.d;
      }
   }
}
