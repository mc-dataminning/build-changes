import com.mojang.serialization.Codec;

public enum bqn implements ayz {
   a("hurt", avi.ui),
   b("thorns", avi.zu),
   c("drowning", avi.uj),
   d("burning", avi.ul),
   e("poking", avi.um),
   f("freezing", avi.uk);

   public static final Codec<bqn> g = ayz.a(bqn::values);
   private final String h;
   private final avh i;

   private bqn(String $$0, avh $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public avh a() {
      return this.i;
   }
}
