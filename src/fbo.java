import java.util.Set;

public class fbo extends fbn {
   private static final ti i = ti.c("gui.recipebook.toggleRecipes.blastable");

   @Override
   protected ti d() {
      return i;
   }

   @Override
   protected Set<civ> b() {
      return dcf.f().keySet();
   }
}
