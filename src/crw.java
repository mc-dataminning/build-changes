import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class crw extends cqh {
   public static final String a = "effects";
   public static final int b = 160;

   public crw(cqh.a $$0) {
      super($$0);
   }

   public static void a(cqm $$0, List<did.a> $$1) {
      ta $$2 = $$0.x();
      did.a.b.encodeStart(to.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cqm $$0, List<did.a> $$1) {
      ta $$2 = $$0.x();
      List<did.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      did.a.b.encodeStart(to.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cqm $$0, Consumer<did.a> $$1) {
      ta $$2 = $$0.w();
      if ($$2 != null && $$2.b("effects", 9)) {
         did.a.b.parse(to.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bok> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         csl.a($$4, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public cqm a(cqm $$0, cxb $$1, bpp $$2) {
      cqm $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2.fM() ? $$3 : new cqm(cqp.pp);
   }
}
