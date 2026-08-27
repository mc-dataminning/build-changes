import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fdv extends ezd {
   private static final int a = 310;
   private final ewt b = new ewt(this);
   private final ezd c;
   private final aoe k;
   private final Consumer<aoe> l;
   private final Object2BooleanMap<aob> m = new Object2BooleanLinkedOpenHashMap();

   public fdv(ezd $$0, aoe $$1, Consumer<aoe> $$2) {
      super(ui.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (aob $$3 : $$1.c()) {
         if ($$3.j() == aof.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aM_() {
      this.b.a(new euq(ui.c("selectWorld.experiments"), this.i));
      ewx $$0 = this.b.c(ewx.d());
      $$0.a(new eud(ui.c("selectWorld.experiments.info").a(n.m), this.i).j(310), $$0x -> $$0x.e(15));
      fdz.a $$1 = fdz.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      ews.b $$2 = this.b.b(new ews().a(10)).d(2);
      $$2.a(etj.a(uh.d, $$0x -> this.l()).a());
      $$2.a(etj.a(uh.e, $$0x -> this.aC_()).a());
      this.b.a($$1x -> {
         eth var10000 = this.d($$1x);
      });
      this.c();
   }

   private static ui a(aob $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (ui)(gbg.a($$1) ? ui.c($$1) : $$0.a());
   }

   @Override
   public void aC_() {
      this.f.a(this.c);
   }

   private void l() {
      List<aob> $$0 = new ArrayList<>(this.k.f());
      List<aob> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(aob::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void c() {
      this.b.a();
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
