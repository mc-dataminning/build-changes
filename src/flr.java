import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class flr implements fln, flo {
   private static final ajc a = new ajc("spectator/teleport_to_player");
   private static final Comparator<frk> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final vs c = vs.c("spectatorMenu.teleport");
   private static final vs d = vs.c("spectatorMenu.teleport.prompt");
   private final List<flo> e;

   public flr() {
      this(eyk.P().K().m());
   }

   public flr(Collection<frk> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cwb.d).sorted(b).map($$0x -> new flk($$0x.a())).toList();
   }

   @Override
   public List<flo> a() {
      return this.e;
   }

   @Override
   public vs b() {
      return d;
   }

   @Override
   public void a(flm $$0) {
      $$0.a(this);
   }

   @Override
   public vs aQ_() {
      return c;
   }

   @Override
   public void a(ezx $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aR_() {
      return !this.e.isEmpty();
   }
}
