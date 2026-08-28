import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record epj(ja c, cst d, Optional<wu> e) {
   public static final Codec<epj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ja.a.fieldOf("pos").forGetter(epj::c),
               cst.q.lenientOptionalFieldOf("color", cst.a).forGetter(epj::d),
               ww.g.lenientOptionalFieldOf("name").forGetter(epj::e)
            )
            .apply($$0, epj::new)
   );
   public static final Codec<List<epj>> b = a.listOf();

   @Nullable
   public static epj a(dbj $$0, ja $$1) {
      if ($$0.c_($$1) instanceof dpc $$3) {
         cst $$4 = $$3.f();
         Optional<wu> $$5 = Optional.ofNullable($$3.ah());
         return new epj($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jj<epl> a() {
      return switch (this.d) {
         case a -> epm.k;
         case b -> epm.l;
         case c -> epm.m;
         case d -> epm.n;
         case e -> epm.o;
         case f -> epm.p;
         case g -> epm.q;
         case h -> epm.r;
         case i -> epm.s;
         case j -> epm.t;
         case k -> epm.u;
         case l -> epm.v;
         case m -> epm.w;
         case n -> epm.x;
         case o -> epm.y;
         case p -> epm.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
