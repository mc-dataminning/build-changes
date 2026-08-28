import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dpa(List<dpa.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dpa a = new dpa(List.of());
   public static final Codec<dpa> b = dpa.b.a.listOf().xmap(dpa::new, dpa::b);
   public static final zn<xa, dpa> c = dpa.b.b.a(zl.a()).a(dpa::new, dpa::b);

   public dpa a() {
      return new dpa(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dpa.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dpa.b> a = ImmutableList.builder();

      @Deprecated
      public dpa.a a(jj<doz> $$0, ale<doz> $$1, ctk $$2) {
         Optional<ji.c<doz>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dpa.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dpa.a a(ji<doz> $$0, ctk $$1) {
         return this.a(new dpa.b($$0, $$1));
      }

      public dpa.a a(dpa.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dpa.a a(dpa $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dpa a() {
         return new dpa(this.a.build());
      }
   }

   public static record b(ji<doz> c, ctk d) {
      public static final Codec<dpa.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(doz.c.fieldOf("pattern").forGetter(dpa.b::b), ctk.q.fieldOf("color").forGetter(dpa.b::c)).apply($$0, dpa.b::new)
      );
      public static final zn<xa, dpa.b> b = zn.a(doz.d, dpa.b::b, ctk.r, dpa.b::c, dpa.b::new);

      public yd a() {
         String $$0 = this.c.a().b();
         return xp.c($$0 + "." + this.d.b());
      }

      public ji<doz> b() {
         return this.c;
      }

      public ctk c() {
         return this.d;
      }
   }
}
