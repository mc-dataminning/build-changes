import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fsj extends fnj {
   private static final wu a = wu.c("selectWorld.experiments");
   private static final wu b = wu.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final flf q = new flf(this);
   private final fnj r;
   private final ath s;
   private final Consumer<ath> u;
   private final Object2BooleanMap<ate> v = new Object2BooleanLinkedOpenHashMap();

   public fsj(fnj $$0, ath $$1, Consumer<ath> $$2) {
      super(a);
      this.r = $$0;
      this.s = $$1;
      this.u = $$2;

      for (ate $$3 : $$1.c()) {
         if ($$3.l() == ati.d) {
            this.v.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aP_() {
      this.q.a(a, this.o);
      flj $$0 = this.q.c(flj.d());
      $$0.a(new fim(b, this.o).d(310), $$0x -> $$0x.e(15));
      fsn.a $$1 = fsn.a(310).a(2, true).b(4);
      this.v.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.v.getBoolean($$1x), $$1xx -> this.v.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      flj $$2 = this.q.b(flj.e().a(8));
      $$2.a(fhs.a(wt.d, $$0x -> this.m()).a());
      $$2.a(fhs.a(wt.e, $$0x -> this.d()).a());
      this.q.a($$1x -> {
         fhq var10000 = this.c($$1x);
      });
      this.c();
   }

   private static wu a(ate $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (wu)(gqu.a($$1) ? wu.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.q.a();
   }

   @Override
   public wu i() {
      return wt.a(super.i(), b);
   }

   @Override
   public void d() {
      this.l.a(this.r);
   }

   private void m() {
      List<ate> $$0 = new ArrayList<>(this.s.f());
      List<ate> $$1 = new ArrayList<>();
      this.v.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.s.b($$0.stream().map(ate::g).toList());
      this.u.accept(this.s);
   }
}
