import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ffa extends fah {
   private static final int a = 310;
   private final exw b = new exw(this);
   private final fah c;
   private final aoo k;
   private final Consumer<aoo> l;
   private final Object2BooleanMap<aol> m = new Object2BooleanLinkedOpenHashMap();

   public ffa(fah $$0, aoo $$1, Consumer<aoo> $$2) {
      super(ur.c("experiments_screen.title"));
      this.c = $$0;
      this.k = $$1;
      this.l = $$2;

      for (aol $$3 : $$1.c()) {
         if ($$3.j() == aop.d) {
            this.m.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aO_() {
      this.b.a(new evt(ur.c("selectWorld.experiments"), this.i));
      eya $$0 = this.b.c(eya.d());
      $$0.a(new evg(ur.c("selectWorld.experiments.info").a(n.m), this.i).j(310), $$0x -> $$0x.e(15));
      ffe.a $$1 = ffe.a(310).a(2, true).b(4);
      this.m.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.m.getBoolean($$1x), $$1xx -> this.m.put($$1x, $$1xx)).a($$1x.b()));
      $$1.a($$0::a);
      exv.b $$2 = this.b.b(new exv().a(10)).d(2);
      $$2.a(eum.a(uq.d, $$0x -> this.l()).a());
      $$2.a(eum.a(uq.e, $$0x -> this.aE_()).a());
      this.b.a($$1x -> {
         euk var10000 = this.d($$1x);
      });
      this.c();
   }

   private static ur a(aol $$0) {
      String $$1 = "dataPack." + $$0.f() + ".name";
      return (ur)(gcn.a($$1) ? ur.c($$1) : $$0.a());
   }

   @Override
   public void aE_() {
      this.f.a(this.c);
   }

   private void l() {
      List<aol> $$0 = new ArrayList<>(this.k.f());
      List<aol> $$1 = new ArrayList<>();
      this.m.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.k.a($$0.stream().map(aol::f).toList());
      this.l.accept(this.k);
   }

   @Override
   protected void c() {
      this.b.a();
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(0.125F, 0.125F, 0.125F, 1.0F);
      int $$4 = 32;
      $$0.a(d, 0, this.b.c(), 0.0F, 0.0F, this.g, this.h - this.b.c() - this.b.b(), 32, 32);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
