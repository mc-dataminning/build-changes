import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dau extends ddv {
   public static final MapCodec<dau> a = b(dau::new);
   public static final dnt b = ddv.aE;
   @Nullable
   private dne c;
   @Nullable
   private dne d;
   @Nullable
   private dne e;
   @Nullable
   private dne f;
   private static final Predicate<dmz> g = $$0 -> $$0 != null && ($$0.a(dac.ee) || $$0.a(dac.ef));

   @Override
   public MapCodec<? extends dau> a() {
      return a;
   }

   protected dau(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cxc $$0, ib $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(cwz $$0, ib $$1) {
      dne.b $$2 = this.i().a($$0, $$1);
      if ($$2 != null) {
         ccb $$3 = bpc.aR.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dne.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cbp $$5 = bpc.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cwz $$0, dne.b $$1, bow $$2, ib $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (apg $$4 : $$0.a(apg.class, $$2.cH().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cwz $$0, dne.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dnd $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dac.a.o(), 2);
            $$0.c(2001, $$4.d(), daa.i($$4.a()));
         }
      }
   }

   public static void b(cwz $$0, dne.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dnd $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dac.a);
         }
      }
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   private dne b() {
      if (this.c == null) {
         this.c = dnf.a().a(" ", "#", "#").a('#', dnd.a(dni.a(dac.dP))).b();
      }

      return this.c;
   }

   private dne i() {
      if (this.d == null) {
         this.d = dnf.a().a("^", "#", "#").a('^', dnd.a(g)).a('#', dnd.a(dni.a(dac.dP))).b();
      }

      return this.d;
   }

   private dne s() {
      if (this.e == null) {
         this.e = dnf.a().a("~ ~", "###", "~#~").a('#', dnd.a(dni.a(dac.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dne y() {
      if (this.f == null) {
         this.f = dnf.a().a("~^~", "###", "~#~").a('^', dnd.a(g)).a('#', dnd.a(dni.a(dac.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
