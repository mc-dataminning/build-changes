import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dig extends dli {
   public static final MapCodec<dig> a = b(dig::new);
   public static final dvm b = dli.aF;
   @Nullable
   private dux c;
   @Nullable
   private dux d;
   @Nullable
   private dux e;
   @Nullable
   private dux f;
   private static final Predicate<dus> g = $$0 -> $$0 != null && ($$0.a(dho.ee) || $$0.a(dho.ef));

   @Override
   public MapCodec<? extends dig> a() {
      return a;
   }

   protected dig(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.c));
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dem $$0, jf $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(dej $$0, jf $$1) {
      dux.b $$2 = this.l().a($$0, $$1);
      if ($$2 != null) {
         chb $$3 = bty.aS.a($$0, btx.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dux.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cgp $$5 = bty.af.a($$0, btx.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dej $$0, dux.b $$1, btr $$2, jf $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (ark $$4 : $$0.a(ark.class, $$2.cO().g(5.0))) {
         an.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dej $$0, dux.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            duw $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dho.a.n(), 2);
            $$0.c(2001, $$4.d(), dhm.j($$4.a()));
         }
      }
   }

   public static void b(dej $$0, dux.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            duw $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dho.a);
         }
      }
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(b, $$0.g().g());
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   private dux b() {
      if (this.c == null) {
         this.c = duy.a().a(" ", "#", "#").a('#', duw.a(dvb.a(dho.dP))).b();
      }

      return this.c;
   }

   private dux l() {
      if (this.d == null) {
         this.d = duy.a().a("^", "#", "#").a('^', duw.a(g)).a('#', duw.a(dvb.a(dho.dP))).b();
      }

      return this.d;
   }

   private dux y() {
      if (this.e == null) {
         this.e = duy.a().a("~ ~", "###", "~#~").a('#', duw.a(dvb.a(dho.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dux z() {
      if (this.f == null) {
         this.f = duy.a().a("~^~", "###", "~#~").a('^', duw.a(g)).a('#', duw.a(dvb.a(dho.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
