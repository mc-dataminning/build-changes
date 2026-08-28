import com.mojang.serialization.Codec;

public record cn(dn c) implements cw {
   public static final Codec<cn> a = dn.a.xmap(cn::new, cn::a);

   @Override
   public boolean a(cxy $$0) {
      return this.c.a($$0);
   }

   public static cn a(dn $$0) {
      return new cn($$0);
   }

   public dn a() {
      return this.c;
   }
}
