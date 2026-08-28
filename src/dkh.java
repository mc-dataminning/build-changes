import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dkh extends dnk {
   public static final MapCodec<dkh> a = b(dkh::new);
   public static final dxu<jn> b = dnk.aF;
   @Nullable
   private dxc c;
   @Nullable
   private dxc d;
   @Nullable
   private dxc e;
   @Nullable
   private dxc f;
   private static final Predicate<dwx> g = $$0 -> $$0 != null && ($$0.a(djo.er) || $$0.a(djo.es));

   @Override
   public MapCodec<? extends dkh> a() {
      return a;
   }

   protected dkh(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dgl $$0, ji $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dgi $$0, ji $$1) {
      dxc.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         chw $$3 = bus.bk.a($$0, bur.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dxc.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            chk $$5 = bus.ap.a($$0, bur.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dgi $$0, dxc.b $$1, bul $$2, ji $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (are $$4 : $$0.a(are.class, $$2.cR().g(5.0))) {
         ap.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dgi $$0, dxc.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxb $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), djo.a.m(), 2);
            $$0.c(2001, $$4.d(), djm.j($$4.a()));
         }
      }
   }

   public static void b(dgi $$0, dxc.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxb $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), djo.a);
         }
      }
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   private dxc b() {
      if (this.c == null) {
         this.c = dxd.a().a(" ", "#", "#").a('#', dxb.a(dxg.a(djo.ec))).b();
      }

      return this.c;
   }

   private dxc q() {
      if (this.d == null) {
         this.d = dxd.a().a("^", "#", "#").a('^', dxb.a(g)).a('#', dxb.a(dxg.a(djo.ec))).b();
      }

      return this.d;
   }

   private dxc r() {
      if (this.e == null) {
         this.e = dxd.a().a("~ ~", "###", "~#~").a('#', dxb.a(dxg.a(djo.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dxc y() {
      if (this.f == null) {
         this.f = dxd.a().a("~^~", "###", "~#~").a('^', dxb.a(g)).a('#', dxb.a(dxg.a(djo.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
