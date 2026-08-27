import java.util.Set;

public class fsm extends fsb {
   private static final xe i = xe.c("gui.recipebook.toggleRecipes.smeltable");

   @Override
   protected xe c() {
      return i;
   }

   @Override
   protected Set<cuc> b() {
      return dpp.g().keySet();
   }
}
