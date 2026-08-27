import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dmf(List<dmf.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dmf a = new dmf(List.of());
   public static final Codec<dmf> b = dmf.b.a.listOf().xmap(dmf::new, dmf::b);
   public static final yg<vt, dmf> c = dmf.b.b.a(ye.a()).a(dmf::new, dmf::b);

   public dmf a() {
      return new dmf(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dmf.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dmf.b> a = ImmutableList.builder();

      @Deprecated
      public dmf.a a(io<dme> $$0, aju<dme> $$1, cql $$2) {
         Optional<in.c<dme>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dmf.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dmf.a a(in<dme> $$0, cql $$1) {
         return this.a(new dmf.b($$0, $$1));
      }

      public dmf.a a(dmf.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dmf.a a(dmf $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dmf a() {
         return new dmf(this.a.build());
      }
   }

   public static record b(in<dme> c, cql d) {
      public static final Codec<dmf.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dme.c.fieldOf("pattern").forGetter(dmf.b::b), cql.q.fieldOf("color").forGetter(dmf.b::c)).apply($$0, dmf.b::new)
      );
      public static final yg<vt, dmf.b> b = yg.a(dme.d, dmf.b::b, cql.r, dmf.b::c, dmf.b::new);

      public ww a() {
         String $$0 = this.c.a().b();
         return wi.c($$0 + "." + this.d.b());
      }

      public in<dme> b() {
         return this.c;
      }

      public cql c() {
         return this.d;
      }
   }
}
