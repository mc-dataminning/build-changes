import com.mojang.serialization.Codec;

public record cb(cu c) implements ch {
   public static final Codec<cb> a = cu.a.xmap(cb::new, cb::a);

   @Override
   public boolean a(csd $$0) {
      return this.c.a($$0);
   }

   public static cb a(cu $$0) {
      return new cb($$0);
   }

   public cu a() {
      return this.c;
   }
}
