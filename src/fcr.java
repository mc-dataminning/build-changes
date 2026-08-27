import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fcr extends eya {
   private static final int a = 310;
   private final evp b = new evp(this);
   private final eya c;
   private final amx k;
   private final Consumer<amx> l;
   private final Object2BooleanMap<amu> m = new Object2BooleanLinkedOpenHashMap();

   protected fcr(eya $$0, amx $$1, Consumer<amx> $$2) {
      super(tf.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (amu $$3 : $$1.c()) {
         if ($$3.j() == amy.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aC_() {
      this.b.a(new etm(tf.c("selectWorld.experiments"), this.i));
      evt $$0 = this.b.c(evt.d());
      $$0.a(new eta(tf.c("selectWorld.experiments.info").a(n.m), this.i).j(310), $$0x -> $$0x.e(15));
      fcv.a $$1 = fcv.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      evo.b $$2 = this.b.b(new evo().a(10)).d(2);
      $$2.a(esg.a(te.d, $$0x -> this.l()).a());
      $$2.a(esg.a(te.e, $$0x -> this.at_()).a());
      this.b.a($$1x -> {
         ese var10000 = this.d($$1x);
      });
      this.b();
   }

   private static tf a(amu $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (tf)(gaa.a($$1) ? tf.c($$1) : $$0.a());
   }

   @Override
   public void at_() {
      this.f.a(this.c);
   }

   private void l() {
      List<amu> $$0 = new ArrayList<>(this.k.f());
      List<amu> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(amu::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void b() {
      this.b.a();
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
