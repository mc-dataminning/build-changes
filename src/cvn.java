import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cvn extends cyo {
   public static final MapCodec<cvn> a = b(cvn::new);
   public static final dhq b = cyo.aE;
   @Nullable
   private dhb c;
   @Nullable
   private dhb d;
   @Nullable
   private dhb e;
   @Nullable
   private dhb f;
   private static final Predicate<dgw> g = $$0 -> $$0 != null && ($$0.a(cuv.ee) || $$0.a(cuv.ef));

   @Override
   public MapCodec<? extends cvn> a() {
      return a;
   }

   protected cvn(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c));
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(crv $$0, ht $$1) {
      return this.b().a($$0, $$1) != null || this.x().a($$0, $$1) != null;
   }

   private void a(crs $$0, ht $$1) {
      dhb.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         bxh $$3 = bkm.aO.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dhb.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            bwv $$5 = bkm.ac.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(crs $$0, dhb.b $$1, bki $$2, ht $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (amb $$4 : $$0.a(amb.class, $$2.cG().g(5.0))) {
         al.n.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(crs $$0, dhb.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dha $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cuv.a.o(), 2);
            $$0.c(2001, $$4.d(), cut.i($$4.a()));
         }
      }
   }

   public static void b(crs $$0, dhb.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dha $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cuv.a);
         }
      }
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   private dhb b() {
      if (this.c == null) {
         this.c = dhc.a().a(" ", "#", "#").a('#', dha.a(dhf.a(cuv.dP))).b();
      }

      return this.c;
   }

   private dhb g() {
      if (this.d == null) {
         this.d = dhc.a().a("^", "#", "#").a('^', dha.a(g)).a('#', dha.a(dhf.a(cuv.dP))).b();
      }

      return this.d;
   }

   private dhb x() {
      if (this.e == null) {
         this.e = dhc.a().a("~ ~", "###", "~#~").a('#', dha.a(dhf.a(cuv.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dhb y() {
      if (this.f == null) {
         this.f = dhc.a().a("~^~", "###", "~#~").a('^', dha.a(g)).a('#', dha.a(dhf.a(cuv.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
