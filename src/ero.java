import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record ero(je c, cue d, Optional<xd> e) {
   public static final Codec<ero> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               je.a.fieldOf("pos").forGetter(ero::c),
               cue.q.lenientOptionalFieldOf("color", cue.a).forGetter(ero::d),
               xf.g.lenientOptionalFieldOf("name").forGetter(ero::e)
            )
            .apply($$0, ero::new)
   );
   public static final Codec<List<ero>> b = a.listOf();

   @Nullable
   public static ero a(dcx $$0, je $$1) {
      if ($$0.c_($$1) instanceof dqt $$3) {
         cue $$4 = $$3.f();
         Optional<xd> $$5 = Optional.ofNullable($$3.al());
         return new ero($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jn<erq> a() {
      return switch (this.d) {
         case a -> err.k;
         case b -> err.l;
         case c -> err.m;
         case d -> err.n;
         case e -> err.o;
         case f -> err.p;
         case g -> err.q;
         case h -> err.r;
         case i -> err.s;
         case j -> err.t;
         case k -> err.u;
         case l -> err.v;
         case m -> err.w;
         case n -> err.x;
         case o -> err.y;
         case p -> err.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
