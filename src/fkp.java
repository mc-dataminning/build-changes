import com.google.common.collect.Lists;
import java.util.List;

public class fkp implements fkr {
   private static final vq a = vq.c("spectatorMenu.root.prompt");
   private final List<fks> b = Lists.newArrayList();

   public fkp() {
      this.b.add(new fkv());
      this.b.add(new fkw());
   }

   @Override
   public List<fks> a() {
      return this.b;
   }

   @Override
   public vq b() {
      return a;
   }
}
