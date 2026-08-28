import com.mojang.serialization.Codec;

public enum bsn implements baf {
   a("hurt", awk.uk),
   b("thorns", awk.zB),
   c("drowning", awk.ul),
   d("burning", awk.un),
   e("poking", awk.uo),
   f("freezing", awk.um);

   public static final Codec<bsn> g = baf.a(bsn::values);
   private final String h;
   private final awj i;

   private bsn(final String $$0, final awj $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public awj a() {
      return this.i;
   }
}
