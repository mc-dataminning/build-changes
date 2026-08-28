import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record evc(jh c, cwh d, Optional<xv> e) {
   public static final Codec<evc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jh.a.fieldOf("pos").forGetter(evc::c),
               cwh.q.lenientOptionalFieldOf("color", cwh.a).forGetter(evc::d),
               xx.g.lenientOptionalFieldOf("name").forGetter(evc::e)
            )
            .apply($$0, evc::new)
   );
   public static final Codec<List<evc>> b = a.listOf();

   @Nullable
   public static evc a(dgf $$0, jh $$1) {
      if ($$0.c_($$1) instanceof due $$3) {
         cwh $$4 = $$3.f();
         Optional<xv> $$5 = Optional.ofNullable($$3.an());
         return new evc($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jq<eve> a() {
      return switch (this.d) {
         case a -> evf.k;
         case b -> evf.l;
         case c -> evf.m;
         case d -> evf.n;
         case e -> evf.o;
         case f -> evf.p;
         case g -> evf.q;
         case h -> evf.r;
         case i -> evf.s;
         case j -> evf.t;
         case k -> evf.u;
         case l -> evf.v;
         case m -> evf.w;
         case n -> evf.x;
         case o -> evf.y;
         case p -> evf.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
