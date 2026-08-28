import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record eqg(jd c, ctg d, Optional<wy> e) {
   public static final Codec<eqg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jd.a.fieldOf("pos").forGetter(eqg::c),
               ctg.q.lenientOptionalFieldOf("color", ctg.a).forGetter(eqg::d),
               xa.g.lenientOptionalFieldOf("name").forGetter(eqg::e)
            )
            .apply($$0, eqg::new)
   );
   public static final Codec<List<eqg>> b = a.listOf();

   @Nullable
   public static eqg a(dca $$0, jd $$1) {
      if ($$0.c_($$1) instanceof dpu $$3) {
         ctg $$4 = $$3.f();
         Optional<wy> $$5 = Optional.ofNullable($$3.aj());
         return new eqg($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jm<eqi> a() {
      return switch (this.d) {
         case a -> eqj.k;
         case b -> eqj.l;
         case c -> eqj.m;
         case d -> eqj.n;
         case e -> eqj.o;
         case f -> eqj.p;
         case g -> eqj.q;
         case h -> eqj.r;
         case i -> eqj.s;
         case j -> eqj.t;
         case k -> eqj.u;
         case l -> eqj.v;
         case m -> eqj.w;
         case n -> eqj.x;
         case o -> eqj.y;
         case p -> eqj.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
