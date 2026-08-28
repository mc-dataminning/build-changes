import com.google.common.collect.Lists;
import java.util.List;

public class fsw implements fsy {
   private static final wu a = wu.c("spectatorMenu.root.prompt");
   private final List<fsz> b = Lists.newArrayList();

   public fsw() {
      this.b.add(new ftc());
      this.b.add(new ftd());
   }

   @Override
   public List<fsz> a() {
      return this.b;
   }

   @Override
   public wu b() {
      return a;
   }
}
