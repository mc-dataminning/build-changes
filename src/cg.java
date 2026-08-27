import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class cg implements di<dai> {
   private final List<bn> a;

   protected cg(List<bn> $$0) {
      this.a = $$0;
   }

   public static <T extends cg> Codec<T> a(Function<List<bn>, T> $$0) {
      return bn.a.listOf().xmap($$0, cg::b);
   }

   protected List<bn> b() {
      return this.a;
   }

   public boolean a(cuh $$0, dai $$1) {
      for (bn $$2 : this.a) {
         if (!$$2.a($$1)) {
            return false;
         }
      }

      return true;
   }

   public static cg.a a(List<bn> $$0) {
      return new cg.a($$0);
   }

   public static cg.b b(List<bn> $$0) {
      return new cg.b($$0);
   }

   public static class a extends cg {
      public static final Codec<cg.a> a = a(cg.a::new);

      protected a(List<bn> $$0) {
         super($$0);
      }

      @Override
      public kd<dai> a() {
         return ke.i;
      }
   }

   public static class b extends cg {
      public static final Codec<cg.b> a = a(cg.b::new);

      protected b(List<bn> $$0) {
         super($$0);
      }

      @Override
      public kd<dai> a() {
         return ke.w;
      }
   }
}
