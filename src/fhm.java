import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fhm extends fct {
   private static final int a = 310;
   private final fai b = new fai(this);
   private final fct c;
   private final apn k;
   private final Consumer<apn> l;
   private final Object2BooleanMap<apk> m = new Object2BooleanLinkedOpenHashMap();

   public fhm(fct $$0, apn $$1, Consumer<apn> $$2) {
      super(vd.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (apk $$3 : $$1.c()) {
         if ($$3.j() == apo.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aN_() {
      this.b.a(new eyf(vd.c("selectWorld.experiments"), this.i));
      fam $$0 = this.b.c(fam.d());
      $$0.a(new exs(vd.c("selectWorld.experiments.info").a(n.m), this.i).c(310), $$0x -> $$0x.e(15));
      fhq.a $$1 = fhq.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      fah.b $$2 = this.b.b(new fah().a(10)).d(2);
      $$2.a(ewy.a(vc.d, $$0x -> this.n()).a());
      $$2.a(ewy.a(vc.e, $$0x -> this.aE_()).a());
      this.b.a($$1x -> {
         eww var10000 = this.d($$1x);
      });
      this.c();
   }

   private static vd a(apk $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (vd)(gfl.a($$1) ? vd.c($$1) : $$0.a());
   }

   @Override
   public void aE_() {
      this.f.a(this.c);
   }

   private void n() {
      List<apk> $$0 = new ArrayList<>(this.k.f());
      List<apk> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(apk::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void c() {
      this.b.a();
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
