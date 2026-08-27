import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum cix implements ask {
   a(0, "none"),
   b(1, "thirdperson_lefthand"),
   c(2, "thirdperson_righthand"),
   d(3, "firstperson_lefthand"),
   e(4, "firstperson_righthand"),
   f(5, "head"),
   g(6, "gui"),
   h(7, "ground"),
   i(8, "fixed");

   public static final Codec<cix> j = ask.a(cix::values);
   public static final IntFunction<cix> k = aqn.a(cix::a, values(), aqn.a.a);
   private final byte l;
   private final String m;

   private cix(int $$0, String $$1) {
      this.m = $$1;
      this.l = (byte)$$0;
   }

   @Override
   public String c() {
      return this.m;
   }

   public byte a() {
      return this.l;
   }

   public boolean b() {
      return this == d || this == e;
   }
}
