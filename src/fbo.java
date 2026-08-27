import java.util.Set;

public class fbo extends fbn {
   private static final tl i = tl.c("gui.recipebook.toggleRecipes.blastable");

   @Override
   protected tl d() {
      return i;
   }

   @Override
   protected Set<cjg> b() {
      return dco.f().keySet();
   }
}
