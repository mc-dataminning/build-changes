import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bvb implements azc, azv {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bvb> c = azv.a(bvb::values);
   public static final IntFunction<bvb> d = axq.a(bvb::b, values(), axq.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bvb(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bvb e() {
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
