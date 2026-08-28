import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bwv implements azp, bak {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bwv> c = bak.a(bwv::values);
   public static final IntFunction<bwv> d = ayc.a(bwv::b, values(), ayc.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bwv(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bwv e() {
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
