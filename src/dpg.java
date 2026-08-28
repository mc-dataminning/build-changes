import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dpg(List<dpg.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dpg a = new dpg(List.of());
   public static final Codec<dpg> b = dpg.b.a.listOf().xmap(dpg::new, dpg::b);
   public static final ys<wf, dpg> c = dpg.b.b.a(yq.a()).a(dpg::new, dpg::b);

   public dpg a() {
      return new dpg(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dpg.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dpg.b> a = ImmutableList.builder();

      @Deprecated
      public dpg.a a(jk<dpf> $$0, akj<dpf> $$1, csv $$2) {
         Optional<jj.c<dpf>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dpg.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dpg.a a(jj<dpf> $$0, csv $$1) {
         return this.a(new dpg.b($$0, $$1));
      }

      public dpg.a a(dpg.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dpg.a a(dpg $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dpg a() {
         return new dpg(this.a.build());
      }
   }

   public static record b(jj<dpf> c, csv d) {
      public static final Codec<dpg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dpf.c.fieldOf("pattern").forGetter(dpg.b::b), csv.q.fieldOf("color").forGetter(dpg.b::c)).apply($$0, dpg.b::new)
      );
      public static final ys<wf, dpg.b> b = ys.a(dpf.d, dpg.b::b, csv.r, dpg.b::c, dpg.b::new);

      public xi a() {
         String $$0 = this.c.a().b();
         return wu.c($$0 + "." + this.d.b());
      }

      public jj<dpf> b() {
         return this.c;
      }

      public csv c() {
         return this.d;
      }
   }
}
