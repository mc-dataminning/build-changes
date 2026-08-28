import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record esr(jg c, cuu d, Optional<xh> e) {
   public static final Codec<esr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jg.a.fieldOf("pos").forGetter(esr::c),
               cuu.q.lenientOptionalFieldOf("color", cuu.a).forGetter(esr::d),
               xj.g.lenientOptionalFieldOf("name").forGetter(esr::e)
            )
            .apply($$0, esr::new)
   );
   public static final Codec<List<esr>> b = a.listOf();

   @Nullable
   public static esr a(dea $$0, jg $$1) {
      if ($$0.c_($$1) instanceof drv $$3) {
         cuu $$4 = $$3.f();
         Optional<xh> $$5 = Optional.ofNullable($$3.an());
         return new esr($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jp<est> a() {
      return switch (this.d) {
         case a -> esu.k;
         case b -> esu.l;
         case c -> esu.m;
         case d -> esu.n;
         case e -> esu.o;
         case f -> esu.p;
         case g -> esu.q;
         case h -> esu.r;
         case i -> esu.s;
         case j -> esu.t;
         case k -> esu.u;
         case l -> esu.v;
         case m -> esu.w;
         case n -> esu.x;
         case o -> esu.y;
         case p -> esu.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
