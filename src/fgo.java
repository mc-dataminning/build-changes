import java.util.Set;

public class fgo extends fgd {
   private static final vd i = vd.c("gui.recipebook.toggleRecipes.smeltable");

   @Override
   protected vd c() {
      return i;
   }

   @Override
   protected Set<cmm> b() {
      return dgd.f().keySet();
   }
}
