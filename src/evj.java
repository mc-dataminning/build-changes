import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record evj(jh c, cwl d, Optional<xv> e) {
   public static final Codec<evj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jh.a.fieldOf("pos").forGetter(evj::c),
               cwl.q.lenientOptionalFieldOf("color", cwl.a).forGetter(evj::d),
               xx.g.lenientOptionalFieldOf("name").forGetter(evj::e)
            )
            .apply($$0, evj::new)
   );
   public static final Codec<List<evj>> b = a.listOf();

   @Nullable
   public static evj a(dgm $$0, jh $$1) {
      if ($$0.c_($$1) instanceof dul $$3) {
         cwl $$4 = $$3.f();
         Optional<xv> $$5 = Optional.ofNullable($$3.an());
         return new evj($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jq<evl> a() {
      return switch (this.d) {
         case a -> evm.k;
         case b -> evm.l;
         case c -> evm.m;
         case d -> evm.n;
         case e -> evm.o;
         case f -> evm.p;
         case g -> evm.q;
         case h -> evm.r;
         case i -> evm.s;
         case j -> evm.t;
         case k -> evm.u;
         case l -> evm.v;
         case m -> evm.w;
         case n -> evm.x;
         case o -> evm.y;
         case p -> evm.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
