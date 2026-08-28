import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bxw implements bac, bax {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bxw> c = bax.a(bxw::values);
   public static final IntFunction<bxw> d = ayo.a(bxw::b, values(), ayo.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bxw(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bxw e() {
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
