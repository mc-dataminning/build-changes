import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dkg extends dnj {
   public static final MapCodec<dkg> a = b(dkg::new);
   public static final dxt<jn> b = dnj.aF;
   @Nullable
   private dxb c;
   @Nullable
   private dxb d;
   @Nullable
   private dxb e;
   @Nullable
   private dxb f;
   private static final Predicate<dww> g = $$0 -> $$0 != null && ($$0.a(djn.er) || $$0.a(djn.es));

   @Override
   public MapCodec<? extends dkg> a() {
      return a;
   }

   protected dkg(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dgk $$0, ji $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dgh $$0, ji $$1) {
      dxb.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         chv $$3 = bur.bk.a($$0, buq.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dxb.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            chj $$5 = bur.ap.a($$0, buq.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dgh $$0, dxb.b $$1, buk $$2, ji $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (are $$4 : $$0.a(are.class, $$2.cR().g(5.0))) {
         ap.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dgh $$0, dxb.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxa $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), djn.a.m(), 2);
            $$0.c(2001, $$4.d(), djl.j($$4.a()));
         }
      }
   }

   public static void b(dgh $$0, dxb.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxa $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), djn.a);
         }
      }
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   private dxb b() {
      if (this.c == null) {
         this.c = dxc.a().a(" ", "#", "#").a('#', dxa.a(dxf.a(djn.ec))).b();
      }

      return this.c;
   }

   private dxb q() {
      if (this.d == null) {
         this.d = dxc.a().a("^", "#", "#").a('^', dxa.a(g)).a('#', dxa.a(dxf.a(djn.ec))).b();
      }

      return this.d;
   }

   private dxb r() {
      if (this.e == null) {
         this.e = dxc.a().a("~ ~", "###", "~#~").a('#', dxa.a(dxf.a(djn.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dxb y() {
      if (this.f == null) {
         this.f = dxc.a().a("~^~", "###", "~#~").a('^', dxa.a(g)).a('#', dxa.a(dxf.a(djn.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
