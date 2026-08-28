import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record esg(jf c, cum d, Optional<xe> e) {
   public static final Codec<esg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jf.a.fieldOf("pos").forGetter(esg::c),
               cum.q.lenientOptionalFieldOf("color", cum.a).forGetter(esg::d),
               xg.g.lenientOptionalFieldOf("name").forGetter(esg::e)
            )
            .apply($$0, esg::new)
   );
   public static final Codec<List<esg>> b = a.listOf();

   @Nullable
   public static esg a(ddo $$0, jf $$1) {
      if ($$0.c_($$1) instanceof drk $$3) {
         cum $$4 = $$3.f();
         Optional<xe> $$5 = Optional.ofNullable($$3.al());
         return new esg($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jo<esi> a() {
      return switch (this.d) {
         case a -> esj.k;
         case b -> esj.l;
         case c -> esj.m;
         case d -> esj.n;
         case e -> esj.o;
         case f -> esj.p;
         case g -> esj.q;
         case h -> esj.r;
         case i -> esj.s;
         case j -> esj.t;
         case k -> esj.u;
         case l -> esj.v;
         case m -> esj.w;
         case n -> esj.x;
         case o -> esj.y;
         case p -> esj.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
