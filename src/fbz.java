import java.util.Set;

public class fbz extends fbn {
   private static final ti i = ti.c("gui.recipebook.toggleRecipes.smokable");

   @Override
   protected ti d() {
      return i;
   }

   @Override
   protected Set<civ> b() {
      return dcf.f().keySet();
   }
}
