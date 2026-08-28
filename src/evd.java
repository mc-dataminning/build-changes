import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record evd(jh c, cwd d, Optional<xk> e) {
   public static final Codec<evd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jh.a.fieldOf("pos").forGetter(evd::c),
               cwd.q.lenientOptionalFieldOf("color", cwd.a).forGetter(evd::d),
               xm.g.lenientOptionalFieldOf("name").forGetter(evd::e)
            )
            .apply($$0, evd::new)
   );
   public static final Codec<List<evd>> b = a.listOf();

   @Nullable
   public static evd a(dge $$0, jh $$1) {
      if ($$0.c_($$1) instanceof duf $$3) {
         cwd $$4 = $$3.f();
         Optional<xk> $$5 = Optional.ofNullable($$3.an());
         return new evd($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jq<evf> a() {
      return switch (this.d) {
         case a -> evg.k;
         case b -> evg.l;
         case c -> evg.m;
         case d -> evg.n;
         case e -> evg.o;
         case f -> evg.p;
         case g -> evg.q;
         case h -> evg.r;
         case i -> evg.s;
         case j -> evg.t;
         case k -> evg.u;
         case l -> evg.v;
         case m -> evg.w;
         case n -> evg.x;
         case o -> evg.y;
         case p -> evg.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
