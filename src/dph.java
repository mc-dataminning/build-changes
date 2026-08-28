import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dph(List<dph.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dph a = new dph(List.of());
   public static final Codec<dph> b = dph.b.a.listOf().xmap(dph::new, dph::b);
   public static final ys<wf, dph> c = dph.b.b.a(yq.a()).a(dph::new, dph::b);

   public dph a() {
      return new dph(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dph.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dph.b> a = ImmutableList.builder();

      @Deprecated
      public dph.a a(jk<dpg> $$0, akj<dpg> $$1, csw $$2) {
         Optional<jj.c<dpg>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dph.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dph.a a(jj<dpg> $$0, csw $$1) {
         return this.a(new dph.b($$0, $$1));
      }

      public dph.a a(dph.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dph.a a(dph $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dph a() {
         return new dph(this.a.build());
      }
   }

   public static record b(jj<dpg> c, csw d) {
      public static final Codec<dph.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dpg.c.fieldOf("pattern").forGetter(dph.b::b), csw.q.fieldOf("color").forGetter(dph.b::c)).apply($$0, dph.b::new)
      );
      public static final ys<wf, dph.b> b = ys.a(dpg.d, dph.b::b, csw.r, dph.b::c, dph.b::new);

      public xi a() {
         String $$0 = this.c.a().b();
         return wu.c($$0 + "." + this.d.b());
      }

      public jj<dpg> b() {
         return this.c;
      }

      public csw c() {
         return this.d;
      }
   }
}
