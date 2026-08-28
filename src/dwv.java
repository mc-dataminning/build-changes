import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public record dwv(List<dwv.b> d) implements dci {
   static final Logger e = LogUtils.getLogger();
   public static final dwv a = new dwv(List.of());
   public static final Codec<dwv> b = dwv.b.a.listOf().xmap(dwv::new, dwv::b);
   public static final yw<wj, dwv> c = dwv.b.b.a(yu.a()).a(dwv::new, dwv::b);

   public dwv a() {
      return new dwv(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      for (int $$4 = 0; $$4 < Math.min(this.b().size(), 6); $$4++) {
         $$1.accept(this.b().get($$4).a().a(n.h));
      }
   }

   public List<dwv.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dwv.b> a = ImmutableList.builder();

      @Deprecated
      public dwv.a a(jf<dwu> $$0, alf<dwu> $$1, cyb $$2) {
         Optional<je.c<dwu>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dwv.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dwv.a a(je<dwu> $$0, cyb $$1) {
         return this.a(new dwv.b($$0, $$1));
      }

      public dwv.a a(dwv.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dwv.a a(dwv $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dwv a() {
         return new dwv(this.a.build());
      }
   }

   public static record b(je<dwu> c, cyb d) {
      public static final Codec<dwv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dwu.c.fieldOf("pattern").forGetter(dwv.b::b), cyb.q.fieldOf("color").forGetter(dwv.b::c)).apply($$0, dwv.b::new)
      );
      public static final yw<wj, dwv.b> b = yw.a(dwu.d, dwv.b::b, cyb.r, dwv.b::c, dwv.b::new);

      public xm a() {
         String $$0 = this.c.a().b();
         return wy.c($$0 + "." + this.d.b());
      }

      public je<dwu> b() {
         return this.c;
      }

      public cyb c() {
         return this.d;
      }
   }
}
