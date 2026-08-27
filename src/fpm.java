import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fpm extends fkt {
   private static final ws a = ws.c("selectWorld.experiments");
   private static final int b = 310;
   private final fih c = new fih(this);
   private final fkt d;
   private final asz r;
   private final Consumer<asz> s;
   private final Object2BooleanMap<asw> u = new Object2BooleanLinkedOpenHashMap();

   public fpm(fkt $$0, asz $$1, Consumer<asz> $$2) {
      super(a);
      this.d = $$0;
      this.r = $$1;
      this.s = $$2;

      for (asw $$3 : $$1.c()) {
         if ($$3.l() == ata.d) {
            this.u.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aM_() {
      this.c.a(a, this.p);
      fil $$0 = this.c.c(fil.d());
      $$0.a(new ffo(ws.c("selectWorld.experiments.info").a(n.m), this.p).d(310), $$0x -> $$0x.e(15));
      fpq.a $$1 = fpq.a(310).a(2, true).b(4);
      this.u.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.u.getBoolean($$1x), $$1xx -> this.u.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fil $$2 = this.c.b(fil.e().a(8));
      $$2.a(feu.a(wr.d, $$0x -> this.m()).a());
      $$2.a(feu.a(wr.e, $$0x -> this.d()).a());
      this.c.a($$1x -> {
         fes var10000 = this.c($$1x);
      });
      this.c();
   }

   private static ws a(asw $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (ws)(gnt.a($$1) ? ws.c($$1) : $$0.b());
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   private void m() {
      List<asw> $$0 = new ArrayList<>(this.r.f());
      List<asw> $$1 = new ArrayList<>();
      this.u.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.r.a($$0.stream().map(asw::g).toList());
      this.s.accept(this.r);
   }

   @Override
   protected void c() {
      this.c.a();
   }
}
