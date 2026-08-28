import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ezc(iv b, cyw c, Optional<xa> d) {
   public static final Codec<ezc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iv.a.fieldOf("pos").forGetter(ezc::c),
               cyw.q.lenientOptionalFieldOf("color", cyw.a).forGetter(ezc::d),
               xc.a.lenientOptionalFieldOf("name").forGetter(ezc::e)
            )
            .apply($$0, ezc::new)
   );

   @Nullable
   public static ezc a(djb $$0, iv $$1) {
      if ($$0.c_($$1) instanceof dxq $$3) {
         cyw $$4 = $$3.f();
         Optional<xa> $$5 = Optional.ofNullable($$3.ak());
         return new ezc($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jf<eze> a() {
      return switch (this.c) {
         case a -> ezf.k;
         case b -> ezf.l;
         case c -> ezf.m;
         case d -> ezf.n;
         case e -> ezf.o;
         case f -> ezf.p;
         case g -> ezf.q;
         case h -> ezf.r;
         case i -> ezf.s;
         case j -> ezf.t;
         case k -> ezf.u;
         case l -> ezf.v;
         case m -> ezf.w;
         case n -> ezf.x;
         case o -> ezf.y;
         case p -> ezf.z;
      };
   }

   public String b() {
      return "banner-" + this.b.u() + "," + this.b.v() + "," + this.b.w();
   }

   public iv c() {
      return this.b;
   }

   public cyw d() {
      return this.c;
   }

   public Optional<xa> e() {
      return this.d;
   }
}
