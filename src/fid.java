import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fid implements fhz, fia {
   private static final ahd a = new ahd("spectator/teleport_to_player");
   private static final Comparator<fnt> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final vd c = vd.c("spectatorMenu.teleport");
   private static final vd d = vd.c("spectatorMenu.teleport.prompt");
   private final List<fia> e;

   public fid() {
      this(eva.N().I().n());
   }

   public fid(Collection<fnt> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != ctf.d).sorted(b).map($$0x -> new fhw($$0x.a())).toList();
   }

   @Override
   public List<fia> a() {
      return this.e;
   }

   @Override
   public vd b() {
      return d;
   }

   @Override
   public void a(fhy $$0) {
      $$0.a(this);
   }

   @Override
   public vd aO_() {
      return c;
   }

   @Override
   public void a(ewm $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aP_() {
      return !this.e.isEmpty();
   }
}
