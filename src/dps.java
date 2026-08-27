import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dps(List<dps.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dps a = new dps(List.of());
   public static final Codec<dps> b = dps.b.a.listOf().xmap(dps::new, dps::b);
   public static final zc<wp, dps> c = dps.b.b.a(za.a()).a(dps::new, dps::b);

   public dps a() {
      return new dps(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dps.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dps.b> a = ImmutableList.builder();

      @Deprecated
      public dps.a a(jb<dpr> $$0, aks<dpr> $$1, csy $$2) {
         Optional<ja.c<dpr>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dps.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dps.a a(ja<dpr> $$0, csy $$1) {
         return this.a(new dps.b($$0, $$1));
      }

      public dps.a a(dps.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dps.a a(dps $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dps a() {
         return new dps(this.a.build());
      }
   }

   public static record b(ja<dpr> c, csy d) {
      public static final Codec<dps.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dpr.c.fieldOf("pattern").forGetter(dps.b::b), csy.q.fieldOf("color").forGetter(dps.b::c)).apply($$0, dps.b::new)
      );
      public static final zc<wp, dps.b> b = zc.a(dpr.d, dps.b::b, csy.r, dps.b::c, dps.b::new);

      public xs a() {
         String $$0 = this.c.a().b();
         return xe.c($$0 + "." + this.d.b());
      }

      public ja<dpr> b() {
         return this.c;
      }

      public csy c() {
         return this.d;
      }
   }
}
