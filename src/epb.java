import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record epb(iz c, ctg d, Optional<xo> e) {
   public static final Codec<epb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iz.a.fieldOf("pos").forGetter(epb::c),
               ctg.q.lenientOptionalFieldOf("color", ctg.a).forGetter(epb::d),
               xq.g.lenientOptionalFieldOf("name").forGetter(epb::e)
            )
            .apply($$0, epb::new)
   );
   public static final Codec<List<epb>> b = a.listOf();

   @Nullable
   public static epb a(dbc $$0, iz $$1) {
      if ($$0.c_($$1) instanceof dou $$3) {
         ctg $$4 = $$3.f();
         Optional<xo> $$5 = Optional.ofNullable($$3.ah());
         return new epb($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ji<epd> a() {
      return switch (this.d) {
         case a -> epe.k;
         case b -> epe.l;
         case c -> epe.m;
         case d -> epe.n;
         case e -> epe.o;
         case f -> epe.p;
         case g -> epe.q;
         case h -> epe.r;
         case i -> epe.s;
         case j -> epe.t;
         case k -> epe.u;
         case l -> epe.v;
         case m -> epe.w;
         case n -> epe.x;
         case o -> epe.y;
         case p -> epe.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
