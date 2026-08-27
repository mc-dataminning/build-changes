import java.util.Set;

public class ffx extends ffm {
   private static final vb i = vb.c("gui.recipebook.toggleRecipes.smeltable");

   @Override
   protected vb c() {
      return i;
   }

   @Override
   protected Set<cmc> b() {
      return dfs.f().keySet();
   }
}
