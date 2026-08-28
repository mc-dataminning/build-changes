import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record drm(List<drm.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final drm a = new drm(List.of());
   public static final Codec<drm> b = drm.b.a.listOf().xmap(drm::new, drm::b);
   public static final zc<wp, drm> c = drm.b.b.a(za.a()).a(drm::new, drm::b);

   public drm a() {
      return new drm(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<drm.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<drm.b> a = ImmutableList.builder();

      @Deprecated
      public drm.a a(jp<drl> $$0, ald<drl> $$1, cum $$2) {
         Optional<jo.c<drl>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            drm.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public drm.a a(jo<drl> $$0, cum $$1) {
         return this.a(new drm.b($$0, $$1));
      }

      public drm.a a(drm.b $$0) {
         this.a.add($$0);
         return this;
      }

      public drm.a a(drm $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public drm a() {
         return new drm(this.a.build());
      }
   }

   public static record b(jo<drl> c, cum d) {
      public static final Codec<drm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(drl.c.fieldOf("pattern").forGetter(drm.b::b), cum.q.fieldOf("color").forGetter(drm.b::c)).apply($$0, drm.b::new)
      );
      public static final zc<wp, drm.b> b = zc.a(drl.d, drm.b::b, cum.r, drm.b::c, drm.b::new);

      public xs a() {
         String $$0 = this.c.a().b();
         return xe.c($$0 + "." + this.d.b());
      }

      public jo<drl> b() {
         return this.c;
      }

      public cum c() {
         return this.d;
      }
   }
}
