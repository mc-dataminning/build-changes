import com.google.common.collect.Lists;
import java.util.List;

public class fsf implements fsh {
   private static final xo a = xo.c("spectatorMenu.root.prompt");
   private final List<fsi> b = Lists.newArrayList();

   public fsf() {
      this.b.add(new fsl());
      this.b.add(new fsm());
   }

   @Override
   public List<fsi> a() {
      return this.b;
   }

   @Override
   public xo b() {
      return a;
   }
}
