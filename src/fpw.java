import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fpw extends fld {
   private static final wu a = wu.c("selectWorld.experiments");
   private static final wu b = wu.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final fir d = new fir(this);
   private final fld r;
   private final atc s;
   private final Consumer<atc> u;
   private final Object2BooleanMap<asz> v = new Object2BooleanLinkedOpenHashMap();

   public fpw(fld $$0, atc $$1, Consumer<atc> $$2) {
      super(a);
      this.r = $$0;
      this.s = $$1;
      this.u = $$2;

      for (asz $$3 : $$1.c()) {
         if ($$3.l() == atd.d) {
            this.v.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aM_() {
      this.d.a(a, this.p);
      fiv $$0 = this.d.c(fiv.d());
      $$0.a(new ffy(b, this.p).d(310), $$0x -> $$0x.e(15));
      fqa.a $$1 = fqa.a(310).a(2, true).b(4);
      this.v.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.v.getBoolean($$1x), $$1xx -> this.v.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fiv $$2 = this.d.b(fiv.e().a(8));
      $$2.a(ffe.a(wt.d, $$0x -> this.m()).a());
      $$2.a(ffe.a(wt.e, $$0x -> this.d()).a());
      this.d.a($$1x -> {
         ffc var10000 = this.c($$1x);
      });
      this.c();
   }

   private static wu a(asz $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (wu)(goe.a($$1) ? wu.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public wu i() {
      return wt.a(super.i(), b);
   }

   @Override
   public void d() {
      this.m.a(this.r);
   }

   private void m() {
      List<asz> $$0 = new ArrayList<>(this.s.f());
      List<asz> $$1 = new ArrayList<>();
      this.v.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.s.a($$0.stream().map(asz::g).toList());
      this.u.accept(this.s);
   }
}
