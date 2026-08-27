import java.util.Set;

public class fbz extends fbn {
   private static final tl i = tl.c("gui.recipebook.toggleRecipes.smokable");

   @Override
   protected tl d() {
      return i;
   }

   @Override
   protected Set<cjg> b() {
      return dco.f().keySet();
   }
}
