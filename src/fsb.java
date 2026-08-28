import com.google.common.collect.Lists;
import java.util.List;

public class fsb implements fsd {
   private static final xl a = xl.c("spectatorMenu.root.prompt");
   private final List<fse> b = Lists.newArrayList();

   public fsb() {
      this.b.add(new fsh());
      this.b.add(new fsi());
   }

   @Override
   public List<fse> a() {
      return this.b;
   }

   @Override
   public xl b() {
      return a;
   }
}
