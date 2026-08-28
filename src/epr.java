import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record epr(ja c, csw d, Optional<wu> e) {
   public static final Codec<epr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ja.a.fieldOf("pos").forGetter(epr::c),
               csw.q.lenientOptionalFieldOf("color", csw.a).forGetter(epr::d),
               ww.g.lenientOptionalFieldOf("name").forGetter(epr::e)
            )
            .apply($$0, epr::new)
   );
   public static final Codec<List<epr>> b = a.listOf();

   @Nullable
   public static epr a(dbm $$0, ja $$1) {
      if ($$0.c_($$1) instanceof dpf $$3) {
         csw $$4 = $$3.f();
         Optional<wu> $$5 = Optional.ofNullable($$3.aj());
         return new epr($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jj<ept> a() {
      return switch (this.d) {
         case a -> epu.k;
         case b -> epu.l;
         case c -> epu.m;
         case d -> epu.n;
         case e -> epu.o;
         case f -> epu.p;
         case g -> epu.q;
         case h -> epu.r;
         case i -> epu.s;
         case j -> epu.t;
         case k -> epu.u;
         case l -> epu.v;
         case m -> epu.w;
         case n -> epu.x;
         case o -> epu.y;
         case p -> epu.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
