import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record eum(ji c, cvm d, Optional<wp> e) {
   public static final Codec<eum> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ji.a.fieldOf("pos").forGetter(eum::c),
               cvm.q.lenientOptionalFieldOf("color", cvm.a).forGetter(eum::d),
               wr.g.lenientOptionalFieldOf("name").forGetter(eum::e)
            )
            .apply($$0, eum::new)
   );
   public static final Codec<List<eum>> b = a.listOf();

   @Nullable
   public static eum a(dfn $$0, ji $$1) {
      if ($$0.c_($$1) instanceof dto $$3) {
         cvm $$4 = $$3.f();
         Optional<wp> $$5 = Optional.ofNullable($$3.an());
         return new eum($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jr<euo> a() {
      return switch (this.d) {
         case a -> eup.k;
         case b -> eup.l;
         case c -> eup.m;
         case d -> eup.n;
         case e -> eup.o;
         case f -> eup.p;
         case g -> eup.q;
         case h -> eup.r;
         case i -> eup.s;
         case j -> eup.t;
         case k -> eup.u;
         case l -> eup.v;
         case m -> eup.w;
         case n -> eup.x;
         case o -> eup.y;
         case p -> eup.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
