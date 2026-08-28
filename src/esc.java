import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record esc(je c, cuj d, Optional<xd> e) {
   public static final Codec<esc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               je.a.fieldOf("pos").forGetter(esc::c),
               cuj.q.lenientOptionalFieldOf("color", cuj.a).forGetter(esc::d),
               xf.g.lenientOptionalFieldOf("name").forGetter(esc::e)
            )
            .apply($$0, esc::new)
   );
   public static final Codec<List<esc>> b = a.listOf();

   @Nullable
   public static esc a(ddl $$0, je $$1) {
      if ($$0.c_($$1) instanceof drh $$3) {
         cuj $$4 = $$3.f();
         Optional<xd> $$5 = Optional.ofNullable($$3.al());
         return new esc($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jn<ese> a() {
      return switch (this.d) {
         case a -> esf.k;
         case b -> esf.l;
         case c -> esf.m;
         case d -> esf.n;
         case e -> esf.o;
         case f -> esf.p;
         case g -> esf.q;
         case h -> esf.r;
         case i -> esf.s;
         case j -> esf.t;
         case k -> esf.u;
         case l -> esf.v;
         case m -> esf.w;
         case n -> esf.x;
         case o -> esf.y;
         case p -> esf.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
