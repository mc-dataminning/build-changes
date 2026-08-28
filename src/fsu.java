import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fsu implements fsq, fsr {
   private static final akk a = new akk("spectator/teleport_to_player");
   private static final Comparator<fyo> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final wu c = wu.c("spectatorMenu.teleport");
   private static final wu d = wu.c("spectatorMenu.teleport.prompt");
   private final List<fsr> e;

   public fsu() {
      this(ffn.Q().L().l());
   }

   public fsu(Collection<fyo> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != dca.d).sorted(b).map($$0x -> new fsn($$0x.a())).toList();
   }

   @Override
   public List<fsr> a() {
      return this.e;
   }

   @Override
   public wu b() {
      return d;
   }

   @Override
   public void a(fsp $$0) {
      $$0.a(this);
   }

   @Override
   public wu aQ_() {
      return c;
   }

   @Override
   public void a(fgz $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aR_() {
      return !this.e.isEmpty();
   }
}
