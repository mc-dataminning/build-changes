import java.util.Set;

public class fep extends fee {
   private static final ur i = ur.c("gui.recipebook.toggleRecipes.smeltable");

   @Override
   protected ur c() {
      return i;
   }

   @Override
   protected Set<cle> b() {
      return des.f().keySet();
   }
}
