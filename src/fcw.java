import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fcw extends eyf {
   private static final int a = 310;
   private final evu b = new evu(this);
   private final eyf c;
   private final ana k;
   private final Consumer<ana> l;
   private final Object2BooleanMap<amx> m = new Object2BooleanLinkedOpenHashMap();

   protected fcw(eyf $$0, ana $$1, Consumer<ana> $$2) {
      super(ti.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (amx $$3 : $$1.c()) {
         if ($$3.j() == anb.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aD_() {
      this.b.a(new etr(ti.c("selectWorld.experiments"), this.i));
      evy $$0 = this.b.c(evy.d());
      $$0.a(new etf(ti.c("selectWorld.experiments.info").a(n.m), this.i).j(310), $$0x -> $$0x.e(15));
      fda.a $$1 = fda.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      evt.b $$2 = this.b.b(new evt().a(10)).d(2);
      $$2.a(esl.a(th.d, $$0x -> this.l()).a());
      $$2.a(esl.a(th.e, $$0x -> this.au_()).a());
      this.b.a($$1x -> {
         esj var10000 = this.d($$1x);
      });
      this.b();
   }

   private static ti a(amx $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (ti)(gaf.a($$1) ? ti.c($$1) : $$0.a());
   }

   @Override
   public void au_() {
      this.f.a(this.c);
   }

   private void l() {
      List<amx> $$0 = new ArrayList<>(this.k.f());
      List<amx> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(amx::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void b() {
      this.b.a();
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
