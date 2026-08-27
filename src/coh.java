import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class coh extends cms {
   public static final String a = "effects";
   public static final int b = 160;

   public coh(cms.a $$0) {
      super($$0);
   }

   public static void a(cmx $$0, List<deq.a> $$1) {
      sn $$2 = $$0.w();
      deq.a.b.encodeStart(tb.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cmx $$0, List<deq.a> $$1) {
      sn $$2 = $$0.w();
      List<deq.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      deq.a.b.encodeStart(tb.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cmx $$0, Consumer<deq.a> $$1) {
      sn $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         deq.a.b.parse(tb.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<blh> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         cox.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public cmx a(cmx $$0, cto $$1, bmk $$2) {
      cmx $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cfh && ((cfh)$$2).fT().d ? $$3 : new cmx(cna.pn);
   }
}
