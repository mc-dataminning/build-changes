import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record eze(iw b, cyy c, Optional<xc> d) {
   public static final Codec<eze> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iw.a.fieldOf("pos").forGetter(eze::c),
               cyy.q.lenientOptionalFieldOf("color", cyy.a).forGetter(eze::d),
               xe.a.lenientOptionalFieldOf("name").forGetter(eze::e)
            )
            .apply($$0, eze::new)
   );

   @Nullable
   public static eze a(djd $$0, iw $$1) {
      if ($$0.c_($$1) instanceof dxs $$3) {
         cyy $$4 = $$3.f();
         Optional<xc> $$5 = Optional.ofNullable($$3.ak());
         return new eze($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jg<ezg> a() {
      return switch (this.c) {
         case a -> ezh.k;
         case b -> ezh.l;
         case c -> ezh.m;
         case d -> ezh.n;
         case e -> ezh.o;
         case f -> ezh.p;
         case g -> ezh.q;
         case h -> ezh.r;
         case i -> ezh.s;
         case j -> ezh.t;
         case k -> ezh.u;
         case l -> ezh.v;
         case m -> ezh.w;
         case n -> ezh.x;
         case o -> ezh.y;
         case p -> ezh.z;
      };
   }

   public String b() {
      return "banner-" + this.b.u() + "," + this.b.v() + "," + this.b.w();
   }

   public iw c() {
      return this.b;
   }

   public cyy d() {
      return this.c;
   }

   public Optional<xc> e() {
      return this.d;
   }
}
