import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public record dxu(List<dxu.b> d) implements ddf {
   static final Logger e = LogUtils.getLogger();
   public static final dxu a = new dxu(List.of());
   public static final Codec<dxu> b = dxu.b.a.listOf().xmap(dxu::new, dxu::b);
   public static final za<wn, dxu> c = dxu.b.b.a(yy.a()).a(dxu::new, dxu::b);

   public dxu a() {
      return new dxu(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      for (int $$4 = 0; $$4 < Math.min(this.b().size(), 6); $$4++) {
         $$1.accept(this.b().get($$4).a().a(o.h));
      }
   }

   public List<dxu.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dxu.b> a = ImmutableList.builder();

      @Deprecated
      public dxu.a a(jh<dxt> $$0, alj<dxt> $$1, cyy $$2) {
         Optional<jg.c<dxt>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dxu.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dxu.a a(jg<dxt> $$0, cyy $$1) {
         return this.a(new dxu.b($$0, $$1));
      }

      public dxu.a a(dxu.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dxu.a a(dxu $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dxu a() {
         return new dxu(this.a.build());
      }
   }

   public static record b(jg<dxt> c, cyy d) {
      public static final Codec<dxu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dxt.c.fieldOf("pattern").forGetter(dxu.b::b), cyy.q.fieldOf("color").forGetter(dxu.b::c)).apply($$0, dxu.b::new)
      );
      public static final za<wn, dxu.b> b = za.a(dxt.d, dxu.b::b, cyy.r, dxu.b::c, dxu.b::new);

      public xq a() {
         String $$0 = this.c.a().b();
         return xc.c($$0 + "." + this.d.b());
      }

      public jg<dxt> b() {
         return this.c;
      }

      public cyy c() {
         return this.d;
      }
   }
}
