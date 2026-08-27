import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cnr extends cmc {
   public static final String a = "effects";
   public static final int b = 160;

   public cnr(cmc.a $$0) {
      super($$0);
   }

   public static void a(cmh $$0, List<dea.a> $$1) {
      sj $$2 = $$0.w();
      dea.a.b.encodeStart(sx.a, $$1).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   public static void b(cmh $$0, List<dea.a> $$1) {
      sj $$2 = $$0.w();
      List<dea.a> $$3 = new ArrayList<>();
      a($$0, $$3::add);
      $$3.addAll($$1);
      dea.a.b.encodeStart(sx.a, $$3).result().ifPresent($$1x -> $$2.a("effects", $$1x));
   }

   private static void a(cmh $$0, Consumer<dea.a> $$1) {
      sj $$2 = $$0.v();
      if ($$2 != null && $$2.b("effects", 9)) {
         dea.a.b.parse(sx.a, $$2.c("effects", 10)).result().ifPresent($$1x -> $$1x.forEach($$1));
      }
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bks> $$4 = new ArrayList<>();
         a($$0, $$1x -> $$4.add($$1x.a()));
         cog.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public cmh a(cmh $$0, csy $$1, blv $$2) {
      cmh $$3 = super.a($$0, $$1, $$2);
      a($$3, $$1x -> $$2.b($$1x.a()));
      return $$2 instanceof cer && ((cer)$$2).fT().d ? $$3 : new cmh(cmk.pn);
   }
}
