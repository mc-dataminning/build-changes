import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fdb extends eyk {
   private static final int a = 310;
   private final evz b = new evz(this);
   private final eyk c;
   private final anf k;
   private final Consumer<anf> l;
   private final Object2BooleanMap<anc> m = new Object2BooleanLinkedOpenHashMap();

   protected fdb(eyk $$0, anf $$1, Consumer<anf> $$2) {
      super(tl.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (anc $$3 : $$1.c()) {
         if ($$3.j() == ang.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aI_() {
      this.b.a(new etw(tl.c("selectWorld.experiments"), this.i));
      ewd $$0 = this.b.c(ewd.d());
      $$0.a(new etk(tl.c("selectWorld.experiments.info").a(n.m), this.i).j(310), $$0x -> $$0x.e(15));
      fdf.a $$1 = fdf.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      evy.b $$2 = this.b.b(new evy().a(10)).d(2);
      $$2.a(esq.a(tk.d, $$0x -> this.l()).a());
      $$2.a(esq.a(tk.e, $$0x -> this.az_()).a());
      this.b.a($$1x -> {
         eso var10000 = this.d($$1x);
      });
      this.b();
   }

   private static tl a(anc $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (tl)(gak.a($$1) ? tl.c($$1) : $$0.a());
   }

   @Override
   public void az_() {
      this.f.a(this.c);
   }

   private void l() {
      List<anc> $$0 = new ArrayList<>(this.k.f());
      List<anc> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(anc::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void b() {
      this.b.a();
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
