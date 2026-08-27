import java.util.Set;

public class fgp extends fgd {
   private static final vd i = vd.c("gui.recipebook.toggleRecipes.smokable");

   @Override
   protected vd c() {
      return i;
   }

   @Override
   protected Set<cmm> b() {
      return dgd.f().keySet();
   }
}
