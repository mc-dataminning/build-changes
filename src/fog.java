import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fog extends fjo {
   private static final wg a = wg.c("selectWorld.experiments");
   private static final int b = 310;
   private final fhc c = new fhc(this);
   private final fjo d;
   private final asn o;
   private final Consumer<asn> p;
   private final Object2BooleanMap<ask> q = new Object2BooleanLinkedOpenHashMap();

   public fog(fjo $$0, asn $$1, Consumer<asn> $$2) {
      super(a);
      this.d = $$0;
      this.o = $$1;
      this.p = $$2;

      for (ask $$3 : $$1.c()) {
         if ($$3.l() == aso.d) {
            this.q.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aN_() {
      this.c.a(a, this.m);
      fhg $$0 = this.c.c(fhg.d());
      $$0.a(new fej(wg.c("selectWorld.experiments.info").a(n.m), this.m).d(310), $$0x -> $$0x.e(15));
      fok.a $$1 = fok.a(310).a(2, true).b(4);
      this.q.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.q.getBoolean($$1x), $$1xx -> this.q.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fhg $$2 = this.c.b(fhg.e().a(8));
      $$2.a(fdp.a(wf.d, $$0x -> this.m()).a());
      $$2.a(fdp.a(wf.e, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   private static wg a(ask $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (wg)(gmo.a($$1) ? wg.c($$1) : $$0.b());
   }

   @Override
   public void d() {
      this.j.a(this.d);
   }

   private void m() {
      List<ask> $$0 = new ArrayList<>(this.o.f());
      List<ask> $$1 = new ArrayList<>();
      this.q.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.o.a($$0.stream().map(ask::g).toList());
      this.p.accept(this.o);
   }

   @Override
   protected void c() {
      this.c.a();
   }
}
