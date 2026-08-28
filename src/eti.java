import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record eti(jh c, cvj d, Optional<xj> e) {
   public static final Codec<eti> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jh.a.fieldOf("pos").forGetter(eti::c),
               cvj.q.lenientOptionalFieldOf("color", cvj.a).forGetter(eti::d),
               xl.g.lenientOptionalFieldOf("name").forGetter(eti::e)
            )
            .apply($$0, eti::new)
   );
   public static final Codec<List<eti>> b = a.listOf();

   @Nullable
   public static eti a(der $$0, jh $$1) {
      if ($$0.c_($$1) instanceof dsn $$3) {
         cvj $$4 = $$3.f();
         Optional<xj> $$5 = Optional.ofNullable($$3.an());
         return new eti($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jq<etk> a() {
      return switch (this.d) {
         case a -> etl.k;
         case b -> etl.l;
         case c -> etl.m;
         case d -> etl.n;
         case e -> etl.o;
         case f -> etl.p;
         case g -> etl.q;
         case h -> etl.r;
         case i -> etl.s;
         case j -> etl.t;
         case k -> etl.u;
         case l -> etl.v;
         case m -> etl.w;
         case n -> etl.x;
         case o -> etl.y;
         case p -> etl.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
