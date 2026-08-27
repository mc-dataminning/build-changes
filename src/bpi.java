import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bpi implements awy, axq {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bpi> c = axq.a(bpi::values);
   public static final IntFunction<bpi> d = avn.a(bpi::a, values(), avn.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bpi(int $$0, String $$1, String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bpi e() {
      return this == a ? b : a;
   }

   @Override
   public int a() {
      return this.e;
   }

   @Override
   public String b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.f;
   }
}
