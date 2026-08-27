import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class coi extends cmt {
   public static final String a = "effects";
   public static final int b = 160;

   public coi(cmt.a $$0) {
      super($$0);
   }

   public static void a(cmy $$0, List<der.a> $$1) {
      sn $$2 = $$0.w();
      der.a.b.encodeStart(tb.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cmy $$0, List<der.a> $$1) {
      sn $$2 = $$0.w();
      List<der.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      der.a.b.encodeStart(tb.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cmy $$0, Consumer<der.a> $$1) {
      sn $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         der.a.b.parse(tb.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bli> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         coy.a($$4, $$2, 1.0F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public cmy a(cmy $$0, ctp $$1, bml $$2) {
      cmy $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cfi && ((cfi)$$2).fT().d ? $$3 : new cmy(cnb.pn);
   }
}
