import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dpw(List<dpw.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dpw a = new dpw(List.of());
   public static final Codec<dpw> b = dpw.b.a.listOf().xmap(dpw::new, dpw::b);
   public static final yw<wj, dpw> c = dpw.b.b.a(yu.a()).a(dpw::new, dpw::b);

   public dpw a() {
      return new dpw(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dpw.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dpw.b> a = ImmutableList.builder();

      @Deprecated
      public dpw.a a(jn<dpv> $$0, akp<dpv> $$1, ctg $$2) {
         Optional<jm.c<dpv>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dpw.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dpw.a a(jm<dpv> $$0, ctg $$1) {
         return this.a(new dpw.b($$0, $$1));
      }

      public dpw.a a(dpw.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dpw.a a(dpw $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dpw a() {
         return new dpw(this.a.build());
      }
   }

   public static record b(jm<dpv> c, ctg d) {
      public static final Codec<dpw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dpv.c.fieldOf("pattern").forGetter(dpw.b::b), ctg.q.fieldOf("color").forGetter(dpw.b::c)).apply($$0, dpw.b::new)
      );
      public static final yw<wj, dpw.b> b = yw.a(dpv.d, dpw.b::b, ctg.r, dpw.b::c, dpw.b::new);

      public xm a() {
         String $$0 = this.c.a().b();
         return wy.c($$0 + "." + this.d.b());
      }

      public jm<dpv> b() {
         return this.c;
      }

      public ctg c() {
         return this.d;
      }
   }
}
