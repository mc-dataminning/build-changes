import java.util.Vector;
import javax.swing.JList;
import net.minecraft.server.MinecraftServer;

public class ami extends JList<String> {
   private final MinecraftServer a;
   private int b;

   public ami(MinecraftServer $$0) {
      this.a = $$0;
      $$0.b(this::a);
   }

   public void a() {
      if (this.b++ % 20 == 0) {
         Vector<String> $$0 = new Vector<>();

         for (int $$1 = 0; $$1 < this.a.ae().t().size(); $$1++) {
            $$0.add(this.a.ae().t().get($$1).fR().getName());
         }

         this.setListData($$0);
      }
   }
}
