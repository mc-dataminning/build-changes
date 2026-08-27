import com.google.common.collect.Lists;
import java.util.List;

public class fml implements fmn {
   private static final vu a = vu.c("spectatorMenu.root.prompt");
   private final List<fmo> b = Lists.newArrayList();

   public fml() {
      this.b.add(new fmr());
      this.b.add(new fms());
   }

   @Override
   public List<fmo> a() {
      return this.b;
   }

   @Override
   public vu b() {
      return a;
   }
}
