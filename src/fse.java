import com.google.common.collect.Lists;
import java.util.List;

public class fse implements fsg {
   private static final xo a = xo.c("spectatorMenu.root.prompt");
   private final List<fsh> b = Lists.newArrayList();

   public fse() {
      this.b.add(new fsk());
      this.b.add(new fsl());
   }

   @Override
   public List<fsh> a() {
      return this.b;
   }

   @Override
   public xo b() {
      return a;
   }
}
