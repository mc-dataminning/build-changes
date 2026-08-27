import java.util.Set;

public class fbv extends fbu {
   private static final tn i = tn.c("gui.recipebook.toggleRecipes.blastable");

   @Override
   protected tn d() {
      return i;
   }

   @Override
   protected Set<cjc> b() {
      return dcm.f().keySet();
   }
}
