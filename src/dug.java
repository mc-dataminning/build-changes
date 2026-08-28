import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dug(List<dug.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dug a = new dug(List.of());
   public static final Codec<dug> b = dug.b.a.listOf().xmap(dug::new, dug::b);
   public static final zt<xg, dug> c = dug.b.b.a(zr.a()).a(dug::new, dug::b);

   public dug a() {
      return new dug(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dug.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dug.b> a = ImmutableList.builder();

      @Deprecated
      public dug.a a(jr<duf> $$0, aly<duf> $$1, cwh $$2) {
         Optional<jq.c<duf>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dug.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dug.a a(jq<duf> $$0, cwh $$1) {
         return this.a(new dug.b($$0, $$1));
      }

      public dug.a a(dug.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dug.a a(dug $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dug a() {
         return new dug(this.a.build());
      }
   }

   public static record b(jq<duf> c, cwh d) {
      public static final Codec<dug.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(duf.c.fieldOf("pattern").forGetter(dug.b::b), cwh.q.fieldOf("color").forGetter(dug.b::c)).apply($$0, dug.b::new)
      );
      public static final zt<xg, dug.b> b = zt.a(duf.d, dug.b::b, cwh.r, dug.b::c, dug.b::new);

      public yj a() {
         String $$0 = this.c.a().b();
         return xv.c($$0 + "." + this.d.b());
      }

      public jq<duf> b() {
         return this.c;
      }

      public cwh c() {
         return this.d;
      }
   }
}
