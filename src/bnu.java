import com.mojang.serialization.Codec;

public enum bnu implements axq {
   a("hurt", aty.tM),
   b("thorns", aty.yY),
   c("drowning", aty.tN),
   d("burning", aty.tP),
   e("poking", aty.tQ),
   f("freezing", aty.tO);

   public static final Codec<bnu> g = axq.a(bnu::values);
   private final String h;
   private final atx i;

   private bnu(String $$0, atx $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public atx a() {
      return this.i;
   }
}
