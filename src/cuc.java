import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record cuc(ik c, boolean d) {
   public static final Codec<cuc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ik.a.forGetter(cuc::a), aws.a(Codec.BOOL, "tracked", true).forGetter(cuc::b)).apply($$0, cuc::new)
   );
   public static final ye<ByteBuf, cuc> b = ye.a(ik.c, cuc::a, yc.b, cuc::b, cuc::new);

   public boolean a(aps $$0) {
      if (!this.d) {
         return false;
      } else if (this.c.a() != $$0.ae()) {
         return false;
      } else {
         ib $$1 = this.c.b();
         return !$$0.k($$1) || !$$0.y().a(cbv.s, $$1);
      }
   }

   public ik a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
