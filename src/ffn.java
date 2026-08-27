import java.util.Set;

public class ffn extends ffm {
   private static final vb i = vb.c("gui.recipebook.toggleRecipes.blastable");

   @Override
   protected vb c() {
      return i;
   }

   @Override
   protected Set<cmc> b() {
      return dfs.f().keySet();
   }
}
