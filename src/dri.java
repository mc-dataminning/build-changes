import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.function.Consumer;

public class dri implements cxx {
   public static final Codec<dri> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("level").forGetter($$0x -> $$0x.c)).apply($$0, dri::new));
   public static final zc<ByteBuf, dri> b = za.b(a);
   private final int c;
   private final float d;

   public dri(int $$0) {
      this.c = $$0;
      this.d = a($$0);
   }

   public boolean a() {
      return this.c >= 1;
   }

   public int b() {
      return this.c;
   }

   @Override
   public void a(Consumer<xe> $$0, cwi $$1) {
      if (this.a()) {
         xs $$2 = this.c == 1 ? xe.c("lubrication.tooltip.lubricated") : xe.a("lubrication.tooltip.lubricated_times", this.c);
         $$0.accept($$2.a(n.g));
      }

      if ($$1.a()) {
         $$0.accept(xe.b("lubricationFactor: " + this.d).a(n.h));
      }
   }

   private static float a(int $$0) {
      return $$0 <= 0 ? 0.0F : 1.0F - (float)Math.pow(0.75, (double)$$0 + 6.228262518959627);
   }

   public float a(float $$0) {
      return this.a() ? 1.0F - (1.0F - $$0) * (1.0F - this.d) : $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         dri $$1 = (dri)$$0;
         return this.c == $$1.c;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.c);
   }

   public static void a(cuh $$0) {
      dri $$1 = $$0.a(ke.am);
      if ($$1 != null) {
         $$0.b(ke.am, new dri($$1.c + 1));
      } else {
         $$0.b(ke.am, new dri(1));
      }
   }
}
