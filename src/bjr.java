import com.mojang.serialization.Codec;

public enum bjr implements auk {
   a("hurt", aqv.sT),
   b("thorns", aqv.yf),
   c("drowning", aqv.sU),
   d("burning", aqv.sW),
   e("poking", aqv.sX),
   f("freezing", aqv.sV);

   public static final Codec<bjr> g = auk.a(bjr::values);
   private final String h;
   private final aqu i;

   private bjr(String $$0, aqu $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public aqu a() {
      return this.i;
   }
}
