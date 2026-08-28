import com.mojang.serialization.Codec;

public enum bun implements bai {
   a("hurt", awl.uV),
   b("thorns", awl.uV),
   c("drowning", awl.uW),
   d("burning", awl.uY),
   e("poking", awl.uZ),
   f("freezing", awl.uX);

   public static final Codec<bun> g = bai.a(bun::values);
   private final String h;
   private final awk i;

   private bun(final String $$0, final awk $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public awk a() {
      return this.i;
   }
}
