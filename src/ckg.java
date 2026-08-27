import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ckg extends cir {
   public static final String a = "Effects";
   public static final String b = "EffectId";
   public static final String c = "EffectDuration";
   public static final int d = 160;

   public ckg(cir.a $$0) {
      super($$0);
   }

   public static void a(ciw $$0, bhr $$1, int $$2) {
      qs $$3 = $$0.w();
      qy $$4 = $$3.c("Effects", 9);
      qs $$5 = new qs();
      $$5.a("EffectId", bhr.a($$1));
      $$5.a("EffectDuration", $$2);
      $$4.add($$5);
      $$3.a("Effects", $$4);
   }

   private static void a(ciw $$0, Consumer<bht> $$1) {
      qs $$2 = $$0.v();
      if ($$2 != null && $$2.b("Effects", 9)) {
         qy $$3 = $$2.c("Effects", 10);

         for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
            qs $$5 = $$3.a($$4);
            int $$6;
            if ($$5.b("EffectDuration", 99)) {
               $$6 = $$5.h("EffectDuration");
            } else {
               $$6 = 160;
            }

            bhr $$8 = bhr.a($$5.h("EffectId"));
            if ($$8 != null) {
               $$1.accept(new bht($$8, $$6));
            }
         }
      }
   }

   @Override
   public void a(ciw $$0, @Nullable cpk $$1, List<te> $$2, ckn $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bht> $$4 = new ArrayList<>();
         a($$0, $$4::add);
         ckv.a($$4, $$2, 1.0F);
      }
   }

   @Override
   public ciw a(ciw $$0, cpk $$1, biw $$2) {
      ciw $$3 = super.a($$0, $$1, $$2);
      a($$3, $$2::b);
      return $$2 instanceof cbl && ((cbl)$$2).fR().d ? $$3 : new ciw(ciz.oC);
   }
}
