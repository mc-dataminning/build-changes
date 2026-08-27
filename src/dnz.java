import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dnz(List<dnz.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dnz a = new dnz(List.of());
   public static final Codec<dnz> b = dnz.b.a.listOf().xmap(dnz::new, dnz::b);
   public static final yv<wi, dnz> c = dnz.b.b.a(yt.a()).a(dnz::new, dnz::b);

   public dnz a() {
      return new dnz(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dnz.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dnz.b> a = ImmutableList.builder();

      @Deprecated
      public dnz.a a(iy<dny> $$0, akm<dny> $$1, csj $$2) {
         Optional<ix.c<dny>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dnz.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dnz.a a(ix<dny> $$0, csj $$1) {
         return this.a(new dnz.b($$0, $$1));
      }

      public dnz.a a(dnz.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dnz.a a(dnz $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dnz a() {
         return new dnz(this.a.build());
      }
   }

   public static record b(ix<dny> c, csj d) {
      public static final Codec<dnz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dny.c.fieldOf("pattern").forGetter(dnz.b::b), csj.q.fieldOf("color").forGetter(dnz.b::c)).apply($$0, dnz.b::new)
      );
      public static final yv<wi, dnz.b> b = yv.a(dny.d, dnz.b::b, csj.r, dnz.b::c, dnz.b::new);

      public xl a() {
         String $$0 = this.c.a().b();
         return wx.c($$0 + "." + this.d.b());
      }

      public ix<dny> b() {
         return this.c;
      }

      public csj c() {
         return this.d;
      }
   }
}
