import com.google.common.collect.Lists;
import java.util.List;

public class fsi implements fsk {
   private static final xp a = xp.c("spectatorMenu.root.prompt");
   private final List<fsl> b = Lists.newArrayList();

   public fsi() {
      this.b.add(new fso());
      this.b.add(new fsp());
   }

   @Override
   public List<fsl> a() {
      return this.b;
   }

   @Override
   public xp b() {
      return a;
   }
}
