import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record euk(ji c, cvk d, Optional<wo> e) {
   public static final Codec<euk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ji.a.fieldOf("pos").forGetter(euk::c),
               cvk.q.lenientOptionalFieldOf("color", cvk.a).forGetter(euk::d),
               wq.g.lenientOptionalFieldOf("name").forGetter(euk::e)
            )
            .apply($$0, euk::new)
   );
   public static final Codec<List<euk>> b = a.listOf();

   @Nullable
   public static euk a(dfl $$0, ji $$1) {
      if ($$0.c_($$1) instanceof dtm $$3) {
         cvk $$4 = $$3.f();
         Optional<wo> $$5 = Optional.ofNullable($$3.an());
         return new euk($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public jr<eum> a() {
      return switch (this.d) {
         case a -> eun.k;
         case b -> eun.l;
         case c -> eun.m;
         case d -> eun.n;
         case e -> eun.o;
         case f -> eun.p;
         case g -> eun.q;
         case h -> eun.r;
         case i -> eun.s;
         case j -> eun.t;
         case k -> eun.u;
         case l -> eun.v;
         case m -> eun.w;
         case n -> eun.x;
         case o -> eun.y;
         case p -> eun.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
