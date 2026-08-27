import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record eni(in c, crs d, Optional<wu> e) {
   public static final Codec<eni> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               in.a.fieldOf("pos").forGetter(eni::c), crs.q.optionalFieldOf("color", crs.a).forGetter(eni::d), ww.g.optionalFieldOf("name").forGetter(eni::e)
            )
            .apply($$0, eni::new)
   );
   public static final Codec<List<eni>> b = a.listOf();

   @Nullable
   public static eni a(czj $$0, in $$1) {
      if ($$0.c_($$1) instanceof dnb $$3) {
         crs $$4 = $$3.f();
         Optional<wu> $$5 = Optional.ofNullable($$3.af());
         return new eni($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public iw<enk> a() {
      return switch (this.d) {
         case a -> enl.k;
         case b -> enl.l;
         case c -> enl.m;
         case d -> enl.n;
         case e -> enl.o;
         case f -> enl.p;
         case g -> enl.q;
         case h -> enl.r;
         case i -> enl.s;
         case j -> enl.t;
         case k -> enl.u;
         case l -> enl.v;
         case m -> enl.w;
         case n -> enl.x;
         case o -> enl.y;
         case p -> enl.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
