import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cqn extends coy {
   public static final String a = "effects";
   public static final int b = 160;

   public cqn(coy.a $$0) {
      super($$0);
   }

   public static void a(cpd $$0, List<dgt.a> $$1) {
      sw $$2 = $$0.x();
      dgt.a.b.encodeStart(tk.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cpd $$0, List<dgt.a> $$1) {
      sw $$2 = $$0.x();
      List<dgt.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dgt.a.b.encodeStart(tk.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cpd $$0, Consumer<dgt.a> $$1) {
      sw $$2 = $$0.w();
      if ($$2 != null && $$2.b("effects", 9)) {
         dgt.a.b.parse(tk.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bnd> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         crb.a($$4, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public cpd a(cpd $$0, cvr $$1, boi $$2) {
      cpd $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof chl && ((chl)$$2).fU().d ? $$3 : new cpd(cpg.pp);
   }
}
