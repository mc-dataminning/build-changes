import java.util.Set;

public class fcn extends fcm {
   private static final ui i = ui.c("gui.recipebook.toggleRecipes.blastable");

   @Override
   protected ui c() {
      return i;
   }

   @Override
   protected Set<cke> b() {
      return ddm.f().keySet();
   }
}
