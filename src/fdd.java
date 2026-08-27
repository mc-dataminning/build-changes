import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fdd extends eym {
   private static final int a = 310;
   private final ewb b = new ewb(this);
   private final eym c;
   private final ang k;
   private final Consumer<ang> l;
   private final Object2BooleanMap<and> m = new Object2BooleanLinkedOpenHashMap();

   protected fdd(eym $$0, ang $$1, Consumer<ang> $$2) {
      super(tn.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (and $$3 : $$1.c()) {
         if ($$3.j() == anh.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aH_() {
      this.b.a(new ety(tn.c("selectWorld.experiments"), this.i));
      ewf $$0 = this.b.c(ewf.d());
      $$0.a(new etm(tn.c("selectWorld.experiments.info").a(n.m), this.i).j(310), $$0x -> $$0x.e(15));
      fdh.a $$1 = fdh.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      ewa.b $$2 = this.b.b(new ewa().a(10)).d(2);
      $$2.a(ess.a(tm.d, $$0x -> this.l()).a());
      $$2.a(ess.a(tm.e, $$0x -> this.az_()).a());
      this.b.a($$1x -> {
         esq var10000 = this.d($$1x);
      });
      this.b();
   }

   private static tn a(and $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (tn)(gam.a($$1) ? tn.c($$1) : $$0.a());
   }

   @Override
   public void az_() {
      this.f.a(this.c);
   }

   private void l() {
      List<and> $$0 = new ArrayList<>(this.k.f());
      List<and> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(and::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void b() {
      this.b.a();
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
