import com.mojang.serialization.Codec;

public enum bsz implements bai {
   a("hurt", awn.uk),
   b("thorns", awn.zB),
   c("drowning", awn.ul),
   d("burning", awn.un),
   e("poking", awn.uo),
   f("freezing", awn.um);

   public static final Codec<bsz> g = bai.a(bsz::values);
   private final String h;
   private final awm i;

   private bsz(final String $$0, final awm $$1) {
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
