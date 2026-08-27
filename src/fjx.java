import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fjx extends ffe {
   private static final int a = 310;
   private final fct b = new fct(this);
   private final ffe c;
   private final arl k;
   private final Consumer<arl> l;
   private final Object2BooleanMap<ari> m = new Object2BooleanLinkedOpenHashMap();

   public fjx(ffe $$0, arl $$1, Consumer<arl> $$2) {
      super(vq.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (ari $$3 : $$1.c()) {
         if ($$3.j() == arm.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aQ_() {
      this.b.a(new fao(vq.c("selectWorld.experiments"), this.i));
      fcx $$0 = this.b.c(fcx.d());
      $$0.a(new fab(vq.c("selectWorld.experiments.info").a(n.m), this.i).c(310), $$0x -> $$0x.e(15));
      fkb.a $$1 = fkb.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      fcs.b $$2 = this.b.b(new fcs().a(10)).d(2);
      $$2.a(ezh.a(vp.d, $$0x -> this.o()).a());
      $$2.a(ezh.a(vp.e, $$0x -> this.d()).a());
      this.b.a($$1x -> {
         ezf var10000 = this.d($$1x);
      });
      this.c();
   }

   private static vq a(ari $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (vq)(ghz.a($$1) ? vq.c($$1) : $$0.a());
   }

   @Override
   public void d() {
      this.f.a(this.c);
   }

   private void o() {
      List<ari> $$0 = new ArrayList<>(this.k.f());
      List<ari> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(ari::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void c() {
      this.b.a();
   }

   @Override
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
