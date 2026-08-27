import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fcm extends exz {
   private static final int a = 310;
   private final evo b = new evo(this);
   private final exz c;
   private final amx k;
   private final Consumer<amx> l;
   private final Object2BooleanMap<amu> m = new Object2BooleanLinkedOpenHashMap();

   protected fcm(exz $$0, amx $$1, Consumer<amx> $$2) {
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
   protected void aE_() {
      this.b.a(new etm(tf.c("selectWorld.experiments"), this.i));
      evs $$0 = this.b.c(evs.d());
      $$0.a(new etb(tf.c("selectWorld.experiments.info").a(n.m), this.i).i(310), $$0x -> $$0x.e(15));
      fcq.a $$1 = fcq.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      evn.b $$2 = this.b.b(new evn().a(10)).d(2);
      $$2.a(esh.a(te.d, $$0x -> this.l()).a());
      $$2.a(esh.a(te.e, $$0x -> this.au_()).a());
      this.b.a($$1x -> {
         esf var10000 = this.d($$1x);
      });
      this.b();
   }

   private static tf a(amu $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (tf)(fzr.a($$1) ? tf.c($$1) : $$0.a());
   }

   @Override
   public void au_() {
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
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
