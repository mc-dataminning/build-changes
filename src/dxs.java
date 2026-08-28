import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public record dxs(List<dxs.b> d) implements ddd {
   static final Logger e = LogUtils.getLogger();
   public static final dxs a = new dxs(List.of());
   public static final Codec<dxs> b = dxs.b.a.listOf().xmap(dxs::new, dxs::b);
   public static final yy<wl, dxs> c = dxs.b.b.a(yw.a()).a(dxs::new, dxs::b);

   public dxs a() {
      return new dxs(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      for (int $$4 = 0; $$4 < Math.min(this.b().size(), 6); $$4++) {
         $$1.accept(this.b().get($$4).a().a(o.h));
      }
   }

   public List<dxs.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dxs.b> a = ImmutableList.builder();

      @Deprecated
      public dxs.a a(jg<dxr> $$0, alh<dxr> $$1, cyw $$2) {
         Optional<jf.c<dxr>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dxs.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dxs.a a(jf<dxr> $$0, cyw $$1) {
         return this.a(new dxs.b($$0, $$1));
      }

      public dxs.a a(dxs.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dxs.a a(dxs $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dxs a() {
         return new dxs(this.a.build());
      }
   }

   public static record b(jf<dxr> c, cyw d) {
      public static final Codec<dxs.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dxr.c.fieldOf("pattern").forGetter(dxs.b::b), cyw.q.fieldOf("color").forGetter(dxs.b::c)).apply($$0, dxs.b::new)
      );
      public static final yy<wl, dxs.b> b = yy.a(dxr.d, dxs.b::b, cyw.r, dxs.b::c, dxs.b::new);

      public xo a() {
         String $$0 = this.c.a().b();
         return xa.c($$0 + "." + this.d.b());
      }

      public jf<dxr> b() {
         return this.c;
      }

      public cyw c() {
         return this.d;
      }
   }
}
