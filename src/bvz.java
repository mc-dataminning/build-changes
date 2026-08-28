import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bvz implements bah, bba {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bvz> c = bba.a(bvz::values);
   public static final IntFunction<bvz> d = ayv.a(bvz::b, values(), ayv.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bvz(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bvz e() {
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
