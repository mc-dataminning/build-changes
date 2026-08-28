import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dtp(List<dtp.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dtp a = new dtp(List.of());
   public static final Codec<dtp> b = dtp.b.a.listOf().xmap(dtp::new, dtp::b);
   public static final yn<wa, dtp> c = dtp.b.b.a(yl.a()).a(dtp::new, dtp::b);

   public dtp a() {
      return new dtp(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dtp.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dtp.b> a = ImmutableList.builder();

      @Deprecated
      public dtp.a a(js<dto> $$0, aku<dto> $$1, cvl $$2) {
         Optional<jr.c<dto>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dtp.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dtp.a a(jr<dto> $$0, cvl $$1) {
         return this.a(new dtp.b($$0, $$1));
      }

      public dtp.a a(dtp.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dtp.a a(dtp $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dtp a() {
         return new dtp(this.a.build());
      }
   }

   public static record b(jr<dto> c, cvl d) {
      public static final Codec<dtp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dto.c.fieldOf("pattern").forGetter(dtp.b::b), cvl.q.fieldOf("color").forGetter(dtp.b::c)).apply($$0, dtp.b::new)
      );
      public static final yn<wa, dtp.b> b = yn.a(dto.d, dtp.b::b, cvl.r, dtp.b::c, dtp.b::new);

      public xd a() {
         String $$0 = this.c.a().b();
         return wp.c($$0 + "." + this.d.b());
      }

      public jr<dto> b() {
         return this.c;
      }

      public cvl c() {
         return this.d;
      }
   }
}
