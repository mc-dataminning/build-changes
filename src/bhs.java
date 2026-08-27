import com.mojang.serialization.Codec;

public enum bhs implements asu {
   a("hurt", apg.sz),
   b("thorns", apg.xK),
   c("drowning", apg.sA),
   d("burning", apg.sC),
   e("poking", apg.sD),
   f("freezing", apg.sB);

   public static final Codec<bhs> g = asu.a(bhs::values);
   private final String h;
   private final apf i;

   private bhs(String $$0, apf $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public apf a() {
      return this.i;
   }
}
