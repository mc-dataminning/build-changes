import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bsv implements ayj, azc {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bsv> c = azc.a(bsv::values);
   public static final IntFunction<bsv> d = aww.a(bsv::a, values(), aww.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bsv(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bsv e() {
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
