import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record eul(ji c, cvl d, Optional<wp> e) {
   public static final Codec<eul> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ji.a.fieldOf("pos").forGetter(eul::c),
               cvl.q.lenientOptionalFieldOf("color", cvl.a).forGetter(eul::d),
               wr.g.lenientOptionalFieldOf("name").forGetter(eul::e)
            )
            .apply($$0, eul::new)
   );
   public static final Codec<List<eul>> b = a.listOf();

   @Nullable
   public static eul a(dfm $$0, ji $$1) {
      if ($$0.c_($$1) instanceof dtn $$3) {
         cvl $$4 = $$3.f();
         Optional<wp> $$5 = Optional.ofNullable($$3.an());
         return new eul($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jr<eun> a() {
      return switch (this.d) {
         case a -> euo.k;
         case b -> euo.l;
         case c -> euo.m;
         case d -> euo.n;
         case e -> euo.o;
         case f -> euo.p;
         case g -> euo.q;
         case h -> euo.r;
         case i -> euo.s;
         case j -> euo.t;
         case k -> euo.u;
         case l -> euo.v;
         case m -> euo.w;
         case n -> euo.x;
         case o -> euo.y;
         case p -> euo.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
