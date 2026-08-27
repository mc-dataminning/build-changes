import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fla extends fgh {
   private static final int a = 310;
   private final fdw b = new fdw(this);
   private final fgh c;
   private final arq k;
   private final Consumer<arq> l;
   private final Object2BooleanMap<arn> m = new Object2BooleanLinkedOpenHashMap();

   public fla(fgh $$0, arq $$1, Consumer<arq> $$2) {
      super(vs.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (arn $$3 : $$1.c()) {
         if ($$3.j() == arr.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aP_() {
      this.b.a(new fbr(vs.c("selectWorld.experiments"), this.i));
      fea $$0 = this.b.c(fea.d());
      $$0.a(new fbe(vs.c("selectWorld.experiments.info").a(n.m), this.i).c(310), $$0x -> $$0x.e(15));
      fle.a $$1 = fle.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      fdv.b $$2 = this.b.b(new fdv().a(10)).d(2);
      $$2.a(fak.a(vr.d, $$0x -> this.o()).a());
      $$2.a(fak.a(vr.e, $$0x -> this.d()).a());
      this.b.a($$1x -> {
         fai var10000 = this.c($$1x);
      });
      this.c();
   }

   private static vs a(arn $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (vs)(gje.a($$1) ? vs.c($$1) : $$0.a());
   }

   @Override
   public void d() {
      this.f.a(this.c);
   }

   private void o() {
      List<arn> $$0 = new ArrayList<>(this.k.f());
      List<arn> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(arn::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void c() {
      this.b.a();
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
