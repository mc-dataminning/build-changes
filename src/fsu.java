import com.google.common.collect.Lists;
import java.util.List;

public class fsu implements fsw {
   private static final wu a = wu.c("spectatorMenu.root.prompt");
   private final List<fsx> b = Lists.newArrayList();

   public fsu() {
      this.b.add(new fta());
      this.b.add(new ftb());
   }

   @Override
   public List<fsx> a() {
      return this.b;
   }

   @Override
   public wu b() {
      return a;
   }
}
