import com.mojang.serialization.Codec;

public enum bkl implements ave {
   a("hurt", arm.to),
   b("thorns", arm.yA),
   c("drowning", arm.tp),
   d("burning", arm.tr),
   e("poking", arm.ts),
   f("freezing", arm.tq);

   public static final Codec<bkl> g = ave.a(bkl::values);
   private final String h;
   private final arl i;

   private bkl(String $$0, arl $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public arl a() {
      return this.i;
   }
}
