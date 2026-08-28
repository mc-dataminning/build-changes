import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record duh(List<duh.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final duh a = new duh(List.of());
   public static final Codec<duh> b = duh.b.a.listOf().xmap(duh::new, duh::b);
   public static final zi<wv, duh> c = duh.b.b.a(zg.a()).a(duh::new, duh::b);

   public duh a() {
      return new duh(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<duh.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<duh.b> a = ImmutableList.builder();

      @Deprecated
      public duh.a a(jr<dug> $$0, alo<dug> $$1, cwd $$2) {
         Optional<jq.c<dug>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            duh.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public duh.a a(jq<dug> $$0, cwd $$1) {
         return this.a(new duh.b($$0, $$1));
      }

      public duh.a a(duh.b $$0) {
         this.a.add($$0);
         return this;
      }

      public duh.a a(duh $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public duh a() {
         return new duh(this.a.build());
      }
   }

   public static record b(jq<dug> c, cwd d) {
      public static final Codec<duh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dug.c.fieldOf("pattern").forGetter(duh.b::b), cwd.q.fieldOf("color").forGetter(duh.b::c)).apply($$0, duh.b::new)
      );
      public static final zi<wv, duh.b> b = zi.a(dug.d, duh.b::b, cwd.r, duh.b::c, duh.b::new);

      public xy a() {
         String $$0 = this.c.a().b();
         return xk.c($$0 + "." + this.d.b());
      }

      public jq<dug> b() {
         return this.c;
      }

      public cwd c() {
         return this.d;
      }
   }
}
