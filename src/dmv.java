import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dmv extends dqa {
   public static final MapCodec<dmv> a = b(dmv::new);
   public static final eax<ja> b = dqa.e;
   @Nullable
   private eae c;
   @Nullable
   private eae d;
   @Nullable
   private eae f;
   @Nullable
   private eae g;
   private static final Predicate<dzz> h = $$0 -> $$0 != null && ($$0.a(dmc.es) || $$0.a(dmc.et));

   @Override
   public MapCodec<? extends dmv> a() {
      return a;
   }

   protected dmv(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c));
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(diy $$0, iu $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(div $$0, iu $$1) {
      eae.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         cju $$3 = bwm.bl.a($$0, bwl.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         eae.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cjg $$5 = bwm.ap.a($$0, bwl.k);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(div $$0, eae.b $$1, bwd $$2, iu $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arr $$4 : $$0.a(arr.class, $$2.cR().g(5.0))) {
         ap.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(div $$0, eae.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            ead $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dmc.a.m(), 2);
            $$0.c(2001, $$4.d(), dma.j($$4.a()));
         }
      }
   }

   public static void b(div $$0, eae.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            ead $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dmc.a);
         }
      }
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   private eae b() {
      if (this.c == null) {
         this.c = eaf.a().a(" ", "#", "#").a('#', ead.a(eai.a(dmc.ed))).b();
      }

      return this.c;
   }

   private eae q() {
      if (this.d == null) {
         this.d = eaf.a().a("^", "#", "#").a('^', ead.a(h)).a('#', ead.a(eai.a(dmc.ed))).b();
      }

      return this.d;
   }

   private eae r() {
      if (this.f == null) {
         this.f = eaf.a().a("~ ~", "###", "~#~").a('#', ead.a(eai.a(dmc.cq))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }

   private eae y() {
      if (this.g == null) {
         this.g = eaf.a().a("~^~", "###", "~#~").a('^', ead.a(h)).a('#', ead.a(eai.a(dmc.cq))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.g;
   }
}
