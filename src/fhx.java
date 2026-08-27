import com.google.common.collect.Lists;
import java.util.List;

public class fhx implements fhz {
   private static final vd a = vd.c("spectatorMenu.root.prompt");
   private final List<fia> b = Lists.newArrayList();

   public fhx() {
      this.b.add(new fid());
      this.b.add(new fie());
   }

   @Override
   public List<fia> a() {
      return this.b;
   }

   @Override
   public vd b() {
      return a;
   }
}
