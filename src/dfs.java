import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfs extends diu {
   public static final MapCodec<dfs> a = b(dfs::new);
   public static final dsv b = diu.aE;
   @Nullable
   private dsg c;
   @Nullable
   private dsg d;
   @Nullable
   private dsg e;
   @Nullable
   private dsg f;
   private static final Predicate<dsb> g = $$0 -> $$0 != null && ($$0.a(dfa.ee) || $$0.a(dfa.ef));

   @Override
   public MapCodec<? extends dfs> a() {
      return a;
   }

   protected dfs(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dca $$0, iz $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(dbx $$0, iz $$1) {
      dsg.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cgc $$3 = bsz.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dsg.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cfq $$5 = bsz.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dbx $$0, dsg.b $$1, bst $$2, iz $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arf $$4 : $$0.a(arf.class, $$2.cK().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dbx $$0, dsg.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsf $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dfa.a.o(), 2);
            $$0.c(2001, $$4.d(), dey.i($$4.a()));
         }
      }
   }

   public static void b(dbx $$0, dsg.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsf $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dfa.a);
         }
      }
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   private dsg b() {
      if (this.c == null) {
         this.c = dsh.a().a(" ", "#", "#").a('#', dsf.a(dsk.a(dfa.dP))).b();
      }

      return this.c;
   }

   private dsg m() {
      if (this.d == null) {
         this.d = dsh.a().a("^", "#", "#").a('^', dsf.a(g)).a('#', dsf.a(dsk.a(dfa.dP))).b();
      }

      return this.d;
   }

   private dsg y() {
      if (this.e == null) {
         this.e = dsh.a().a("~ ~", "###", "~#~").a('#', dsf.a(dsk.a(dfa.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dsg z() {
      if (this.f == null) {
         this.f = dsh.a().a("~^~", "###", "~#~").a('^', dsf.a(g)).a('#', dsf.a(dsk.a(dfa.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
