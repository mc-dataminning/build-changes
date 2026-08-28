import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dpy(List<dpy.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dpy a = new dpy(List.of());
   public static final Codec<dpy> b = dpy.b.a.listOf().xmap(dpy::new, dpy::b);
   public static final yx<wk, dpy> c = dpy.b.b.a(yv.a()).a(dpy::new, dpy::b);

   public dpy a() {
      return new dpy(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dpy.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dpy.b> a = ImmutableList.builder();

      @Deprecated
      public dpy.a a(jn<dpx> $$0, akq<dpx> $$1, cti $$2) {
         Optional<jm.c<dpx>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dpy.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dpy.a a(jm<dpx> $$0, cti $$1) {
         return this.a(new dpy.b($$0, $$1));
      }

      public dpy.a a(dpy.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dpy.a a(dpy $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dpy a() {
         return new dpy(this.a.build());
      }
   }

   public static record b(jm<dpx> c, cti d) {
      public static final Codec<dpy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dpx.c.fieldOf("pattern").forGetter(dpy.b::b), cti.q.fieldOf("color").forGetter(dpy.b::c)).apply($$0, dpy.b::new)
      );
      public static final yx<wk, dpy.b> b = yx.a(dpx.d, dpy.b::b, cti.r, dpy.b::c, dpy.b::new);

      public xn a() {
         String $$0 = this.c.a().b();
         return wz.c($$0 + "." + this.d.b());
      }

      public jm<dpx> b() {
         return this.c;
      }

      public cti c() {
         return this.d;
      }
   }
}
