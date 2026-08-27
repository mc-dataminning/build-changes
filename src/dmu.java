import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dmu(List<dmu.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dmu a = new dmu(List.of());
   public static final Codec<dmu> b = dmu.b.a.listOf().xmap(dmu::new, dmu::b);
   public static final yq<wd, dmu> c = dmu.b.b.a(yo.a()).a(dmu::new, dmu::b);

   public dmu a() {
      return new dmu(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dmu.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dmu.b> a = ImmutableList.builder();

      @Deprecated
      public dmu.a a(iw<dmt> $$0, ake<dmt> $$1, cqw $$2) {
         Optional<iv.c<dmt>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dmu.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dmu.a a(iv<dmt> $$0, cqw $$1) {
         return this.a(new dmu.b($$0, $$1));
      }

      public dmu.a a(dmu.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dmu.a a(dmu $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dmu a() {
         return new dmu(this.a.build());
      }
   }

   public static record b(iv<dmt> c, cqw d) {
      public static final Codec<dmu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dmt.c.fieldOf("pattern").forGetter(dmu.b::b), cqw.q.fieldOf("color").forGetter(dmu.b::c)).apply($$0, dmu.b::new)
      );
      public static final yq<wd, dmu.b> b = yq.a(dmt.d, dmu.b::b, cqw.r, dmu.b::c, dmu.b::new);

      public xg a() {
         String $$0 = this.c.a().b();
         return ws.c($$0 + "." + this.d.b());
      }

      public iv<dmt> b() {
         return this.c;
      }

      public cqw c() {
         return this.d;
      }
   }
}
