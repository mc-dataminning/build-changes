import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record ewg(jj c, cwv d, Optional<wv> e) {
   public static final Codec<ewg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jj.a.fieldOf("pos").forGetter(ewg::c),
               cwv.q.lenientOptionalFieldOf("color", cwv.a).forGetter(ewg::d),
               wx.a.lenientOptionalFieldOf("name").forGetter(ewg::e)
            )
            .apply($$0, ewg::new)
   );
   public static final Codec<List<ewg>> b = a.listOf();

   @Nullable
   public static ewg a(dgv $$0, jj $$1) {
      if ($$0.c_($$1) instanceof duz $$3) {
         cwv $$4 = $$3.f();
         Optional<wv> $$5 = Optional.ofNullable($$3.an());
         return new ewg($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public js<ewi> a() {
      return switch (this.d) {
         case a -> ewj.k;
         case b -> ewj.l;
         case c -> ewj.m;
         case d -> ewj.n;
         case e -> ewj.o;
         case f -> ewj.p;
         case g -> ewj.q;
         case h -> ewj.r;
         case i -> ewj.s;
         case j -> ewj.t;
         case k -> ewj.u;
         case l -> ewj.v;
         case m -> ewj.w;
         case n -> ewj.x;
         case o -> ewj.y;
         case p -> ewj.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
