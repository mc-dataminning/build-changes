import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dow(List<dow.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dow a = new dow(List.of());
   public static final Codec<dow> b = dow.b.a.listOf().xmap(dow::new, dow::b);
   public static final zm<wz, dow> c = dow.b.b.a(zk.a()).a(dow::new, dow::b);

   public dow a() {
      return new dow(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dow.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dow.b> a = ImmutableList.builder();

      @Deprecated
      public dow.a a(jj<dov> $$0, ald<dov> $$1, ctg $$2) {
         Optional<ji.c<dov>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dow.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dow.a a(ji<dov> $$0, ctg $$1) {
         return this.a(new dow.b($$0, $$1));
      }

      public dow.a a(dow.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dow.a a(dow $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dow a() {
         return new dow(this.a.build());
      }
   }

   public static record b(ji<dov> c, ctg d) {
      public static final Codec<dow.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dov.c.fieldOf("pattern").forGetter(dow.b::b), ctg.q.fieldOf("color").forGetter(dow.b::c)).apply($$0, dow.b::new)
      );
      public static final zm<wz, dow.b> b = zm.a(dov.d, dow.b::b, ctg.r, dow.b::c, dow.b::new);

      public yc a() {
         String $$0 = this.c.a().b();
         return xo.c($$0 + "." + this.d.b());
      }

      public ji<dov> b() {
         return this.c;
      }

      public ctg c() {
         return this.d;
      }
   }
}
