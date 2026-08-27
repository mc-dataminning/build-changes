import com.mojang.serialization.Codec;

public enum bow implements ayg {
   a("hurt", auo.tP),
   b("thorns", auo.zb),
   c("drowning", auo.tQ),
   d("burning", auo.tS),
   e("poking", auo.tT),
   f("freezing", auo.tR);

   public static final Codec<bow> g = ayg.a(bow::values);
   private final String h;
   private final aun i;

   private bow(String $$0, aun $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public aun a() {
      return this.i;
   }
}
