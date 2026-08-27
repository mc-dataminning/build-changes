import java.util.Set;

public class ffy extends ffm {
   private static final vb i = vb.c("gui.recipebook.toggleRecipes.smokable");

   @Override
   protected vb c() {
      return i;
   }

   @Override
   protected Set<cmc> b() {
      return dfs.f().keySet();
   }
}
