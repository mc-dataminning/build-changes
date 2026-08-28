import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record epc(iz c, cth d, Optional<xo> e) {
   public static final Codec<epc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iz.a.fieldOf("pos").forGetter(epc::c),
               cth.q.lenientOptionalFieldOf("color", cth.a).forGetter(epc::d),
               xq.g.lenientOptionalFieldOf("name").forGetter(epc::e)
            )
            .apply($$0, epc::new)
   );
   public static final Codec<List<epc>> b = a.listOf();

   @Nullable
   public static epc a(dbd $$0, iz $$1) {
      if ($$0.c_($$1) instanceof dov $$3) {
         cth $$4 = $$3.f();
         Optional<xo> $$5 = Optional.ofNullable($$3.ah());
         return new epc($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ji<epe> a() {
      return switch (this.d) {
         case a -> epf.k;
         case b -> epf.l;
         case c -> epf.m;
         case d -> epf.n;
         case e -> epf.o;
         case f -> epf.p;
         case g -> epf.q;
         case h -> epf.r;
         case i -> epf.s;
         case j -> epf.t;
         case k -> epf.u;
         case l -> epf.v;
         case m -> epf.w;
         case n -> epf.x;
         case o -> epf.y;
         case p -> epf.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
