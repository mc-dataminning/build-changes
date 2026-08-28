import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record eyc(iu b, cyb c, Optional<wy> d) {
   public static final Codec<eyc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iu.a.fieldOf("pos").forGetter(eyc::c),
               cyb.q.lenientOptionalFieldOf("color", cyb.a).forGetter(eyc::d),
               xa.a.lenientOptionalFieldOf("name").forGetter(eyc::e)
            )
            .apply($$0, eyc::new)
   );

   @Nullable
   public static eyc a(dig $$0, iu $$1) {
      if ($$0.c_($$1) instanceof dwt $$3) {
         cyb $$4 = $$3.f();
         Optional<wy> $$5 = Optional.ofNullable($$3.an());
         return new eyc($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public je<eye> a() {
      return switch (this.c) {
         case a -> eyf.k;
         case b -> eyf.l;
         case c -> eyf.m;
         case d -> eyf.n;
         case e -> eyf.o;
         case f -> eyf.p;
         case g -> eyf.q;
         case h -> eyf.r;
         case i -> eyf.s;
         case j -> eyf.t;
         case k -> eyf.u;
         case l -> eyf.v;
         case m -> eyf.w;
         case n -> eyf.x;
         case o -> eyf.y;
         case p -> eyf.z;
      };
   }

   public String b() {
      return "banner-" + this.b.u() + "," + this.b.v() + "," + this.b.w();
   }

   public iu c() {
      return this.b;
   }

   public cyb d() {
      return this.c;
   }

   public Optional<wy> e() {
      return this.d;
   }
}
