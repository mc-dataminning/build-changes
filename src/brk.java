import com.mojang.serialization.Codec;

public enum brk implements azt {
   a("hurt", avz.ui),
   b("thorns", avz.zu),
   c("drowning", avz.uj),
   d("burning", avz.ul),
   e("poking", avz.um),
   f("freezing", avz.uk);

   public static final Codec<brk> g = azt.a(brk::values);
   private final String h;
   private final avy i;

   private brk(final String $$0, final avy $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public avy a() {
      return this.i;
   }
}
