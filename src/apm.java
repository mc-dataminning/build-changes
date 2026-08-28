import java.util.Vector;
import javax.swing.JList;
import net.minecraft.server.MinecraftServer;

public class apm extends JList<String> {
   private final MinecraftServer a;
   private int b;

   public apm(MinecraftServer $$0) {
      this.a = $$0;
      $$0.b(this::a);
   }

   public void a() {
      if (this.b++ % 20 == 0) {
         Vector<String> $$0 = new Vector<>();

         for (int $$1 = 0; $$1 < this.a.ai().t().size(); $$1++) {
            $$0.add(this.a.ai().t().get($$1).fY().getName());
         }

         this.setListData($$0);
      }
   }
}
