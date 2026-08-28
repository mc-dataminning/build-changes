import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record doz(List<doz.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final doz a = new doz(List.of());
   public static final Codec<doz> b = doz.b.a.listOf().xmap(doz::new, doz::b);
   public static final zn<xa, doz> c = doz.b.b.a(zl.a()).a(doz::new, doz::b);

   public doz a() {
      return new doz(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<doz.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<doz.b> a = ImmutableList.builder();

      @Deprecated
      public doz.a a(jj<doy> $$0, ale<doy> $$1, ctj $$2) {
         Optional<ji.c<doy>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            doz.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public doz.a a(ji<doy> $$0, ctj $$1) {
         return this.a(new doz.b($$0, $$1));
      }

      public doz.a a(doz.b $$0) {
         this.a.add($$0);
         return this;
      }

      public doz.a a(doz $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public doz a() {
         return new doz(this.a.build());
      }
   }

   public static record b(ji<doy> c, ctj d) {
      public static final Codec<doz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(doy.c.fieldOf("pattern").forGetter(doz.b::b), ctj.q.fieldOf("color").forGetter(doz.b::c)).apply($$0, doz.b::new)
      );
      public static final zn<xa, doz.b> b = zn.a(doy.d, doz.b::b, ctj.r, doz.b::c, doz.b::new);

      public yd a() {
         String $$0 = this.c.a().b();
         return xp.c($$0 + "." + this.d.b());
      }

      public ji<doy> b() {
         return this.c;
      }

      public ctj c() {
         return this.d;
      }
   }
}
