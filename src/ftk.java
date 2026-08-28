import com.google.common.collect.Lists;
import java.util.List;

public class ftk implements ftm {
   private static final wy a = wy.c("spectatorMenu.root.prompt");
   private final List<ftn> b = Lists.newArrayList();

   public ftk() {
      this.b.add(new ftq());
      this.b.add(new ftr());
   }

   @Override
   public List<ftn> a() {
      return this.b;
   }

   @Override
   public wy b() {
      return a;
   }
}
