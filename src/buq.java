import com.mojang.serialization.Codec;

public enum buq implements bak {
   a("hurt", awn.uW),
   b("thorns", awn.uW),
   c("drowning", awn.uX),
   d("burning", awn.uZ),
   e("poking", awn.va),
   f("freezing", awn.uY);

   public static final Codec<buq> g = bak.a(buq::values);
   private final String h;
   private final awm i;

   private buq(final String $$0, final awm $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public awm a() {
      return this.i;
   }
}
