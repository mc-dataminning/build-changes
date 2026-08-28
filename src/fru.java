import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fru extends fnc {
   private static final xo a = xo.c("selectWorld.experiments");
   private static final xo b = xo.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final fkq d = new fkq(this);
   private final fnc r;
   private final atz s;
   private final Consumer<atz> u;
   private final Object2BooleanMap<atw> v = new Object2BooleanLinkedOpenHashMap();

   public fru(fnc $$0, atz $$1, Consumer<atz> $$2) {
      super(a);
      this.r = $$0;
      this.s = $$1;
      this.u = $$2;

      for (atw $$3 : $$1.c()) {
         if ($$3.l() == aua.d) {
            this.v.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aM_() {
      this.d.a(a, this.p);
      fku $$0 = this.d.c(fku.d());
      $$0.a(new fhx(b, this.p).d(310), $$0x -> $$0x.e(15));
      fry.a $$1 = fry.a(310).a(2, true).b(4);
      this.v.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.v.getBoolean($$1x), $$1xx -> this.v.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fku $$2 = this.d.b(fku.e().a(8));
      $$2.a(fhd.a(xn.d, $$0x -> this.m()).a());
      $$2.a(fhd.a(xn.e, $$0x -> this.d()).a());
      this.d.a($$1x -> {
         fhb var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xo a(atw $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xo)(gqe.a($$1) ? xo.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public xo i() {
      return xn.a(super.i(), b);
   }

   @Override
   public void d() {
      this.m.a(this.r);
   }

   private void m() {
      List<atw> $$0 = new ArrayList<>(this.s.f());
      List<atw> $$1 = new ArrayList<>();
      this.v.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.s.b($$0.stream().map(atw::g).toList());
      this.u.accept(this.s);
   }
}
