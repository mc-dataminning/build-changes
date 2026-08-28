import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record duj(List<duj.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final duj a = new duj(List.of());
   public static final Codec<duj> b = duj.b.a.listOf().xmap(duj::new, duj::b);
   public static final yn<wa, duj> c = duj.b.b.a(yl.a()).a(duj::new, duj::b);

   public duj a() {
      return new duj(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<duj.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<duj.b> a = ImmutableList.builder();

      @Deprecated
      public duj.a a(js<dui> $$0, akt<dui> $$1, cwe $$2) {
         Optional<jr.c<dui>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            duj.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public duj.a a(jr<dui> $$0, cwe $$1) {
         return this.a(new duj.b($$0, $$1));
      }

      public duj.a a(duj.b $$0) {
         this.a.add($$0);
         return this;
      }

      public duj.a a(duj $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public duj a() {
         return new duj(this.a.build());
      }
   }

   public static record b(jr<dui> c, cwe d) {
      public static final Codec<duj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dui.c.fieldOf("pattern").forGetter(duj.b::b), cwe.q.fieldOf("color").forGetter(duj.b::c)).apply($$0, duj.b::new)
      );
      public static final yn<wa, duj.b> b = yn.a(dui.d, duj.b::b, cwe.r, duj.b::c, duj.b::new);

      public xd a() {
         String $$0 = this.c.a().b();
         return wp.c($$0 + "." + this.d.b());
      }

      public jr<dui> b() {
         return this.c;
      }

      public cwe c() {
         return this.d;
      }
   }
}
