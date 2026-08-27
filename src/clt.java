import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class clt extends cke {
   public static final String a = "effects";
   public static final int b = 160;

   public clt(cke.a $$0) {
      super($$0);
   }

   public static void a(ckj $$0, List<dca.a> $$1) {
      rt $$2 = $$0.w();
      dca.a.b.encodeStart(sf.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(ckj $$0, List<dca.a> $$1) {
      rt $$2 = $$0.w();
      List<dca.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dca.a.b.encodeStart(sf.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(ckj $$0, Consumer<dca.a> $$1) {
      rt $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         dca.a.b.parse(sf.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bjg> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         cmi.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public ckj a(ckj $$0, cqz $$1, bkj $$2) {
      ckj $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof ccx && ((ccx)$$2).fT().d ? $$3 : new ckj(ckm.oC);
   }
}
