import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cra extends cpl {
   public static final String a = "effects";
   public static final int b = 160;

   public cra(cpl.a $$0) {
      super($$0);
   }

   public static void a(cpq $$0, List<dhg.a> $$1) {
      sy $$2 = $$0.x();
      dhg.a.b.encodeStart(tm.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cpq $$0, List<dhg.a> $$1) {
      sy $$2 = $$0.x();
      List<dhg.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dhg.a.b.encodeStart(tm.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cpq $$0, Consumer<dhg.a> $$1) {
      sy $$2 = $$0.w();
      if ($$2 != null && $$2.b("effects", 9)) {
         dhg.a.b.parse(tm.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bns> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         cro.a($$4, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public cpq a(cpq $$0, cwe $$1, box $$2) {
      cpq $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cia && ((cia)$$2).fW().d ? $$3 : new cpq(cpt.pp);
   }
}
