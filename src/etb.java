import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record etb(jh c, cvc d, Optional<xl> e) {
   public static final Codec<etb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jh.a.fieldOf("pos").forGetter(etb::c),
               cvc.q.lenientOptionalFieldOf("color", cvc.a).forGetter(etb::d),
               xn.g.lenientOptionalFieldOf("name").forGetter(etb::e)
            )
            .apply($$0, etb::new)
   );
   public static final Codec<List<etb>> b = a.listOf();

   @Nullable
   public static etb a(dek $$0, jh $$1) {
      if ($$0.c_($$1) instanceof dsg $$3) {
         cvc $$4 = $$3.f();
         Optional<xl> $$5 = Optional.ofNullable($$3.ao());
         return new etb($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jq<etd> a() {
      return switch (this.d) {
         case a -> ete.k;
         case b -> ete.l;
         case c -> ete.m;
         case d -> ete.n;
         case e -> ete.o;
         case f -> ete.p;
         case g -> ete.q;
         case h -> ete.r;
         case i -> ete.s;
         case j -> ete.t;
         case k -> ete.u;
         case l -> ete.v;
         case m -> ete.w;
         case n -> ete.x;
         case o -> ete.y;
         case p -> ete.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
