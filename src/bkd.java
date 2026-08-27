import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bkd implements ata, atr {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bkd> c = atr.a(bkd::values);
   public static final IntFunction<bkd> d = arr.a(bkd::a, values(), arr.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bkd(int $$0, String $$1, String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bkd e() {
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
