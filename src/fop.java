import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fop extends fjx {
   private static final wi a = wi.c("selectWorld.experiments");
   private static final int b = 310;
   private final fhl c = new fhl(this);
   private final fjx d;
   private final asp o;
   private final Consumer<asp> p;
   private final Object2BooleanMap<asm> q = new Object2BooleanLinkedOpenHashMap();

   public fop(fjx $$0, asp $$1, Consumer<asp> $$2) {
      super(a);
      this.d = $$0;
      this.o = $$1;
      this.p = $$2;

      for (asm $$3 : $$1.c()) {
         if ($$3.l() == asq.d) {
            this.q.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aM_() {
      this.c.a(a, this.m);
      fhp $$0 = this.c.c(fhp.d());
      $$0.a(new fes(wi.c("selectWorld.experiments.info").a(n.m), this.m).d(310), $$0x -> $$0x.e(15));
      fou.a $$1 = fou.a(310).a(2, true).b(4);
      this.q.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.q.getBoolean($$1x), $$1xx -> this.q.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fhp $$2 = this.c.b(fhp.e().a(8));
      $$2.a(fdy.a(wh.d, $$0x -> this.m()).a());
      $$2.a(fdy.a(wh.e, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fdw var10000 = this.c($$1x);
      });
      this.c();
   }

   private static wi a(asm $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (wi)(gmx.a($$1) ? wi.c($$1) : $$0.b());
   }

   @Override
   public void d() {
      this.j.a(this.d);
   }

   private void m() {
      List<asm> $$0 = new ArrayList<>(this.o.f());
      List<asm> $$1 = new ArrayList<>();
      this.q.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.o.a($$0.stream().map(asm::g).toList());
      this.p.accept(this.o);
   }

   @Override
   protected void c() {
      this.c.a();
   }
}
