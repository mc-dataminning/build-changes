import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fhs extends fcz {
   private static final int a = 310;
   private final fao b = new fao(this);
   private final fcz c;
   private final aps k;
   private final Consumer<aps> l;
   private final Object2BooleanMap<app> m = new Object2BooleanLinkedOpenHashMap();

   public fhs(fcz $$0, aps $$1, Consumer<aps> $$2) {
      super(vf.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (app $$3 : $$1.c()) {
         if ($$3.j() == apt.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aN_() {
      this.b.a(new eyl(vf.c("selectWorld.experiments"), this.i));
      fas $$0 = this.b.c(fas.d());
      $$0.a(new exy(vf.c("selectWorld.experiments.info").a(n.m), this.i).c(310), $$0x -> $$0x.e(15));
      fhw.a $$1 = fhw.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      fan.b $$2 = this.b.b(new fan().a(10)).d(2);
      $$2.a(exe.a(ve.d, $$0x -> this.n()).a());
      $$2.a(exe.a(ve.e, $$0x -> this.aE_()).a());
      this.b.a($$1x -> {
         exc var10000 = this.d($$1x);
      });
      this.c();
   }

   private static vf a(app $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (vf)(gfq.a($$1) ? vf.c($$1) : $$0.a());
   }

   @Override
   public void aE_() {
      this.f.a(this.c);
   }

   private void n() {
      List<app> $$0 = new ArrayList<>(this.k.f());
      List<app> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(app::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void c() {
      this.b.a();
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
