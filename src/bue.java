import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bue implements azg, azz {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bue> c = azz.a(bue::values);
   public static final IntFunction<bue> d = axu.a(bue::b, values(), axu.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bue(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bue e() {
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
