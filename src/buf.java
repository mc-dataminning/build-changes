import com.mojang.serialization.Codec;

public enum buf implements bag {
   a("hurt", awk.uV),
   b("thorns", awk.uV),
   c("drowning", awk.uW),
   d("burning", awk.uY),
   e("poking", awk.uZ),
   f("freezing", awk.uX);

   public static final Codec<buf> g = bag.a(buf::values);
   private final String h;
   private final awj i;

   private buf(final String $$0, final awj $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public awj a() {
      return this.i;
   }
}
