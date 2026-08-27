import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ezu implements ezq, ezr {
   private static final Comparator<ffb> a = Comparator.comparing($$0 -> $$0.a().getId());
   private static final sw b = sw.c("spectatorMenu.teleport");
   private static final sw c = sw.c("spectatorMenu.teleport.prompt");
   private final List<ezr> d;

   public ezu() {
      this(enn.N().I().h());
   }

   public ezu(Collection<ffb> $$0) {
      this.d = $$0.stream().filter($$0x -> $$0x.e() != cmj.d).sorted(a).map($$0x -> new ezn($$0x.a())).toList();
   }

   @Override
   public List<ezr> a() {
      return this.d;
   }

   @Override
   public sw b() {
      return c;
   }

   @Override
   public void a(ezp $$0) {
      $$0.a(this);
   }

   @Override
   public sw aI_() {
      return b;
   }

   @Override
   public void a(eox $$0, float $$1, int $$2) {
      $$0.a(eqw.a, 0, 0, 0.0F, 0.0F, 16, 16, 256, 256);
   }

   @Override
   public boolean aJ_() {
      return !this.d.isEmpty();
   }
}
