import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record emz(im c, cqw d, Optional<ws> e) {
   public static final Codec<emz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               im.a.fieldOf("pos").forGetter(emz::c), cqw.q.optionalFieldOf("color", cqw.a).forGetter(emz::d), wu.g.optionalFieldOf("name").forGetter(emz::e)
            )
            .apply($$0, emz::new)
   );
   public static final Codec<List<emz>> b = a.listOf();

   @Nullable
   public static emz a(cza $$0, im $$1) {
      if ($$0.c_($$1) instanceof dms $$3) {
         cqw $$4 = $$3.f();
         Optional<ws> $$5 = Optional.ofNullable($$3.af());
         return new emz($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ena.a a() {
      return switch (this.d) {
         case a -> ena.a.k;
         case b -> ena.a.l;
         case c -> ena.a.m;
         case d -> ena.a.n;
         case e -> ena.a.o;
         case f -> ena.a.p;
         case g -> ena.a.q;
         case h -> ena.a.r;
         case i -> ena.a.s;
         case j -> ena.a.t;
         case k -> ena.a.u;
         case l -> ena.a.v;
         case m -> ena.a.w;
         case n -> ena.a.x;
         case o -> ena.a.y;
         default -> ena.a.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
