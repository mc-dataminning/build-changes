import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record ejv(ib c, cpd d, Optional<vu> e) {
   public static final Codec<ejv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ib.a.fieldOf("pos").forGetter(ejv::c), cpd.q.optionalFieldOf("color", cpd.a).forGetter(ejv::d), vw.e.optionalFieldOf("name").forGetter(ejv::e)
            )
            .apply($$0, ejv::new)
   );
   public static final Codec<List<ejv>> b = a.listOf();

   @Nullable
   public static ejv a(cwh $$0, ib $$1) {
      if ($$0.c_($$1) instanceof djy $$3) {
         cpd $$4 = $$3.f();
         Optional<vu> $$5 = Optional.ofNullable($$3.af());
         return new ejv($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public ejw.a a() {
      return switch (this.d) {
         case a -> ejw.a.k;
         case b -> ejw.a.l;
         case c -> ejw.a.m;
         case d -> ejw.a.n;
         case e -> ejw.a.o;
         case f -> ejw.a.p;
         case g -> ejw.a.q;
         case h -> ejw.a.r;
         case i -> ejw.a.s;
         case j -> ejw.a.t;
         case k -> ejw.a.u;
         case l -> ejw.a.v;
         case m -> ejw.a.w;
         case n -> ejw.a.x;
         case o -> ejw.a.y;
         default -> ejw.a.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
