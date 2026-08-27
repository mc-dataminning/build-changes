import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fqr extends flz {
   private static final wx a = wx.c("selectWorld.experiments");
   private static final wx b = wx.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final fjn d = new fjn(this);
   private final flz r;
   private final ati s;
   private final Consumer<ati> u;
   private final Object2BooleanMap<atf> v = new Object2BooleanLinkedOpenHashMap();

   public fqr(flz $$0, ati $$1, Consumer<ati> $$2) {
      super(a);
      this.r = $$0;
      this.s = $$1;
      this.u = $$2;

      for (atf $$3 : $$1.c()) {
         if ($$3.l() == atj.d) {
            this.v.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aN_() {
      this.d.a(a, this.p);
      fjr $$0 = this.d.c(fjr.d());
      $$0.a(new fgu(b, this.p).d(310), $$0x -> $$0x.e(15));
      fqv.a $$1 = fqv.a(310).a(2, true).b(4);
      this.v.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.v.getBoolean($$1x), $$1xx -> this.v.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fjr $$2 = this.d.b(fjr.e().a(8));
      $$2.a(fga.a(ww.d, $$0x -> this.m()).a());
      $$2.a(fga.a(ww.e, $$0x -> this.d()).a());
      this.d.a($$1x -> {
         ffy var10000 = this.c($$1x);
      });
      this.c();
   }

   private static wx a(atf $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (wx)(gpb.a($$1) ? wx.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public wx i() {
      return ww.a(super.i(), b);
   }

   @Override
   public void d() {
      this.m.a(this.r);
   }

   private void m() {
      List<atf> $$0 = new ArrayList<>(this.s.f());
      List<atf> $$1 = new ArrayList<>();
      this.v.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.s.a($$0.stream().map(atf::g).toList());
      this.u.accept(this.s);
   }
}
