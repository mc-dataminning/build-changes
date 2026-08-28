import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record duo(List<duo.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final duo a = new duo(List.of());
   public static final Codec<duo> b = duo.b.a.listOf().xmap(duo::new, duo::b);
   public static final zt<xg, duo> c = duo.b.b.a(zr.a()).a(duo::new, duo::b);

   public duo a() {
      return new duo(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<duo.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<duo.b> a = ImmutableList.builder();

      @Deprecated
      public duo.a a(jr<dun> $$0, aly<dun> $$1, cwm $$2) {
         Optional<jq.c<dun>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            duo.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public duo.a a(jq<dun> $$0, cwm $$1) {
         return this.a(new duo.b($$0, $$1));
      }

      public duo.a a(duo.b $$0) {
         this.a.add($$0);
         return this;
      }

      public duo.a a(duo $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public duo a() {
         return new duo(this.a.build());
      }
   }

   public static record b(jq<dun> c, cwm d) {
      public static final Codec<duo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dun.c.fieldOf("pattern").forGetter(duo.b::b), cwm.q.fieldOf("color").forGetter(duo.b::c)).apply($$0, duo.b::new)
      );
      public static final zt<xg, duo.b> b = zt.a(dun.d, duo.b::b, cwm.r, duo.b::c, duo.b::new);

      public yj a() {
         String $$0 = this.c.a().b();
         return xv.c($$0 + "." + this.d.b());
      }

      public jq<dun> b() {
         return this.c;
      }

      public cwm c() {
         return this.d;
      }
   }
}
