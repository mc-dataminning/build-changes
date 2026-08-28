import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public record dwn(List<dwn.b> d) implements dcd {
   static final Logger e = LogUtils.getLogger();
   public static final dwn a = new dwn(List.of());
   public static final Codec<dwn> b = dwn.b.a.listOf().xmap(dwn::new, dwn::b);
   public static final yw<wj, dwn> c = dwn.b.b.a(yu.a()).a(dwn::new, dwn::b);

   public dwn a() {
      return new dwn(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      for (int $$4 = 0; $$4 < Math.min(this.b().size(), 6); $$4++) {
         $$1.accept(this.b().get($$4).a().a(n.h));
      }
   }

   public List<dwn.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dwn.b> a = ImmutableList.builder();

      @Deprecated
      public dwn.a a(jf<dwm> $$0, alf<dwm> $$1, cxw $$2) {
         Optional<je.c<dwm>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dwn.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dwn.a a(je<dwm> $$0, cxw $$1) {
         return this.a(new dwn.b($$0, $$1));
      }

      public dwn.a a(dwn.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dwn.a a(dwn $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dwn a() {
         return new dwn(this.a.build());
      }
   }

   public static record b(je<dwm> c, cxw d) {
      public static final Codec<dwn.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dwm.c.fieldOf("pattern").forGetter(dwn.b::b), cxw.q.fieldOf("color").forGetter(dwn.b::c)).apply($$0, dwn.b::new)
      );
      public static final yw<wj, dwn.b> b = yw.a(dwm.d, dwn.b::b, cxw.r, dwn.b::c, dwn.b::new);

      public xm a() {
         String $$0 = this.c.a().b();
         return wy.c($$0 + "." + this.d.b());
      }

      public je<dwm> b() {
         return this.c;
      }

      public cxw c() {
         return this.d;
      }
   }
}
