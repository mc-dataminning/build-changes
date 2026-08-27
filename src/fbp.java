import java.util.Set;

public class fbp extends fbd {
   private static final te i = te.c("gui.recipebook.toggleRecipes.smokable");

   @Override
   protected te d() {
      return i;
   }

   @Override
   protected Set<cir> b() {
      return dbz.f().keySet();
   }
}
