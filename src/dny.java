import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dny extends drd {
   public static final MapCodec<dny> a = b(dny::new);
   public static final ecc<jb> b = drd.e;
   @Nullable
   private ebj c;
   @Nullable
   private ebj d;
   @Nullable
   private ebj f;
   @Nullable
   private ebj g;
   private static final Predicate<ebe> h = $$0 -> $$0 != null && ($$0.a(dne.ev) || $$0.a(dne.ew));

   @Override
   public MapCodec<? extends dny> a() {
      return a;
   }

   protected dny(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c));
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dka $$0, iv $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(djx $$0, iv $$1) {
      ebj.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         ckn $$3 = bxc.bm.a($$0, bxb.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         ebj.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cka $$5 = bxc.aq.a($$0, bxb.k);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(djx $$0, ebj.b $$1, bwt $$2, iv $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (art $$4 : $$0.a(art.class, $$2.cR().g(5.0))) {
         aq.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(djx $$0, ebj.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            ebi $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dne.a.m(), 2);
            $$0.c(2001, $$4.d(), dnc.j($$4.a()));
         }
      }
   }

   public static void b(djx $$0, ebj.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            ebi $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dne.a);
         }
      }
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   private ebj b() {
      if (this.c == null) {
         this.c = ebk.a().a(" ", "#", "#").a('#', ebi.a(ebn.a(dne.ef))).b();
      }

      return this.c;
   }

   private ebj q() {
      if (this.d == null) {
         this.d = ebk.a().a("^", "#", "#").a('^', ebi.a(h)).a('#', ebi.a(ebn.a(dne.ef))).b();
      }

      return this.d;
   }

   private ebj r() {
      if (this.f == null) {
         this.f = ebk.a().a("~ ~", "###", "~#~").a('#', ebi.a(ebn.a(dne.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }

   private ebj y() {
      if (this.g == null) {
         this.g = ebk.a().a("~^~", "###", "~#~").a('^', ebi.a(h)).a('#', ebi.a(ebn.a(dne.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.g;
   }
}
