import com.mojang.serialization.Codec;

public enum bhe implements ash {
   a("hurt", aow.sz),
   b("thorns", aow.xK),
   c("drowning", aow.sA),
   d("burning", aow.sC),
   e("poking", aow.sD),
   f("freezing", aow.sB);

   public static final Codec<bhe> g = ash.a(bhe::values);
   private final String h;
   private final aov i;

   private bhe(String $$0, aov $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public aov a() {
      return this.i;
   }
}
