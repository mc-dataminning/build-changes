import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ffr implements ffn, ffo {
   private static final agg a = new agg("spectator/teleport_to_player");
   private static final Comparator<flf> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final ur c = ur.c("spectatorMenu.teleport");
   private static final ur d = ur.c("spectatorMenu.teleport.prompt");
   private final List<ffo> e;

   public ffr() {
      this(esr.N().I().n());
   }

   public ffr(Collection<flf> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != crp.d).sorted(b).map($$0x -> new ffk($$0x.a())).toList();
   }

   @Override
   public List<ffo> a() {
      return this.e;
   }

   @Override
   public ur b() {
      return d;
   }

   @Override
   public void a(ffm $$0) {
      $$0.a(this);
   }

   @Override
   public ur aP_() {
      return c;
   }

   @Override
   public void a(eub $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aQ_() {
      return !this.e.isEmpty();
   }
}
