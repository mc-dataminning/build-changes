import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ftk extends fon {
   private static final xe a = xe.c("selectWorld.experiments");
   private static final xe b = xe.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final fma d = new fma(this);
   private final fon r;
   private final ato s;
   private final Consumer<ato> u;
   private final Object2BooleanMap<atl> v = new Object2BooleanLinkedOpenHashMap();

   public ftk(fon $$0, ato $$1, Consumer<ato> $$2) {
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
   protected void aN_() {
      this.d.a(a, this.p);
      fme $$0 = this.d.c(fme.d());
      $$0.a(new fjh(b, this.p).d(310), $$0x -> $$0x.e(15));
      fto.a $$1 = fto.a(310).a(2, true).b(4);
      this.v.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.v.getBoolean($$1x), $$1xx -> this.v.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fme $$2 = this.d.b(fme.e().a(8));
      $$2.a(fin.a(xd.d, $$0x -> this.B()).a());
      $$2.a(fin.a(xd.e, $$0x -> this.d()).a());
      this.d.a($$1x -> {
         fil var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xe a(atl $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xe)(gse.a($$1) ? xe.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public xe i() {
      return xd.a(super.i(), b);
   }

   @Override
   public void d() {
      this.m.a(this.r);
   }

   private void B() {
      List<atl> $$0 = new ArrayList<>(this.s.f());
      List<atl> $$1 = new ArrayList<>();
      this.v.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.s.a($$0.stream().map(atl::g).toList());
      this.u.accept(this.s);
   }
}
