import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dsd(List<dsd.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dsd a = new dsd(List.of());
   public static final Codec<dsd> b = dsd.b.a.listOf().xmap(dsd::new, dsd::b);
   public static final zg<wt, dsd> c = dsd.b.b.a(ze.a()).a(dsd::new, dsd::b);

   public dsd a() {
      return new dsd(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dsd.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dsd.b> a = ImmutableList.builder();

      @Deprecated
      public dsd.a a(jr<dsc> $$0, alh<dsc> $$1, cuy $$2) {
         Optional<jq.c<dsc>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dsd.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dsd.a a(jq<dsc> $$0, cuy $$1) {
         return this.a(new dsd.b($$0, $$1));
      }

      public dsd.a a(dsd.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dsd.a a(dsd $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dsd a() {
         return new dsd(this.a.build());
      }
   }

   public static record b(jq<dsc> c, cuy d) {
      public static final Codec<dsd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dsc.c.fieldOf("pattern").forGetter(dsd.b::b), cuy.q.fieldOf("color").forGetter(dsd.b::c)).apply($$0, dsd.b::new)
      );
      public static final zg<wt, dsd.b> b = zg.a(dsc.d, dsd.b::b, cuy.r, dsd.b::c, dsd.b::new);

      public xw a() {
         String $$0 = this.c.a().b();
         return xi.c($$0 + "." + this.d.b());
      }

      public jq<dsc> b() {
         return this.c;
      }

      public cuy c() {
         return this.d;
      }
   }
}
