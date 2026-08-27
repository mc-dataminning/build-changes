import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record eoc(io c, csh d, Optional<wx> e) {
   public static final Codec<eoc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               io.a.fieldOf("pos").forGetter(eoc::c),
               csh.q.lenientOptionalFieldOf("color", csh.a).forGetter(eoc::d),
               wz.g.lenientOptionalFieldOf("name").forGetter(eoc::e)
            )
            .apply($$0, eoc::new)
   );
   public static final Codec<List<eoc>> b = a.listOf();

   @Nullable
   public static eoc a(dad $$0, io $$1) {
      if ($$0.c_($$1) instanceof dnv $$3) {
         csh $$4 = $$3.f();
         Optional<wx> $$5 = Optional.ofNullable($$3.ah());
         return new eoc($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ix<eoe> a() {
      return switch (this.d) {
         case a -> eof.k;
         case b -> eof.l;
         case c -> eof.m;
         case d -> eof.n;
         case e -> eof.o;
         case f -> eof.p;
         case g -> eof.q;
         case h -> eof.r;
         case i -> eof.s;
         case j -> eof.t;
         case k -> eof.u;
         case l -> eof.v;
         case m -> eof.w;
         case n -> eof.x;
         case o -> eof.y;
         case p -> eof.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
