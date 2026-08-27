import com.mojang.serialization.Codec;

public record cc(cv c) implements ci {
   public static final Codec<cc> a = cv.c.xmap(cc::new, cc::a);

   @Override
   public boolean a(cto $$0) {
      return this.c.a($$0);
   }

   public static cc a(cv $$0) {
      return new cc($$0);
   }

   public cv a() {
      return this.c;
   }
}
