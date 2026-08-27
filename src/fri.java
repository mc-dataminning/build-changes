import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fri implements fre, frf {
   private static final akn a = new akn("spectator/teleport_to_player");
   private static final Comparator<fxc> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wx c = wx.c("spectatorMenu.teleport");
   private static final wx d = wx.c("spectatorMenu.teleport.prompt");
   private final List<frf> e;

   public fri() {
      this(feb.Q().L().m());
   }

   public fri(Collection<fxc> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != daw.d).sorted(b).map($$0x -> new frb($$0x.a())).toList();
   }

   @Override
   public List<frf> a() {
      return this.e;
   }

   @Override
   public wx b() {
      return d;
   }

   @Override
   public void a(frd $$0) {
      $$0.a(this);
   }

   @Override
   public wx aO_() {
      return c;
   }

   @Override
   public void a(ffn $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.e.isEmpty();
   }
}
