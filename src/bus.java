import com.mojang.serialization.Codec;

public enum bus implements bak {
   a("hurt", awn.uZ),
   b("thorns", awn.uZ),
   c("drowning", awn.va),
   d("burning", awn.vc),
   e("poking", awn.vd),
   f("freezing", awn.vb);

   public static final Codec<bus> g = bak.a(bus::values);
   private final String h;
   private final awm i;

   private bus(final String $$0, final awm $$1) {
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
