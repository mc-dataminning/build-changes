import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record eqm(ir c, csy d, Optional<xe> e) {
   public static final Codec<eqm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ir.a.fieldOf("pos").forGetter(eqm::c), csy.q.optionalFieldOf("color", csy.a).forGetter(eqm::d), xg.g.optionalFieldOf("name").forGetter(eqm::e)
            )
            .apply($$0, eqm::new)
   );
   public static final Codec<List<eqm>> b = a.listOf();

   @Nullable
   public static eqm a(dbg $$0, ir $$1) {
      if ($$0.c_($$1) instanceof dpq $$3) {
         csy $$4 = $$3.f();
         Optional<xe> $$5 = Optional.ofNullable($$3.ah());
         return new eqm($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ja<eqo> a() {
      return switch (this.d) {
         case a -> eqp.k;
         case b -> eqp.l;
         case c -> eqp.m;
         case d -> eqp.n;
         case e -> eqp.o;
         case f -> eqp.p;
         case g -> eqp.q;
         case h -> eqp.r;
         case i -> eqp.s;
         case j -> eqp.t;
         case k -> eqp.u;
         case l -> eqp.v;
         case m -> eqp.w;
         case n -> eqp.x;
         case o -> eqp.y;
         case p -> eqp.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
