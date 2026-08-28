import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record eyo(iv b, cyl c, Optional<wy> d) {
   public static final Codec<eyo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iv.a.fieldOf("pos").forGetter(eyo::c),
               cyl.q.lenientOptionalFieldOf("color", cyl.a).forGetter(eyo::d),
               xa.a.lenientOptionalFieldOf("name").forGetter(eyo::e)
            )
            .apply($$0, eyo::new)
   );

   @Nullable
   public static eyo a(diq $$0, iv $$1) {
      if ($$0.c_($$1) instanceof dxf $$3) {
         cyl $$4 = $$3.f();
         Optional<wy> $$5 = Optional.ofNullable($$3.ak());
         return new eyo($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jf<eyq> a() {
      return switch (this.c) {
         case a -> eyr.k;
         case b -> eyr.l;
         case c -> eyr.m;
         case d -> eyr.n;
         case e -> eyr.o;
         case f -> eyr.p;
         case g -> eyr.q;
         case h -> eyr.r;
         case i -> eyr.s;
         case j -> eyr.t;
         case k -> eyr.u;
         case l -> eyr.v;
         case m -> eyr.w;
         case n -> eyr.x;
         case o -> eyr.y;
         case p -> eyr.z;
      };
   }

   public String b() {
      return "banner-" + this.b.u() + "," + this.b.v() + "," + this.b.w();
   }

   public iv c() {
      return this.b;
   }

   public cyl d() {
      return this.c;
   }

   public Optional<wy> e() {
      return this.d;
   }
}
