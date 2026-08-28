import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record epf(iz c, ctk d, Optional<xp> e) {
   public static final Codec<epf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iz.a.fieldOf("pos").forGetter(epf::c),
               ctk.q.lenientOptionalFieldOf("color", ctk.a).forGetter(epf::d),
               xr.g.lenientOptionalFieldOf("name").forGetter(epf::e)
            )
            .apply($$0, epf::new)
   );
   public static final Codec<List<epf>> b = a.listOf();

   @Nullable
   public static epf a(dbg $$0, iz $$1) {
      if ($$0.c_($$1) instanceof doy $$3) {
         ctk $$4 = $$3.f();
         Optional<xp> $$5 = Optional.ofNullable($$3.ah());
         return new epf($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ji<eph> a() {
      return switch (this.d) {
         case a -> epi.k;
         case b -> epi.l;
         case c -> epi.m;
         case d -> epi.n;
         case e -> epi.o;
         case f -> epi.p;
         case g -> epi.q;
         case h -> epi.r;
         case i -> epi.s;
         case j -> epi.t;
         case k -> epi.u;
         case l -> epi.v;
         case m -> epi.w;
         case n -> epi.x;
         case o -> epi.y;
         case p -> epi.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
