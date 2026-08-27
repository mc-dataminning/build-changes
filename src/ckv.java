import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ckv extends cjg {
   public static final String a = "effects";
   public static final int b = 160;

   public ckv(cjg.a $$0) {
      super($$0);
   }

   public static void a(cjl $$0, List<dbc.a> $$1) {
      qw $$2 = $$0.w();
      dbc.a.b.encodeStart(ri.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cjl $$0, List<dbc.a> $$1) {
      qw $$2 = $$0.w();
      List<dbc.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dbc.a.b.encodeStart(ri.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cjl $$0, Consumer<dbc.a> $$1) {
      qw $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         dbc.a.b.parse(ri.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bij> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         clk.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public cjl a(cjl $$0, cqb $$1, bjm $$2) {
      cjl $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cca && ((cca)$$2).fT().d ? $$3 : new cjl(cjo.oC);
   }
}
