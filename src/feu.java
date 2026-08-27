import java.util.Set;

public class feu extends fej {
   private static final uv i = uv.c("gui.recipebook.toggleRecipes.smeltable");

   @Override
   protected uv c() {
      return i;
   }

   @Override
   protected Set<clj> b() {
      return dex.f().keySet();
   }
}
