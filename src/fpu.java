import java.util.Set;

public class fpu extends fpi {
   private static final wx i = wx.c("gui.recipebook.toggleRecipes.smokable");

   @Override
   protected wx c() {
      return i;
   }

   @Override
   protected Set<ctl> b() {
      return dnw.g().keySet();
   }
}
