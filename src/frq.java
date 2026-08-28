import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class frq extends fmy {
   private static final xl a = xl.c("selectWorld.experiments");
   private static final xl b = xl.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final fkm d = new fkm(this);
   private final fmy r;
   private final atw s;
   private final Consumer<atw> u;
   private final Object2BooleanMap<att> v = new Object2BooleanLinkedOpenHashMap();

   public frq(fmy $$0, atw $$1, Consumer<atw> $$2) {
      super(a);
      this.r = $$0;
      this.s = $$1;
      this.u = $$2;

      for (att $$3 : $$1.c()) {
         if ($$3.l() == atx.d) {
            this.v.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aN_() {
      this.d.a(a, this.p);
      fkq $$0 = this.d.c(fkq.d());
      $$0.a(new fht(b, this.p).d(310), $$0x -> $$0x.e(15));
      fru.a $$1 = fru.a(310).a(2, true).b(4);
      this.v.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.v.getBoolean($$1x), $$1xx -> this.v.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fkq $$2 = this.d.b(fkq.e().a(8));
      $$2.a(fgz.a(xk.d, $$0x -> this.m()).a());
      $$2.a(fgz.a(xk.e, $$0x -> this.d()).a());
      this.d.a($$1x -> {
         fgx var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xl a(att $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xl)(gqa.a($$1) ? xl.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public xl i() {
      return xk.a(super.i(), b);
   }

   @Override
   public void d() {
      this.m.a(this.r);
   }

   private void m() {
      List<att> $$0 = new ArrayList<>(this.s.f());
      List<att> $$1 = new ArrayList<>();
      this.v.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.s.a($$0.stream().map(att::g).toList());
      this.u.accept(this.s);
   }
}
