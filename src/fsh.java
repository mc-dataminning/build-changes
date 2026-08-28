import com.google.common.collect.Lists;
import java.util.List;

public class fsh implements fsj {
   private static final xp a = xp.c("spectatorMenu.root.prompt");
   private final List<fsk> b = Lists.newArrayList();

   public fsh() {
      this.b.add(new fsn());
      this.b.add(new fso());
   }

   @Override
   public List<fsk> a() {
      return this.b;
   }

   @Override
   public xp b() {
      return a;
   }
}
