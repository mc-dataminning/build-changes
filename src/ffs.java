import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ffs extends faz {
   private static final int a = 310;
   private final eyo b = new eyo(this);
   private final faz c;
   private final aow k;
   private final Consumer<aow> l;
   private final Object2BooleanMap<aot> m = new Object2BooleanLinkedOpenHashMap();

   public ffs(faz $$0, aow $$1, Consumer<aow> $$2) {
      super(uv.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (aot $$3 : $$1.c()) {
         if ($$3.j() == aox.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aQ_() {
      this.b.a(new ewl(uv.c("selectWorld.experiments"), this.i));
      eys $$0 = this.b.c(eys.d());
      $$0.a(new evy(uv.c("selectWorld.experiments.info").a(n.m), this.i).j(310), $$0x -> $$0x.e(15));
      ffw.a $$1 = ffw.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      eyn.b $$2 = this.b.b(new eyn().a(10)).d(2);
      $$2.a(eve.a(uu.d, $$0x -> this.l()).a());
      $$2.a(eve.a(uu.e, $$0x -> this.aG_()).a());
      this.b.a($$1x -> {
         evc var10000 = this.d($$1x);
      });
      this.c();
   }

   private static uv a(aot $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (uv)(gdf.a($$1) ? uv.c($$1) : $$0.a());
   }

   @Override
   public void aG_() {
      this.f.a(this.c);
   }

   private void l() {
      List<aot> $$0 = new ArrayList<>(this.k.f());
      List<aot> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(aot::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void c() {
      this.b.a();
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
