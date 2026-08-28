import com.google.common.collect.Lists;
import java.util.List;

public class fsg implements fsi {
   private static final xp a = xp.c("spectatorMenu.root.prompt");
   private final List<fsj> b = Lists.newArrayList();

   public fsg() {
      this.b.add(new fsm());
      this.b.add(new fsn());
   }

   @Override
   public List<fsj> a() {
      return this.b;
   }

   @Override
   public xp b() {
      return a;
   }
}
