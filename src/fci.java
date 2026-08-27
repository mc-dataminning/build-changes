import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fci extends exv {
   private static final int a = 310;
   private final evk b = new evk(this);
   private final exv c;
   private final amv k;
   private final Consumer<amv> l;
   private final Object2BooleanMap<ams> m = new Object2BooleanLinkedOpenHashMap();

   protected fci(exv $$0, amv $$1, Consumer<amv> $$2) {
      super(te.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (ams $$3 : $$1.c()) {
         if ($$3.j() == amw.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aE_() {
      this.b.a(new etn(te.c("selectWorld.experiments"), this.i));
      evo $$0 = this.b.c(evo.d());
      $$0.a(new etc(te.c("selectWorld.experiments.info").a(n.m), this.i).i(310), $$0x -> $$0x.e(15));
      fcm.a $$1 = fcm.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      evj.b $$2 = this.b.b(new evj().a(10)).d(2);
      $$2.a(esi.a(td.d, $$0x -> this.l()).a());
      $$2.a(esi.a(td.e, $$0x -> this.au_()).a());
      this.b.a($$1x -> {
         esg var10000 = this.d($$1x);
      });
      this.b();
   }

   private static te a(ams $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (te)(fzm.a($$1) ? te.c($$1) : $$0.a());
   }

   @Override
   public void au_() {
      this.f.a(this.c);
   }

   private void l() {
      List<ams> $$0 = new ArrayList<>(this.k.f());
      List<ams> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(ams::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void b() {
      this.b.a();
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
