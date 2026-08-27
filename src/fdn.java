import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class fdn implements fdj, fdk {
   private static final aez a = new aez("spectator/teleport_to_player");
   private static final Comparator<fjb> b = Comparator.comparing($$0 -> $$0.a().getId());
   private static final tl c = tl.c("spectatorMenu.teleport");
   private static final tl d = tl.c("spectatorMenu.teleport.prompt");
   private final List<fdk> e;

   public fdn() {
      this(eqp.O().J().n());
   }

   public fdn(Collection<fjb> $$0) {
      this.e = $$0.stream().filter($$0x -> $$0x.e() != cpy.d).sorted(b).map($$0x -> new fdg($$0x.a())).toList();
   }

   @Override
   public List<fdk> a() {
      return this.e;
   }

   @Override
   public tl b() {
      return d;
   }

   @Override
   public void a(fdi $$0) {
      $$0.a(this);
   }

   @Override
   public tl aI_() {
      return c;
   }

   @Override
   public void a(erz $$0, float $$1, int $$2) {
      $$0.a(a, 0, 0, 16, 16);
   }

   @Override
   public boolean aJ_() {
      return !this.e.isEmpty();
   }
}
