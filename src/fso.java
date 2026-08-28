import com.google.common.collect.Lists;
import java.util.List;

public class fso implements fsq {
   private static final wu a = wu.c("spectatorMenu.root.prompt");
   private final List<fsr> b = Lists.newArrayList();

   public fso() {
      this.b.add(new fsu());
      this.b.add(new fsv());
   }

   @Override
   public List<fsr> a() {
      return this.b;
   }

   @Override
   public wu b() {
      return a;
   }
}
