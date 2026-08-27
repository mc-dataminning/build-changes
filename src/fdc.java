import com.google.common.collect.Lists;
import java.util.List;

public class fdc implements fde {
   private static final tf a = tf.c("spectatorMenu.root.prompt");
   private final List<fdf> b = Lists.newArrayList();

   public fdc() {
      this.b.add(new fdi());
      this.b.add(new fdj());
   }

   @Override
   public List<fdf> a() {
      return this.b;
   }

   @Override
   public tf b() {
      return a;
   }
}
