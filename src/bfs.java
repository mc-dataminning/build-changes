import com.mojang.serialization.Codec;

public class bfs extends bfv {
   public static final bfs a = new bfs(0);
   public static final Codec<bfs> b = aqy.c(Codec.INT, Codec.INT.fieldOf("value").codec()).xmap(bfs::new, bfs::d);
   private final int f;

   public static bfs a(int $$0) {
      return $$0 == 0 ? a : new bfs($$0);
   }

   private bfs(int $$0) {
      this.f = $$0;
   }

   public int d() {
      return this.f;
   }

   @Override
   public int a(aru $$0) {
      return this.f;
   }

   @Override
   public int a() {
      return this.f;
   }

   @Override
   public int b() {
      return this.f;
   }

   @Override
   public bfw<?> c() {
      return bfw.a;
   }

   @Override
   public String toString() {
      return Integer.toString(this.f);
   }
}
