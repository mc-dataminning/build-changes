import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ftf extends fod {
   private static final wz a = wz.c("selectWorld.experiments");
   private static final wz b = wz.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final flz r = new flz(this);
   private final fod s;
   private final atp u;
   private final Consumer<atp> v;
   private final Object2BooleanMap<atm> w = new Object2BooleanLinkedOpenHashMap();

   public ftf(fod $$0, atp $$1, Consumer<atp> $$2) {
      super(a);
      this.s = $$0;
      this.u = $$1;
      this.v = $$2;

      for (atm $$3 : $$1.c()) {
         if ($$3.l() == atq.d) {
            this.w.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aT_() {
      this.r.a(a, this.o);
      fmd $$0 = this.r.c(fmd.d());
      $$0.a(new fjg(b, this.o).d(310), $$0x -> $$0x.e(15));
      ftj.a $$1 = ftj.a(310).a(2, true).b(4);
      this.w.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.w.getBoolean($$1x), $$1xx -> this.w.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fmd $$2 = this.r.b(fmd.e().a(8));
      $$2.a(fim.a(wy.d, $$0x -> this.m()).a());
      $$2.a(fim.a(wy.e, $$0x -> this.d()).a());
      this.r.a($$1x -> {
         fik var10000 = this.c($$1x);
      });
      this.c();
   }

   private static wz a(atm $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (wz)(grr.a($$1) ? wz.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.r.a();
   }

   @Override
   public wz i() {
      return wy.a(super.i(), b);
   }

   @Override
   public void d() {
      this.l.a(this.s);
   }

   private void m() {
      List<atm> $$0 = new ArrayList<>(this.u.f());
      List<atm> $$1 = new ArrayList<>();
      this.w.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.u.b($$0.stream().map(atm::g).toList());
      this.v.accept(this.u);
   }
}
