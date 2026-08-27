import com.mojang.serialization.Codec;

public enum bql implements ayx {
   a("hurt", avh.ui),
   b("thorns", avh.zu),
   c("drowning", avh.uj),
   d("burning", avh.ul),
   e("poking", avh.um),
   f("freezing", avh.uk);

   public static final Codec<bql> g = ayx.a(bql::values);
   private final String h;
   private final avg i;

   private bql(String $$0, avg $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public avg a() {
      return this.i;
   }
}
