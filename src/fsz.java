import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fsz extends fnx {
   private static final wy a = wy.c("selectWorld.experiments");
   private static final wy b = wy.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final flt q = new flt(this);
   private final fnx r;
   private final ato s;
   private final Consumer<ato> u;
   private final Object2BooleanMap<atl> v = new Object2BooleanLinkedOpenHashMap();

   public fsz(fnx $$0, ato $$1, Consumer<ato> $$2) {
      super(a);
      this.r = $$0;
      this.s = $$1;
      this.u = $$2;

      for (atl $$3 : $$1.c()) {
         if ($$3.l() == atp.d) {
            this.v.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aP_() {
      this.q.a(a, this.o);
      flx $$0 = this.q.c(flx.d());
      $$0.a(new fja(b, this.o).d(310), $$0x -> $$0x.e(15));
      ftd.a $$1 = ftd.a(310).a(2, true).b(4);
      this.v.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.v.getBoolean($$1x), $$1xx -> this.v.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      flx $$2 = this.q.b(flx.e().a(8));
      $$2.a(fig.a(wx.d, $$0x -> this.m()).a());
      $$2.a(fig.a(wx.e, $$0x -> this.d()).a());
      this.q.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
   }

   private static wy a(atl $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (wy)(grl.a($$1) ? wy.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.q.a();
   }

   @Override
   public wy i() {
      return wx.a(super.i(), b);
   }

   @Override
   public void d() {
      this.l.a(this.r);
   }

   private void m() {
      List<atl> $$0 = new ArrayList<>(this.s.f());
      List<atl> $$1 = new ArrayList<>();
      this.v.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.s.b($$0.stream().map(atl::g).toList());
      this.u.accept(this.s);
   }
}
