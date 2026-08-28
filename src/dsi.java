import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dsi(List<dsi.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dsi a = new dsi(List.of());
   public static final Codec<dsi> b = dsi.b.a.listOf().xmap(dsi::new, dsi::b);
   public static final zj<ww, dsi> c = dsi.b.b.a(zh.a()).a(dsi::new, dsi::b);

   public dsi a() {
      return new dsi(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dsi.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dsi.b> a = ImmutableList.builder();

      @Deprecated
      public dsi.a a(jr<dsh> $$0, alk<dsh> $$1, cvc $$2) {
         Optional<jq.c<dsh>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dsi.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dsi.a a(jq<dsh> $$0, cvc $$1) {
         return this.a(new dsi.b($$0, $$1));
      }

      public dsi.a a(dsi.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dsi.a a(dsi $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dsi a() {
         return new dsi(this.a.build());
      }
   }

   public static record b(jq<dsh> c, cvc d) {
      public static final Codec<dsi.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dsh.c.fieldOf("pattern").forGetter(dsi.b::b), cvc.q.fieldOf("color").forGetter(dsi.b::c)).apply($$0, dsi.b::new)
      );
      public static final zj<ww, dsi.b> b = zj.a(dsh.d, dsi.b::b, cvc.r, dsi.b::c, dsi.b::new);

      public xz a() {
         String $$0 = this.c.a().b();
         return xl.c($$0 + "." + this.d.b());
      }

      public jq<dsh> b() {
         return this.c;
      }

      public cvc c() {
         return this.d;
      }
   }
}
