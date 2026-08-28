import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record epp(ja c, csv d, Optional<wu> e) {
   public static final Codec<epp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ja.a.fieldOf("pos").forGetter(epp::c),
               csv.q.lenientOptionalFieldOf("color", csv.a).forGetter(epp::d),
               ww.g.lenientOptionalFieldOf("name").forGetter(epp::e)
            )
            .apply($$0, epp::new)
   );
   public static final Codec<List<epp>> b = a.listOf();

   @Nullable
   public static epp a(dbl $$0, ja $$1) {
      if ($$0.c_($$1) instanceof dpe $$3) {
         csv $$4 = $$3.f();
         Optional<wu> $$5 = Optional.ofNullable($$3.ai());
         return new epp($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jj<epr> a() {
      return switch (this.d) {
         case a -> eps.k;
         case b -> eps.l;
         case c -> eps.m;
         case d -> eps.n;
         case e -> eps.o;
         case f -> eps.p;
         case g -> eps.q;
         case h -> eps.r;
         case i -> eps.s;
         case j -> eps.t;
         case k -> eps.u;
         case l -> eps.v;
         case m -> eps.w;
         case n -> eps.x;
         case o -> eps.y;
         case p -> eps.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
