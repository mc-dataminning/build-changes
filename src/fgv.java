import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fgv extends fcc {
   private static final int a = 310;
   private final ezr b = new ezr(this);
   private final fcc c;
   private final apd k;
   private final Consumer<apd> l;
   private final Object2BooleanMap<apa> m = new Object2BooleanLinkedOpenHashMap();

   public fgv(fcc $$0, apd $$1, Consumer<apd> $$2) {
      super(vb.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (apa $$3 : $$1.c()) {
         if ($$3.j() == ape.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aP_() {
      this.b.a(new exo(vb.c("selectWorld.experiments"), this.i));
      ezv $$0 = this.b.c(ezv.d());
      $$0.a(new exb(vb.c("selectWorld.experiments.info").a(n.m), this.i).j(310), $$0x -> $$0x.e(15));
      fgz.a $$1 = fgz.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      ezq.b $$2 = this.b.b(new ezq().a(10)).d(2);
      $$2.a(ewh.a(va.d, $$0x -> this.l()).a());
      $$2.a(ewh.a(va.e, $$0x -> this.aF_()).a());
      this.b.a($$1x -> {
         ewf var10000 = this.d($$1x);
      });
      this.c();
   }

   private static vb a(apa $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (vb)(geu.a($$1) ? vb.c($$1) : $$0.a());
   }

   @Override
   public void aF_() {
      this.f.a(this.c);
   }

   private void l() {
      List<apa> $$0 = new ArrayList<>(this.k.f());
      List<apa> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(apa::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void c() {
      this.b.a();
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
