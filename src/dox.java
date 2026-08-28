import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dox(List<dox.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dox a = new dox(List.of());
   public static final Codec<dox> b = dox.b.a.listOf().xmap(dox::new, dox::b);
   public static final zm<wz, dox> c = dox.b.b.a(zk.a()).a(dox::new, dox::b);

   public dox a() {
      return new dox(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dox.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dox.b> a = ImmutableList.builder();

      @Deprecated
      public dox.a a(jj<dow> $$0, ald<dow> $$1, cth $$2) {
         Optional<ji.c<dow>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dox.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dox.a a(ji<dow> $$0, cth $$1) {
         return this.a(new dox.b($$0, $$1));
      }

      public dox.a a(dox.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dox.a a(dox $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dox a() {
         return new dox(this.a.build());
      }
   }

   public static record b(ji<dow> c, cth d) {
      public static final Codec<dox.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dow.c.fieldOf("pattern").forGetter(dox.b::b), cth.q.fieldOf("color").forGetter(dox.b::c)).apply($$0, dox.b::new)
      );
      public static final zm<wz, dox.b> b = zm.a(dow.d, dox.b::b, cth.r, dox.b::c, dox.b::new);

      public yc a() {
         String $$0 = this.c.a().b();
         return xo.c($$0 + "." + this.d.b());
      }

      public ji<dow> b() {
         return this.c;
      }

      public cth c() {
         return this.d;
      }
   }
}
