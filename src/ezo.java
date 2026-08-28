import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ezo(iw b, czi c, Optional<xg> d) {
   public static final Codec<ezo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iw.a.fieldOf("pos").forGetter(ezo::c),
               czi.q.lenientOptionalFieldOf("color", czi.a).forGetter(ezo::d),
               xi.a.lenientOptionalFieldOf("name").forGetter(ezo::e)
            )
            .apply($$0, ezo::new)
   );

   @Nullable
   public static ezo a(djn $$0, iw $$1) {
      if ($$0.c_($$1) instanceof dyc $$3) {
         czi $$4 = $$3.f();
         Optional<xg> $$5 = Optional.ofNullable($$3.ak());
         return new ezo($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jg<ezq> a() {
      return switch (this.c) {
         case a -> ezr.k;
         case b -> ezr.l;
         case c -> ezr.m;
         case d -> ezr.n;
         case e -> ezr.o;
         case f -> ezr.p;
         case g -> ezr.q;
         case h -> ezr.r;
         case i -> ezr.s;
         case j -> ezr.t;
         case k -> ezr.u;
         case l -> ezr.v;
         case m -> ezr.w;
         case n -> ezr.x;
         case o -> ezr.y;
         case p -> ezr.z;
      };
   }

   public String b() {
      return "banner-" + this.b.u() + "," + this.b.v() + "," + this.b.w();
   }

   public iw c() {
      return this.b;
   }

   public czi d() {
      return this.c;
   }

   public Optional<xg> e() {
      return this.d;
   }
}
