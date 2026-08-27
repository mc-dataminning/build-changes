import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ezd extends euq {
   private static final int a = 310;
   private final esg b = new esg(this);
   private final euq c;
   private final aki k;
   private final Consumer<aki> l;
   private final Object2BooleanMap<akg> m = new Object2BooleanLinkedOpenHashMap();

   protected ezd(euq $$0, aki $$1, Consumer<aki> $$2) {
      super(sw.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (akg $$3 : $$1.c()) {
         if ($$3.j() == akj.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void b() {
      this.b.a(new eqk(sw.c("selectWorld.experiments"), this.i));
      esf.b $$0 = this.b.c(new esf()).d(1);
      $$0.a(new eqa(sw.c("selectWorld.experiments.info").a(n.m), this.i).i(310), $$0.b().e(15));
      ezh.a $$1 = ezh.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      esf.b $$2 = this.b.b(new esf().a(10)).d(2);
      $$2.a(epi.a(sv.d, $$0x -> this.l()).a());
      $$2.a(epi.a(sv.e, $$0x -> this.aw_()).a());
      this.b.a($$1x -> {
         epf var10000 = this.d($$1x);
      });
      this.aG_();
   }

   private static sw a(akg $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (sw)(fvz.a($$1) ? sw.c($$1) : $$0.a());
   }

   @Override
   public void aw_() {
      this.f.a(this.c);
   }

   private void l() {
      List<akg> $$0 = new ArrayList<>(this.k.f());
      List<akg> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(akg::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void aG_() {
      this.b.c();
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.b(), 0.0F, 0.0F, this.g, this.h - this.b.b() - this.b.a(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
