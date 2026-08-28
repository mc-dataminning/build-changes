import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record eoy(iz c, ctd d, Optional<xl> e) {
   public static final Codec<eoy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iz.a.fieldOf("pos").forGetter(eoy::c),
               ctd.q.lenientOptionalFieldOf("color", ctd.a).forGetter(eoy::d),
               xn.g.lenientOptionalFieldOf("name").forGetter(eoy::e)
            )
            .apply($$0, eoy::new)
   );
   public static final Codec<List<eoy>> b = a.listOf();

   @Nullable
   public static eoy a(daz $$0, iz $$1) {
      if ($$0.c_($$1) instanceof dor $$3) {
         ctd $$4 = $$3.f();
         Optional<xl> $$5 = Optional.ofNullable($$3.ah());
         return new eoy($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ji<epa> a() {
      return switch (this.d) {
         case a -> epb.k;
         case b -> epb.l;
         case c -> epb.m;
         case d -> epb.n;
         case e -> epb.o;
         case f -> epb.p;
         case g -> epb.q;
         case h -> epb.r;
         case i -> epb.s;
         case j -> epb.t;
         case k -> epb.u;
         case l -> epb.v;
         case m -> epb.w;
         case n -> epb.x;
         case o -> epb.y;
         case p -> epb.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
