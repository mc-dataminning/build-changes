import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record eun(ji c, cvn d, Optional<wp> e) {
   public static final Codec<eun> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ji.a.fieldOf("pos").forGetter(eun::c),
               cvn.q.lenientOptionalFieldOf("color", cvn.a).forGetter(eun::d),
               wr.g.lenientOptionalFieldOf("name").forGetter(eun::e)
            )
            .apply($$0, eun::new)
   );
   public static final Codec<List<eun>> b = a.listOf();

   @Nullable
   public static eun a(dfo $$0, ji $$1) {
      if ($$0.c_($$1) instanceof dtp $$3) {
         cvn $$4 = $$3.f();
         Optional<wp> $$5 = Optional.ofNullable($$3.an());
         return new eun($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jr<eup> a() {
      return switch (this.d) {
         case a -> euq.k;
         case b -> euq.l;
         case c -> euq.m;
         case d -> euq.n;
         case e -> euq.o;
         case f -> euq.p;
         case g -> euq.q;
         case h -> euq.r;
         case i -> euq.s;
         case j -> euq.t;
         case k -> euq.u;
         case l -> euq.v;
         case m -> euq.w;
         case n -> euq.x;
         case o -> euq.y;
         case p -> euq.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
