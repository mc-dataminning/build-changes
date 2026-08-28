import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record evk(jh c, cwm d, Optional<xv> e) {
   public static final Codec<evk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jh.a.fieldOf("pos").forGetter(evk::c),
               cwm.q.lenientOptionalFieldOf("color", cwm.a).forGetter(evk::d),
               xx.g.lenientOptionalFieldOf("name").forGetter(evk::e)
            )
            .apply($$0, evk::new)
   );
   public static final Codec<List<evk>> b = a.listOf();

   @Nullable
   public static evk a(dgn $$0, jh $$1) {
      if ($$0.c_($$1) instanceof dum $$3) {
         cwm $$4 = $$3.f();
         Optional<xv> $$5 = Optional.ofNullable($$3.an());
         return new evk($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jq<evm> a() {
      return switch (this.d) {
         case a -> evn.k;
         case b -> evn.l;
         case c -> evn.m;
         case d -> evn.n;
         case e -> evn.o;
         case f -> evn.p;
         case g -> evn.q;
         case h -> evn.r;
         case i -> evn.s;
         case j -> evn.t;
         case k -> evn.u;
         case l -> evn.v;
         case m -> evn.w;
         case n -> evn.x;
         case o -> evn.y;
         case p -> evn.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
