import com.mojang.serialization.Codec;

public record cd(cw c) implements cj {
   public static final Codec<cd> a = cw.c.xmap(cd::new, cd::a);

   @Override
   public boolean a(cuh $$0) {
      return this.c.a($$0);
   }

   public static cd a(cw $$0) {
      return new cd($$0);
   }

   public cw a() {
      return this.c;
   }
}
