import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record eqk(jd c, cti d, Optional<wz> e) {
   public static final Codec<eqk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jd.a.fieldOf("pos").forGetter(eqk::c),
               cti.q.lenientOptionalFieldOf("color", cti.a).forGetter(eqk::d),
               xb.g.lenientOptionalFieldOf("name").forGetter(eqk::e)
            )
            .apply($$0, eqk::new)
   );
   public static final Codec<List<eqk>> b = a.listOf();

   @Nullable
   public static eqk a(dcc $$0, jd $$1) {
      if ($$0.c_($$1) instanceof dpw $$3) {
         cti $$4 = $$3.f();
         Optional<wz> $$5 = Optional.ofNullable($$3.aj());
         return new eqk($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jm<eqm> a() {
      return switch (this.d) {
         case a -> eqn.k;
         case b -> eqn.l;
         case c -> eqn.m;
         case d -> eqn.n;
         case e -> eqn.o;
         case f -> eqn.p;
         case g -> eqn.q;
         case h -> eqn.r;
         case i -> eqn.s;
         case j -> eqn.t;
         case k -> eqn.u;
         case l -> eqn.v;
         case m -> eqn.w;
         case n -> eqn.x;
         case o -> eqn.y;
         case p -> eqn.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
