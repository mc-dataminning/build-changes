import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record exu(iu b, cxw c, Optional<wy> d) {
   public static final Codec<exu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iu.a.fieldOf("pos").forGetter(exu::c),
               cxw.q.lenientOptionalFieldOf("color", cxw.a).forGetter(exu::d),
               xa.a.lenientOptionalFieldOf("name").forGetter(exu::e)
            )
            .apply($$0, exu::new)
   );

   @Nullable
   public static exu a(dib $$0, iu $$1) {
      if ($$0.c_($$1) instanceof dwl $$3) {
         cxw $$4 = $$3.f();
         Optional<wy> $$5 = Optional.ofNullable($$3.an());
         return new exu($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public je<exw> a() {
      return switch (this.c) {
         case a -> exx.k;
         case b -> exx.l;
         case c -> exx.m;
         case d -> exx.n;
         case e -> exx.o;
         case f -> exx.p;
         case g -> exx.q;
         case h -> exx.r;
         case i -> exx.s;
         case j -> exx.t;
         case k -> exx.u;
         case l -> exx.v;
         case m -> exx.w;
         case n -> exx.x;
         case o -> exx.y;
         case p -> exx.z;
      };
   }

   public String b() {
      return "banner-" + this.b.u() + "," + this.b.v() + "," + this.b.w();
   }

   public iu c() {
      return this.b;
   }

   public cxw d() {
      return this.c;
   }

   public Optional<wy> e() {
      return this.d;
   }
}
