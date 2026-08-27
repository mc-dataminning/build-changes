import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record ejt(ib c, cpb d, Optional<vu> e) {
   public static final Codec<ejt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ib.a.fieldOf("pos").forGetter(ejt::c), cpb.q.optionalFieldOf("color", cpb.a).forGetter(ejt::d), vw.e.optionalFieldOf("name").forGetter(ejt::e)
            )
            .apply($$0, ejt::new)
   );
   public static final Codec<List<ejt>> b = a.listOf();

   @Nullable
   public static ejt a(cwf $$0, ib $$1) {
      if ($$0.c_($$1) instanceof djw $$3) {
         cpb $$4 = $$3.f();
         Optional<vu> $$5 = Optional.ofNullable($$3.af());
         return new ejt($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public eju.a a() {
      return switch (this.d) {
         case a -> eju.a.k;
         case b -> eju.a.l;
         case c -> eju.a.m;
         case d -> eju.a.n;
         case e -> eju.a.o;
         case f -> eju.a.p;
         case g -> eju.a.q;
         case h -> eju.a.r;
         case i -> eju.a.s;
         case j -> eju.a.t;
         case k -> eju.a.u;
         case l -> eju.a.v;
         case m -> eju.a.w;
         case n -> eju.a.x;
         case o -> eju.a.y;
         default -> eju.a.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
