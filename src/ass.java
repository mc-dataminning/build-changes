import java.util.ArrayList;
import java.util.List;

public class ass {
   private final List<ast> a = new ArrayList<>();

   public static ass a() {
      return new ass();
   }

   public List<ast> b() {
      return List.copyOf(this.a);
   }

   public ass a(ast $$0) {
      this.a.add($$0);
      return this;
   }

   public ass a(ahg $$0) {
      return this.a(ast.a($$0));
   }

   public ass b(ahg $$0) {
      return this.a(ast.b($$0));
   }

   public ass c(ahg $$0) {
      return this.a(ast.c($$0));
   }

   public ass d(ahg $$0) {
      return this.a(ast.d($$0));
   }
}
