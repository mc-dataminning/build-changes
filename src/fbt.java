import java.util.Set;

public class fbt extends fbs {
   private static final tl i = tl.c("gui.recipebook.toggleRecipes.blastable");

   @Override
   protected tl d() {
      return i;
   }

   @Override
   protected Set<cja> b() {
      return dck.f().keySet();
   }
}
