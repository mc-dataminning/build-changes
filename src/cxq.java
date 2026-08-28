import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cxq(Optional<jl> c, boolean d) {
   public static final Codec<cxq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jl.b.optionalFieldOf("target").forGetter(cxq::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cxq::b)).apply($$0, cxq::new)
   );
   public static final yx<ByteBuf, cxq> b = yx.a(jl.c.a(yv::a), cxq::a, yv.b, cxq::b, cxq::new);

   public cxq a(aqu $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.af()) {
            return this;
         } else {
            jd $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cew.s, $$1) ? this : new cxq(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jl> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
