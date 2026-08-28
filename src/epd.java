import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record epd(iz c, cti d, Optional<xp> e) {
   public static final Codec<epd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iz.a.fieldOf("pos").forGetter(epd::c),
               cti.q.lenientOptionalFieldOf("color", cti.a).forGetter(epd::d),
               xr.g.lenientOptionalFieldOf("name").forGetter(epd::e)
            )
            .apply($$0, epd::new)
   );
   public static final Codec<List<epd>> b = a.listOf();

   @Nullable
   public static epd a(dbe $$0, iz $$1) {
      if ($$0.c_($$1) instanceof dow $$3) {
         cti $$4 = $$3.f();
         Optional<xp> $$5 = Optional.ofNullable($$3.ah());
         return new epd($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ji<epf> a() {
      return switch (this.d) {
         case a -> epg.k;
         case b -> epg.l;
         case c -> epg.m;
         case d -> epg.n;
         case e -> epg.o;
         case f -> epg.p;
         case g -> epg.q;
         case h -> epg.r;
         case i -> epg.s;
         case j -> epg.t;
         case k -> epg.u;
         case l -> epg.v;
         case m -> epg.w;
         case n -> epg.x;
         case o -> epg.y;
         case p -> epg.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
