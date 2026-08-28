import com.mojang.serialization.Codec;

public enum bvi implements bao {
   a("hurt", awr.uZ),
   b("thorns", awr.uZ),
   c("drowning", awr.va),
   d("burning", awr.vc),
   e("poking", awr.vd),
   f("freezing", awr.vb);

   public static final Codec<bvi> g = bao.a(bvi::values);
   private final String h;
   private final awq i;

   private bvi(final String $$0, final awq $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public awq a() {
      return this.i;
   }
}
