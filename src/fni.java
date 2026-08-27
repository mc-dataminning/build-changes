import java.util.Set;

public class fni extends fmx {
   private static final wg i = wg.c("gui.recipebook.toggleRecipes.smeltable");

   @Override
   protected wg c() {
      return i;
   }

   @Override
   protected Set<cre> b() {
      return dlt.g().keySet();
   }
}
