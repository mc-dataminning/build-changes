import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum bvr implements azx, baq {
   a(0, "left", "options.mainHand.left"),
   b(1, "right", "options.mainHand.right");

   public static final Codec<bvr> c = baq.a(bvr::values);
   public static final IntFunction<bvr> d = ayl.a(bvr::b, values(), ayl.a.a);
   private final int e;
   private final String f;
   private final String g;

   private bvr(final int $$0, final String $$1, final String $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public bvr e() {
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
