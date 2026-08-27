import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ckp extends cja {
   public static final String a = "effects";
   public static final int b = 160;

   public ckp(cja.a $$0) {
      super($$0);
   }

   public static void a(cjf $$0, List<day.a> $$1) {
      qy $$2 = $$0.w();
      day.a.b.encodeStart(rj.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cjf $$0, List<day.a> $$1) {
      qy $$2 = $$0.w();
      List<day.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      day.a.b.encodeStart(rj.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cjf $$0, Consumer<day.a> $$1) {
      qy $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         day.a.b.parse(rj.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tm> $$2, ckw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bid> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         cle.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public cjf a(cjf $$0, cpv $$1, bjg $$2) {
      cjf $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cbu && ((cbu)$$2).fS().d ? $$3 : new cjf(cji.oC);
   }
}
