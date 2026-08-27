import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class cxx extends czf {
   public static final int a = 3;
   public static final dmv b = dmu.r;

   @Override
   protected abstract MapCodec<? extends cxx> a();

   protected cxx(dmd.d $$0) {
      super($$0);
   }

   protected abstract Iterable<eov> b(dme var1);

   public static boolean c(dme $$0) {
      return $$0.b(b) && ($$0.a(aue.ae) || $$0.a(aue.bj)) && $$0.c(b);
   }

   @Override
   protected void a(cwe $$0, dme $$1, eor $$2, cis $$3) {
      if (!$$0.B && $$3.bK() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dme $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(cwe $$0, eov $$1, awt $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(kb.ab, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, atp.dB, atq.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(kb.aG, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cia $$0, dme $$1, cwf $$2, ib $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof cxx) {
         ((cxx)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(kb.ab, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, atp.dD, atq.e, 1.0F, 1.0F);
      $$2.a($$0, dqr.c, $$3);
   }

   private static void a(cwf $$0, dme $$1, ib $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, cvw $$3, BiConsumer<cpq, ib> $$4) {
      if ($$3.j() == cvw.a.d && !$$1.y_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
