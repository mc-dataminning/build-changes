import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record eyj(iv b, cyi c, Optional<wy> d) {
   public static final Codec<eyj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iv.a.fieldOf("pos").forGetter(eyj::c),
               cyi.q.lenientOptionalFieldOf("color", cyi.a).forGetter(eyj::d),
               xa.a.lenientOptionalFieldOf("name").forGetter(eyj::e)
            )
            .apply($$0, eyj::new)
   );

   @Nullable
   public static eyj a(din $$0, iv $$1) {
      if ($$0.c_($$1) instanceof dxa $$3) {
         cyi $$4 = $$3.f();
         Optional<wy> $$5 = Optional.ofNullable($$3.ak());
         return new eyj($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jf<eyl> a() {
      return switch (this.c) {
         case a -> eym.k;
         case b -> eym.l;
         case c -> eym.m;
         case d -> eym.n;
         case e -> eym.o;
         case f -> eym.p;
         case g -> eym.q;
         case h -> eym.r;
         case i -> eym.s;
         case j -> eym.t;
         case k -> eym.u;
         case l -> eym.v;
         case m -> eym.w;
         case n -> eym.x;
         case o -> eym.y;
         case p -> eym.z;
      };
   }

   public String b() {
      return "banner-" + this.b.u() + "," + this.b.v() + "," + this.b.w();
   }

   public iv c() {
      return this.b;
   }

   public cyi d() {
      return this.c;
   }

   public Optional<wy> e() {
      return this.d;
   }
}
