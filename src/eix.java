import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record eix(ib c, cog d, Optional<vs> e) {
   public static final Codec<eix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ib.a.fieldOf("Pos").forGetter(eix::c), cog.q.optionalFieldOf("Color", cog.a).forGetter(eix::d), vu.e.optionalFieldOf("Name").forGetter(eix::e)
            )
            .apply($$0, eix::new)
   );
   public static final Codec<List<eix>> b = a.listOf();

   @Nullable
   public static eix a(cvk $$0, ib $$1) {
      if ($$0.c_($$1) instanceof djb $$3) {
         cog $$4 = $$3.f();
         Optional<vs> $$5 = Optional.ofNullable($$3.af());
         return new eix($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public eiy.a a() {
      return switch (this.d) {
         case a -> eiy.a.k;
         case b -> eiy.a.l;
         case c -> eiy.a.m;
         case d -> eiy.a.n;
         case e -> eiy.a.o;
         case f -> eiy.a.p;
         case g -> eiy.a.q;
         case h -> eiy.a.r;
         case i -> eiy.a.s;
         case j -> eiy.a.t;
         case k -> eiy.a.u;
         case l -> eiy.a.v;
         case m -> eiy.a.w;
         case n -> eiy.a.x;
         case o -> eiy.a.y;
         default -> eiy.a.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
