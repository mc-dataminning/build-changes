import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class frx extends fnf {
   private static final xp a = xp.c("selectWorld.experiments");
   private static final xp b = xp.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final fkt d = new fkt(this);
   private final fnf r;
   private final aua s;
   private final Consumer<aua> u;
   private final Object2BooleanMap<atx> v = new Object2BooleanLinkedOpenHashMap();

   public frx(fnf $$0, aua $$1, Consumer<aua> $$2) {
      super(a);
      this.r = $$0;
      this.s = $$1;
      this.u = $$2;

      for (atx $$3 : $$1.c()) {
         if ($$3.l() == aub.d) {
            this.v.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aM_() {
      this.d.a(a, this.p);
      fkx $$0 = this.d.c(fkx.d());
      $$0.a(new fia(b, this.p).d(310), $$0x -> $$0x.e(15));
      fsb.a $$1 = fsb.a(310).a(2, true).b(4);
      this.v.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.v.getBoolean($$1x), $$1xx -> this.v.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fkx $$2 = this.d.b(fkx.e().a(8));
      $$2.a(fhg.a(xo.d, $$0x -> this.m()).a());
      $$2.a(fhg.a(xo.e, $$0x -> this.d()).a());
      this.d.a($$1x -> {
         fhe var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xp a(atx $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xp)(gqh.a($$1) ? xp.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public xp i() {
      return xo.a(super.i(), b);
   }

   @Override
   public void d() {
      this.m.a(this.r);
   }

   private void m() {
      List<atx> $$0 = new ArrayList<>(this.s.f());
      List<atx> $$1 = new ArrayList<>();
      this.v.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.s.b($$0.stream().map(atx::g).toList());
      this.u.accept(this.s);
   }
}
