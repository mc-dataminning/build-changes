import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record evj(ji c, cwe d, Optional<wp> e) {
   public static final Codec<evj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ji.a.fieldOf("pos").forGetter(evj::c),
               cwe.q.lenientOptionalFieldOf("color", cwe.a).forGetter(evj::d),
               wr.a.lenientOptionalFieldOf("name").forGetter(evj::e)
            )
            .apply($$0, evj::new)
   );
   public static final Codec<List<evj>> b = a.listOf();

   @Nullable
   public static evj a(dgf $$0, ji $$1) {
      if ($$0.c_($$1) instanceof duh $$3) {
         cwe $$4 = $$3.f();
         Optional<wp> $$5 = Optional.ofNullable($$3.an());
         return new evj($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jr<evl> a() {
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
