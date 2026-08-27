import java.util.Set;

public class fbs extends fbh {
   private static final tf i = tf.c("gui.recipebook.toggleRecipes.smeltable");

   @Override
   protected tf d() {
      return i;
   }

   @Override
   protected Set<cit> b() {
      return dcb.f().keySet();
   }
}
