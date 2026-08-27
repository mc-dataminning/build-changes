import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dnx(List<dnx.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dnx a = new dnx(List.of());
   public static final Codec<dnx> b = dnx.b.a.listOf().xmap(dnx::new, dnx::b);
   public static final yv<wi, dnx> c = dnx.b.b.a(yt.a()).a(dnx::new, dnx::b);

   public dnx a() {
      return new dnx(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dnx.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dnx.b> a = ImmutableList.builder();

      @Deprecated
      public dnx.a a(iy<dnw> $$0, akl<dnw> $$1, csh $$2) {
         Optional<ix.c<dnw>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dnx.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dnx.a a(ix<dnw> $$0, csh $$1) {
         return this.a(new dnx.b($$0, $$1));
      }

      public dnx.a a(dnx.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dnx.a a(dnx $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dnx a() {
         return new dnx(this.a.build());
      }
   }

   public static record b(ix<dnw> c, csh d) {
      public static final Codec<dnx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dnw.c.fieldOf("pattern").forGetter(dnx.b::b), csh.q.fieldOf("color").forGetter(dnx.b::c)).apply($$0, dnx.b::new)
      );
      public static final yv<wi, dnx.b> b = yv.a(dnw.d, dnx.b::b, csh.r, dnx.b::c, dnx.b::new);

      public xl a() {
         String $$0 = this.c.a().b();
         return wx.c($$0 + "." + this.d.b());
      }

      public ix<dnw> b() {
         return this.c;
      }

      public csh c() {
         return this.d;
      }
   }
}
