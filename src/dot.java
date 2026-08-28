import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dot(List<dot.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dot a = new dot(List.of());
   public static final Codec<dot> b = dot.b.a.listOf().xmap(dot::new, dot::b);
   public static final zj<ww, dot> c = dot.b.b.a(zh.a()).a(dot::new, dot::b);

   public dot a() {
      return new dot(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dot.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dot.b> a = ImmutableList.builder();

      @Deprecated
      public dot.a a(jj<dos> $$0, ala<dos> $$1, ctd $$2) {
         Optional<ji.c<dos>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dot.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dot.a a(ji<dos> $$0, ctd $$1) {
         return this.a(new dot.b($$0, $$1));
      }

      public dot.a a(dot.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dot.a a(dot $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dot a() {
         return new dot(this.a.build());
      }
   }

   public static record b(ji<dos> c, ctd d) {
      public static final Codec<dot.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dos.c.fieldOf("pattern").forGetter(dot.b::b), ctd.q.fieldOf("color").forGetter(dot.b::c)).apply($$0, dot.b::new)
      );
      public static final zj<ww, dot.b> b = zj.a(dos.d, dot.b::b, ctd.r, dot.b::c, dot.b::new);

      public xz a() {
         String $$0 = this.c.a().b();
         return xl.c($$0 + "." + this.d.b());
      }

      public ji<dos> b() {
         return this.c;
      }

      public ctd c() {
         return this.d;
      }
   }
}
