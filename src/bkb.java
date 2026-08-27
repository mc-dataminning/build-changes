import com.mojang.serialization.Codec;

public enum bkb implements aut {
   a("hurt", arc.to),
   b("thorns", arc.yA),
   c("drowning", arc.tp),
   d("burning", arc.tr),
   e("poking", arc.ts),
   f("freezing", arc.tq);

   public static final Codec<bkb> g = aut.a(bkb::values);
   private final String h;
   private final arb i;

   private bkb(String $$0, arb $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public arb a() {
      return this.i;
   }
}
