import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record exi(iu c, cxq d, Optional<ww> e) {
   public static final Codec<exi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iu.a.fieldOf("pos").forGetter(exi::c),
               cxq.q.lenientOptionalFieldOf("color", cxq.a).forGetter(exi::d),
               wy.a.lenientOptionalFieldOf("name").forGetter(exi::e)
            )
            .apply($$0, exi::new)
   );
   public static final Codec<List<exi>> b = a.listOf();

   @Nullable
   public static exi a(dhv $$0, iu $$1) {
      if ($$0.c_($$1) instanceof dwb $$3) {
         cxq $$4 = $$3.f();
         Optional<ww> $$5 = Optional.ofNullable($$3.an());
         return new exi($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public je<exk> a() {
      return switch (this.d) {
         case a -> exl.k;
         case b -> exl.l;
         case c -> exl.m;
         case d -> exl.n;
         case e -> exl.o;
         case f -> exl.p;
         case g -> exl.q;
         case h -> exl.r;
         case i -> exl.s;
         case j -> exl.t;
         case k -> exl.u;
         case l -> exl.v;
         case m -> exl.w;
         case n -> exl.x;
         case o -> exl.y;
         case p -> exl.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
