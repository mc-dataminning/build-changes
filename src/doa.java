import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class doa extends drf {
   public static final MapCodec<doa> a = b(doa::new);
   public static final ece<jc> b = drf.e;
   @Nullable
   private ebl c;
   @Nullable
   private ebl d;
   @Nullable
   private ebl f;
   @Nullable
   private ebl g;
   private static final Predicate<ebg> h = $$0 -> $$0 != null && ($$0.a(dng.ev) || $$0.a(dng.ew));

   @Override
   public MapCodec<? extends doa> a() {
      return a;
   }

   protected doa(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c));
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dkc $$0, iw $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(djz $$0, iw $$1) {
      ebl.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         ckp $$3 = bxe.bm.a($$0, bxd.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         ebl.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            ckc $$5 = bxe.aq.a($$0, bxd.k);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(djz $$0, ebl.b $$1, bwv $$2, iw $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arv $$4 : $$0.a(arv.class, $$2.cR().g(5.0))) {
         aq.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(djz $$0, ebl.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            ebk $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dng.a.m(), 2);
            $$0.c(2001, $$4.d(), dne.j($$4.a()));
         }
      }
   }

   public static void b(djz $$0, ebl.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            ebk $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dng.a);
         }
      }
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   private ebl b() {
      if (this.c == null) {
         this.c = ebm.a().a(" ", "#", "#").a('#', ebk.a(ebp.a(dng.ef))).b();
      }

      return this.c;
   }

   private ebl q() {
      if (this.d == null) {
         this.d = ebm.a().a("^", "#", "#").a('^', ebk.a(h)).a('#', ebk.a(ebp.a(dng.ef))).b();
      }

      return this.d;
   }

   private ebl r() {
      if (this.f == null) {
         this.f = ebm.a().a("~ ~", "###", "~#~").a('#', ebk.a(ebp.a(dng.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }

   private ebl y() {
      if (this.g == null) {
         this.g = ebm.a().a("~^~", "###", "~#~").a('^', ebk.a(h)).a('#', ebk.a(ebp.a(dng.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.g;
   }
}
