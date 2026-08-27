import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fly extends fhf {
   private static final int a = 310;
   private final fet b = new fet(this);
   private final fhf c;
   private final arz k;
   private final Consumer<arz> l;
   private final Object2BooleanMap<arw> m = new Object2BooleanLinkedOpenHashMap();

   public fly(fhf $$0, arz $$1, Consumer<arz> $$2) {
      super(vu.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (arw $$3 : $$1.c()) {
         if ($$3.l() == asa.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aO_() {
      this.b.a(new fcn(vu.c("selectWorld.experiments"), this.i));
      fex $$0 = this.b.c(fex.d());
      $$0.a(new fca(vu.c("selectWorld.experiments.info").a(n.m), this.i).c(310), $$0x -> $$0x.e(15));
      fmc.a $$1 = fmc.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fes.b $$2 = this.b.b(new fes().a(10)).d(2);
      $$2.a(fbg.a(vt.d, $$0x -> this.o()).a());
      $$2.a(fbg.a(vt.e, $$0x -> this.d()).a());
      this.b.a($$1x -> {
         fbe var10000 = this.c($$1x);
      });
      this.c();
   }

   private static vu a(arw $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (vu)(gke.a($$1) ? vu.c($$1) : $$0.b());
   }

   @Override
   public void d() {
      this.f.a(this.c);
   }

   private void o() {
      List<arw> $$0 = new ArrayList<>(this.k.f());
      List<arw> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(arw::g).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void c() {
      this.b.a();
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
