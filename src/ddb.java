import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ddb extends dgc {
   public static final MapCodec<ddb> a = b(ddb::new);
   public static final dqc b = dgc.aE;
   @Nullable
   private dpn c;
   @Nullable
   private dpn d;
   @Nullable
   private dpn e;
   @Nullable
   private dpn f;
   private static final Predicate<dpi> g = $$0 -> $$0 != null && ($$0.a(dcj.ee) || $$0.a(dcj.ef));

   @Override
   public MapCodec<? extends ddb> a() {
      return a;
   }

   protected ddb(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.c));
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(czj $$0, id $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(czg $$0, id $$1) {
      dpn.b $$2 = this.k().a($$0, $$1);
      if ($$2 != null) {
         cdg $$3 = bqg.aR.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dpn.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            ccu $$5 = bqg.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(czg $$0, dpn.b $$1, bqa $$2, id $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (apv $$4 : $$0.a(apv.class, $$2.cH().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(czg $$0, dpn.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dpm $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dcj.a.n(), 2);
            $$0.c(2001, $$4.d(), dch.i($$4.a()));
         }
      }
   }

   public static void b(czg $$0, dpn.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dpm $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dcj.a);
         }
      }
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(b, $$0.g().g());
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   private dpn b() {
      if (this.c == null) {
         this.c = dpo.a().a(" ", "#", "#").a('#', dpm.a(dpr.a(dcj.dP))).b();
      }

      return this.c;
   }

   private dpn k() {
      if (this.d == null) {
         this.d = dpo.a().a("^", "#", "#").a('^', dpm.a(g)).a('#', dpm.a(dpr.a(dcj.dP))).b();
      }

      return this.d;
   }

   private dpn s() {
      if (this.e == null) {
         this.e = dpo.a().a("~ ~", "###", "~#~").a('#', dpm.a(dpr.a(dcj.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dpn y() {
      if (this.f == null) {
         this.f = dpo.a().a("~^~", "###", "~#~").a('^', dpm.a(g)).a('#', dpm.a(dpr.a(dcj.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
