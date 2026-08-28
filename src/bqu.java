import com.mojang.serialization.Codec;

public enum bqu implements ayz {
   a("hurt", avf.ul),
   b("thorns", avf.zx),
   c("drowning", avf.um),
   d("burning", avf.uo),
   e("poking", avf.up),
   f("freezing", avf.un);

   public static final Codec<bqu> g = ayz.a(bqu::values);
   private final String h;
   private final ave i;

   private bqu(final String $$0, final ave $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public ave a() {
      return this.i;
   }
}
