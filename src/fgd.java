import com.google.common.collect.Lists;
import java.util.List;

public class fgd implements fgf {
   private static final uv a = uv.c("spectatorMenu.root.prompt");
   private final List<fgg> b = Lists.newArrayList();

   public fgd() {
      this.b.add(new fgj());
      this.b.add(new fgk());
   }

   @Override
   public List<fgg> a() {
      return this.b;
   }

   @Override
   public uv b() {
      return a;
   }
}
