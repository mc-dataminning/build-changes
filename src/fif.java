import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fif extends fdm {
   private static final int a = 310;
   private final fbb b = new fbb(this);
   private final fdm c;
   private final apu k;
   private final Consumer<apu> l;
   private final Object2BooleanMap<apr> m = new Object2BooleanLinkedOpenHashMap();

   public fif(fdm $$0, apu $$1, Consumer<apu> $$2) {
      super(vg.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (apr $$3 : $$1.c()) {
         if ($$3.j() == apv.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aP_() {
      this.b.a(new eyy(vg.c("selectWorld.experiments"), this.i));
      fbf $$0 = this.b.c(fbf.d());
      $$0.a(new eyl(vg.c("selectWorld.experiments.info").a(n.m), this.i).c(310), $$0x -> $$0x.e(15));
      fij.a $$1 = fij.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      fba.b $$2 = this.b.b(new fba().a(10)).d(2);
      $$2.a(exr.a(vf.d, $$0x -> this.o()).a());
      $$2.a(exr.a(vf.e, $$0x -> this.d()).a());
      this.b.a($$1x -> {
         exp var10000 = this.d($$1x);
      });
      this.c();
   }

   private static vg a(apr $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (vg)(ggg.a($$1) ? vg.c($$1) : $$0.a());
   }

   @Override
   public void d() {
      this.f.a(this.c);
   }

   private void o() {
      List<apr> $$0 = new ArrayList<>(this.k.f());
      List<apr> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(apr::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void c() {
      this.b.a();
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
