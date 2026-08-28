import java.util.Set;

public class frb extends fra {
   private static final wu i = wu.c("gui.recipebook.toggleRecipes.blastable");

   @Override
   protected wu c() {
      return i;
   }

   @Override
   protected Set<ctx> b() {
      return dpd.g().keySet();
   }
}
