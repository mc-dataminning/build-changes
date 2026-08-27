import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record eoe(io c, csj d, Optional<wx> e) {
   public static final Codec<eoe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               io.a.fieldOf("pos").forGetter(eoe::c),
               csj.q.lenientOptionalFieldOf("color", csj.a).forGetter(eoe::d),
               wz.g.lenientOptionalFieldOf("name").forGetter(eoe::e)
            )
            .apply($$0, eoe::new)
   );
   public static final Codec<List<eoe>> b = a.listOf();

   @Nullable
   public static eoe a(daf $$0, io $$1) {
      if ($$0.c_($$1) instanceof dnx $$3) {
         csj $$4 = $$3.f();
         Optional<wx> $$5 = Optional.ofNullable($$3.ah());
         return new eoe($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ix<eog> a() {
      return switch (this.d) {
         case a -> eoh.k;
         case b -> eoh.l;
         case c -> eoh.m;
         case d -> eoh.n;
         case e -> eoh.o;
         case f -> eoh.p;
         case g -> eoh.q;
         case h -> eoh.r;
         case i -> eoh.s;
         case j -> eoh.t;
         case k -> eoh.u;
         case l -> eoh.v;
         case m -> eoh.w;
         case n -> eoh.x;
         case o -> eoh.y;
         case p -> eoh.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
