import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record drx(List<drx.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final drx a = new drx(List.of());
   public static final Codec<drx> b = drx.b.a.listOf().xmap(drx::new, drx::b);
   public static final zf<ws, drx> c = drx.b.b.a(zd.a()).a(drx::new, drx::b);

   public drx a() {
      return new drx(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<drx.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<drx.b> a = ImmutableList.builder();

      @Deprecated
      public drx.a a(jq<drw> $$0, alg<drw> $$1, cuu $$2) {
         Optional<jp.c<drw>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            drx.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public drx.a a(jp<drw> $$0, cuu $$1) {
         return this.a(new drx.b($$0, $$1));
      }

      public drx.a a(drx.b $$0) {
         this.a.add($$0);
         return this;
      }

      public drx.a a(drx $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public drx a() {
         return new drx(this.a.build());
      }
   }

   public static record b(jp<drw> c, cuu d) {
      public static final Codec<drx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(drw.c.fieldOf("pattern").forGetter(drx.b::b), cuu.q.fieldOf("color").forGetter(drx.b::c)).apply($$0, drx.b::new)
      );
      public static final zf<ws, drx.b> b = zf.a(drw.d, drx.b::b, cuu.r, drx.b::c, drx.b::new);

      public xv a() {
         String $$0 = this.c.a().b();
         return xh.c($$0 + "." + this.d.b());
      }

      public jp<drw> b() {
         return this.c;
      }

      public cuu c() {
         return this.d;
      }
   }
}
