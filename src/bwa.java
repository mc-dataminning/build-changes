import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bwa implements bah, bba {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bwa> c = bba.a(bwa::values);
   public static final IntFunction<bwa> d = ayv.a(bwa::b, values(), ayv.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bwa(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bwa e() {
      return this == a ? b : a;
   }

   @Override
   public int b() {
      return this.e;
   }

   @Override
   public String a() {
      return this.g;
   }

   @Override
   public String c() {
      return this.f;
   }
}
