import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record emj(id c, cql d, Optional<wi> e) {
   public static final Codec<emj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               id.a.fieldOf("pos").forGetter(emj::c), cql.q.optionalFieldOf("color", cql.a).forGetter(emj::d), wk.g.optionalFieldOf("name").forGetter(emj::e)
            )
            .apply($$0, emj::new)
   );
   public static final Codec<List<emj>> b = a.listOf();

   @Nullable
   public static emj a(cym $$0, id $$1) {
      if ($$0.c_($$1) instanceof dmd $$3) {
         cql $$4 = $$3.f();
         Optional<wi> $$5 = Optional.ofNullable($$3.af());
         return new emj($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public emk.a a() {
      return switch (this.d) {
         case a -> emk.a.k;
         case b -> emk.a.l;
         case c -> emk.a.m;
         case d -> emk.a.n;
         case e -> emk.a.o;
         case f -> emk.a.p;
         case g -> emk.a.q;
         case h -> emk.a.r;
         case i -> emk.a.s;
         case j -> emk.a.t;
         case k -> emk.a.u;
         case l -> emk.a.v;
         case m -> emk.a.w;
         case n -> emk.a.x;
         case o -> emk.a.y;
         default -> emk.a.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
