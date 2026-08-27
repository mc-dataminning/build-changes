import java.util.Set;

public class fcd extends fbs {
   private static final tl i = tl.c("gui.recipebook.toggleRecipes.smeltable");

   @Override
   protected tl d() {
      return i;
   }

   @Override
   protected Set<cja> b() {
      return dck.f().keySet();
   }
}
