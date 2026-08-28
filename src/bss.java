import com.mojang.serialization.Codec;

public enum bss implements bag {
   a("hurt", awl.uk),
   b("thorns", awl.zB),
   c("drowning", awl.ul),
   d("burning", awl.un),
   e("poking", awl.uo),
   f("freezing", awl.um);

   public static final Codec<bss> g = bag.a(bss::values);
   private final String h;
   private final awk i;

   private bss(final String $$0, final awk $$1) {
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
