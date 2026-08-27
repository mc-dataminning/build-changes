import com.google.common.collect.Lists;
import java.util.List;

public class fpb implements fpd {
   private static final wi a = wi.c("spectatorMenu.root.prompt");
   private final List<fpe> b = Lists.newArrayList();

   public fpb() {
      this.b.add(new fph());
      this.b.add(new fpi());
   }

   @Override
   public List<fpe> a() {
      return this.b;
   }

   @Override
   public wi b() {
      return a;
   }
}
