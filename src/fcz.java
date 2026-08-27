import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fcz implements fcv, fcw {
   private static final aep a = new aep("spectator/teleport_to_player");
   private static final Comparator<fil> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final te c = te.c("spectatorMenu.teleport");
   private static final te d = te.c("spectatorMenu.teleport.prompt");
   private final List<fcw> e;

   public fcz() {
      this(eqn.N().I().m());
   }

   public fcz(Collection<fil> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cph.d).sorted(b).map($$0x -> new fcs($$0x.a())).toList();
   }

   @Override
   public List<fcw> a() {
      return this.e;
   }

   @Override
   public te b() {
      return d;
   }

   @Override
   public void a(fcu $$0) {
      $$0.a(this);
   }

   @Override
   public te aF_() {
      return c;
   }

   @Override
   public void a(erx $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aG_() {
      return !this.e.isEmpty();
   }
}
