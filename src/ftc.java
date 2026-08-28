import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ftc implements fsy, fsz {
   private static final akk a = new akk("spectator/teleport_to_player");
   private static final Comparator<fyw> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wu c = wu.c("spectatorMenu.teleport");
   private static final wu d = wu.c("spectatorMenu.teleport.prompt");
   private final List<fsz> e;

   public ftc() {
      this(ffw.Q().L().l());
   }

   public ftc(Collection<fyw> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dcd.d).sorted(b).map($$0x -> new fsv($$0x.a())).toList();
   }

   @Override
   public List<fsz> a() {
      return this.e;
   }

   @Override
   public wu b() {
      return d;
   }

   @Override
   public void a(fsx $$0) {
      $$0.a(this);
   }

   @Override
   public wu aR_() {
      return c;
   }

   @Override
   public void a(fhh $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aS_() {
      return !this.e.isEmpty();
   }
}
