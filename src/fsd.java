import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fsd extends fnd {
   private static final wu a = wu.c("selectWorld.experiments");
   private static final wu b = wu.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final fkz q = new fkz(this);
   private final fnd r;
   private final atf s;
   private final Consumer<atf> u;
   private final Object2BooleanMap<atc> v = new Object2BooleanLinkedOpenHashMap();

   public fsd(fnd $$0, atf $$1, Consumer<atf> $$2) {
      super(a);
      this.r = $$0;
      this.s = $$1;
      this.u = $$2;

      for (atc $$3 : $$1.c()) {
         if ($$3.l() == atg.d) {
            this.v.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aO_() {
      this.q.a(a, this.o);
      fld $$0 = this.q.c(fld.d());
      $$0.a(new fig(b, this.o).d(310), $$0x -> $$0x.e(15));
      fsh.a $$1 = fsh.a(310).a(2, true).b(4);
      this.v.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.v.getBoolean($$1x), $$1xx -> this.v.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fld $$2 = this.q.b(fld.e().a(8));
      $$2.a(fhm.a(wt.d, $$0x -> this.m()).a());
      $$2.a(fhm.a(wt.e, $$0x -> this.d()).a());
      this.q.a($$1x -> {
         fhk var10000 = this.c($$1x);
      });
      this.c();
   }

   private static wu a(atc $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (wu)(gqo.a($$1) ? wu.c($$1) : $$0.b());
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
      List<atc> $$0 = new ArrayList<>(this.s.f());
      List<atc> $$1 = new ArrayList<>();
      this.v.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.s.b($$0.stream().map(atc::g).toList());
      this.u.accept(this.s);
   }
}
