import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record epe(iz c, ctj d, Optional<xp> e) {
   public static final Codec<epe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iz.a.fieldOf("pos").forGetter(epe::c),
               ctj.q.lenientOptionalFieldOf("color", ctj.a).forGetter(epe::d),
               xr.g.lenientOptionalFieldOf("name").forGetter(epe::e)
            )
            .apply($$0, epe::new)
   );
   public static final Codec<List<epe>> b = a.listOf();

   @Nullable
   public static epe a(dbf $$0, iz $$1) {
      if ($$0.c_($$1) instanceof dox $$3) {
         ctj $$4 = $$3.f();
         Optional<xp> $$5 = Optional.ofNullable($$3.ah());
         return new epe($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ji<epg> a() {
      return switch (this.d) {
         case a -> eph.k;
         case b -> eph.l;
         case c -> eph.m;
         case d -> eph.n;
         case e -> eph.o;
         case f -> eph.p;
         case g -> eph.q;
         case h -> eph.r;
         case i -> eph.s;
         case j -> eph.t;
         case k -> eph.u;
         case l -> eph.v;
         case m -> eph.w;
         case n -> eph.x;
         case o -> eph.y;
         case p -> eph.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
