import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record esx(jh c, cuy d, Optional<xi> e) {
   public static final Codec<esx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jh.a.fieldOf("pos").forGetter(esx::c),
               cuy.q.lenientOptionalFieldOf("color", cuy.a).forGetter(esx::d),
               xk.g.lenientOptionalFieldOf("name").forGetter(esx::e)
            )
            .apply($$0, esx::new)
   );
   public static final Codec<List<esx>> b = a.listOf();

   @Nullable
   public static esx a(deg $$0, jh $$1) {
      if ($$0.c_($$1) instanceof dsb $$3) {
         cuy $$4 = $$3.f();
         Optional<xi> $$5 = Optional.ofNullable($$3.ao());
         return new esx($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jq<esz> a() {
      return switch (this.d) {
         case a -> eta.k;
         case b -> eta.l;
         case c -> eta.m;
         case d -> eta.n;
         case e -> eta.o;
         case f -> eta.p;
         case g -> eta.q;
         case h -> eta.r;
         case i -> eta.s;
         case j -> eta.t;
         case k -> eta.u;
         case l -> eta.v;
         case m -> eta.w;
         case n -> eta.x;
         case o -> eta.y;
         case p -> eta.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
