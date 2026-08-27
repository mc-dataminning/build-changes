import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cor extends cnb {
   public static final String a = "effects";
   public static final int b = 160;

   public cor(cnb.a $$0) {
      super($$0);
   }

   public static void a(cng $$0, List<dez.a> $$1) {
      so $$2 = $$0.w();
      dez.a.b.encodeStart(tc.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cng $$0, List<dez.a> $$1) {
      so $$2 = $$0.w();
      List<dez.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dez.a.b.encodeStart(tc.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cng $$0, Consumer<dez.a> $$1) {
      so $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         dez.a.b.parse(tc.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<blj> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         cpg.a($$4, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public cng a(cng $$0, ctx $$1, bmo $$2) {
      cng $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cfq && ((cfq)$$2).fT().d ? $$3 : new cng(cnj.pp);
   }
}
