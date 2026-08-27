import java.util.Set;

public class fce extends fbs {
   private static final tm i = tm.c("gui.recipebook.toggleRecipes.smokable");

   @Override
   protected tm d() {
      return i;
   }

   @Override
   protected Set<cja> b() {
      return dck.f().keySet();
   }
}
