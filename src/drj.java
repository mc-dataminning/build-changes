import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record drj(List<drj.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final drj a = new drj(List.of());
   public static final Codec<drj> b = drj.b.a.listOf().xmap(drj::new, drj::b);
   public static final zb<wo, drj> c = drj.b.b.a(yz.a()).a(drj::new, drj::b);

   public drj a() {
      return new drj(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<drj.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<drj.b> a = ImmutableList.builder();

      @Deprecated
      public drj.a a(jo<dri> $$0, alb<dri> $$1, cuj $$2) {
         Optional<jn.c<dri>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            drj.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public drj.a a(jn<dri> $$0, cuj $$1) {
         return this.a(new drj.b($$0, $$1));
      }

      public drj.a a(drj.b $$0) {
         this.a.add($$0);
         return this;
      }

      public drj.a a(drj $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public drj a() {
         return new drj(this.a.build());
      }
   }

   public static record b(jn<dri> c, cuj d) {
      public static final Codec<drj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dri.c.fieldOf("pattern").forGetter(drj.b::b), cuj.q.fieldOf("color").forGetter(drj.b::c)).apply($$0, drj.b::new)
      );
      public static final zb<wo, drj.b> b = zb.a(dri.d, drj.b::b, cuj.r, drj.b::c, drj.b::new);

      public xr a() {
         String $$0 = this.c.a().b();
         return xd.c($$0 + "." + this.d.b());
      }

      public jn<dri> b() {
         return this.c;
      }

      public cuj c() {
         return this.d;
      }
   }
}
