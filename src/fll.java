import com.google.common.collect.Lists;
import java.util.List;

public class fll implements fln {
   private static final vs a = vs.c("spectatorMenu.root.prompt");
   private final List<flo> b = Lists.newArrayList();

   public fll() {
      this.b.add(new flr());
      this.b.add(new fls());
   }

   @Override
   public List<flo> a() {
      return this.b;
   }

   @Override
   public vs b() {
      return a;
   }
}
