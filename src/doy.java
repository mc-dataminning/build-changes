import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record doy(List<doy.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final doy a = new doy(List.of());
   public static final Codec<doy> b = doy.b.a.listOf().xmap(doy::new, doy::b);
   public static final zn<xa, doy> c = doy.b.b.a(zl.a()).a(doy::new, doy::b);

   public doy a() {
      return new doy(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<doy.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<doy.b> a = ImmutableList.builder();

      @Deprecated
      public doy.a a(jj<dox> $$0, ale<dox> $$1, cti $$2) {
         Optional<ji.c<dox>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            doy.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public doy.a a(ji<dox> $$0, cti $$1) {
         return this.a(new doy.b($$0, $$1));
      }

      public doy.a a(doy.b $$0) {
         this.a.add($$0);
         return this;
      }

      public doy.a a(doy $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public doy a() {
         return new doy(this.a.build());
      }
   }

   public static record b(ji<dox> c, cti d) {
      public static final Codec<doy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dox.c.fieldOf("pattern").forGetter(doy.b::b), cti.q.fieldOf("color").forGetter(doy.b::c)).apply($$0, doy.b::new)
      );
      public static final zn<xa, doy.b> b = zn.a(dox.d, doy.b::b, cti.r, doy.b::c, doy.b::new);

      public yd a() {
         String $$0 = this.c.a().b();
         return xp.c($$0 + "." + this.d.b());
      }

      public ji<dox> b() {
         return this.c;
      }

      public cti c() {
         return this.d;
      }
   }
}
