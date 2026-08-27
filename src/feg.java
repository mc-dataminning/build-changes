import com.google.common.collect.Lists;
import java.util.List;

public class feg implements fei {
   private static final ui a = ui.c("spectatorMenu.root.prompt");
   private final List<fej> b = Lists.newArrayList();

   public feg() {
      this.b.add(new fem());
      this.b.add(new fen());
   }

   @Override
   public List<fej> a() {
      return this.b;
   }

   @Override
   public ui b() {
      return a;
   }
}
