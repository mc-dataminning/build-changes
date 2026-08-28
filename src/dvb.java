import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record dvb(List<dvb.b> d) {
   static final Logger e = LogUtils.getLogger();
   public static final dvb a = new dvb(List.of());
   public static final Codec<dvb> b = dvb.b.a.listOf().xmap(dvb::new, dvb::b);
   public static final yt<wg, dvb> c = dvb.b.b.a(yr.a()).a(dvb::new, dvb::b);

   public dvb a() {
      return new dvb(List.copyOf(this.d.subList(0, this.d.size() - 1)));
   }

   public List<dvb.b> b() {
      return this.d;
   }

   public static class a {
      private final Builder<dvb.b> a = ImmutableList.builder();

      @Deprecated
      public dvb.a a(jt<dva> $$0, alc<dva> $$1, cwv $$2) {
         Optional<js.c<dva>> $$3 = $$0.a($$1);
         if ($$3.isEmpty()) {
            dvb.e.warn("Unable to find banner pattern with id: '{}'", $$1.a());
            return this;
         } else {
            return this.a($$3.get(), $$2);
         }
      }

      public dvb.a a(js<dva> $$0, cwv $$1) {
         return this.a(new dvb.b($$0, $$1));
      }

      public dvb.a a(dvb.b $$0) {
         this.a.add($$0);
         return this;
      }

      public dvb.a a(dvb $$0) {
         this.a.addAll($$0.d);
         return this;
      }

      public dvb a() {
         return new dvb(this.a.build());
      }
   }

   public static record b(js<dva> c, cwv d) {
      public static final Codec<dvb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dva.c.fieldOf("pattern").forGetter(dvb.b::b), cwv.q.fieldOf("color").forGetter(dvb.b::c)).apply($$0, dvb.b::new)
      );
      public static final yt<wg, dvb.b> b = yt.a(dva.d, dvb.b::b, cwv.r, dvb.b::c, dvb.b::new);

      public xj a() {
         String $$0 = this.c.a().b();
         return wv.c($$0 + "." + this.d.b());
      }

      public js<dva> b() {
         return this.c;
      }

      public cwv c() {
         return this.d;
      }
   }
}
