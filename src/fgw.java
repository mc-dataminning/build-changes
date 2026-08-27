import java.util.Set;

public class fgw extends fgl {
   private static final vf i = vf.c("gui.recipebook.toggleRecipes.smeltable");

   @Override
   protected vf c() {
      return i;
   }

   @Override
   protected Set<cmt> b() {
      return dgk.f().keySet();
   }
}
