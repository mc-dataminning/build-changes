import com.google.common.collect.Lists;
import java.util.List;

public class fdm implements fdo {
   private static final tm a = tm.c("spectatorMenu.root.prompt");
   private final List<fdp> b = Lists.newArrayList();

   public fdm() {
      this.b.add(new fds());
      this.b.add(new fdt());
   }

   @Override
   public List<fdp> a() {
      return this.b;
   }

   @Override
   public tm b() {
      return a;
   }
}
