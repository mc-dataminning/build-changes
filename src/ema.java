import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record ema(ib c, cqc d, Optional<wg> e) {
   public static final Codec<ema> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ib.a.fieldOf("pos").forGetter(ema::c), cqc.q.optionalFieldOf("color", cqc.a).forGetter(ema::d), wi.g.optionalFieldOf("name").forGetter(ema::e)
            )
            .apply($$0, ema::new)
   );
   public static final Codec<List<ema>> b = a.listOf();

   @Nullable
   public static ema a(cyd $$0, ib $$1) {
      if ($$0.c_($$1) instanceof dlu $$3) {
         cqc $$4 = $$3.f();
         Optional<wg> $$5 = Optional.ofNullable($$3.af());
         return new ema($$1, $$4, $$5);
      } else {
         return null;
      }
   }

   public emb.a a() {
      return switch (this.d) {
         case a -> emb.a.k;
         case b -> emb.a.l;
         case c -> emb.a.m;
         case d -> emb.a.n;
         case e -> emb.a.o;
         case f -> emb.a.p;
         case g -> emb.a.q;
         case h -> emb.a.r;
         case i -> emb.a.s;
         case j -> emb.a.t;
         case k -> emb.a.u;
         case l -> emb.a.v;
         case m -> emb.a.w;
         case n -> emb.a.x;
         case o -> emb.a.y;
         default -> emb.a.z;
      };
   }

   public String b() {
      return "banner-" + this.c.u() + "," + this.c.v() + "," + this.c.w();
   }
}
