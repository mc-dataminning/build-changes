import com.mojang.serialization.Codec;

public enum bel implements apr {
   a("hurt", amh.sz),
   b("thorns", amh.xE),
   c("drowning", amh.sA),
   d("burning", amh.sC),
   e("poking", amh.sD),
   f("freezing", amh.sB);

   public static final Codec<bel> g = apr.a(bel::values);
   private final String h;
   private final amg i;

   private bel(String $$0, amg $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public amg a() {
      return this.i;
   }
}
