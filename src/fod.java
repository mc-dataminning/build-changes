import java.util.Set;

public class fod extends foc {
   private static final ws i = ws.c("gui.recipebook.toggleRecipes.blastable");

   @Override
   protected ws c() {
      return i;
   }

   @Override
   protected Set<cry> b() {
      return dmr.g().keySet();
   }
}
