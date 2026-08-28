import java.util.Vector;
import javax.swing.JList;
import net.minecraft.server.MinecraftServer;

public class aqa extends JList<String> {
   private final MinecraftServer a;
   private int b;

   public aqa(MinecraftServer $$0) {
      this.a = $$0;
      $$0.b(this::a);
   }

   public void a() {
      if (this.b++ % 20 == 0) {
         Vector<String> $$0 = new Vector<>();

         for (int $$1 = 0; $$1 < this.a.ag().t().size(); $$1++) {
            $$0.add(this.a.ag().t().get($$1).gk().getName());
         }

         this.setListData($$0);
      }
   }
}
