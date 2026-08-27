import com.google.common.collect.Lists;
import java.util.List;

public class eyf extends epf {
   private static final acq b = new acq("textures/gui/recipe_book.png");
   private static final float c = 15.0F;
   private static final int d = 25;
   public static final int a = 30;
   private static final sw e = sw.c("gui.recipebook.moreRecipes");
   private ccp<?> f;
   private amk g;
   private eyg h;
   private float i;
   private float j;
   private int k;

   public eyf() {
      super(0, 0, 25, 25, sv.a);
   }

   public void a(eyg $$0, eyd $$1) {
      this.h = $$0;
      this.f = (ccp<?>)$$1.d().t.bR;
      this.g = $$1.e();
      List<cjc<?>> $$2 = $$0.a(this.g.a(this.f));

      for (cjc<?> $$3 : $$2) {
         if (this.g.d($$3)) {
            $$1.a($$2);
            this.j = 15.0F;
            break;
         }
      }
   }

   public eyg a() {
      return this.h;
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      if (!euq.p()) {
         this.i += $$3;
      }

      enn $$4 = enn.N();
      int $$5 = 29;
      if (!this.h.c()) {
         $$5 += 25;
      }

      int $$6 = 206;
      if (this.h.a(this.g.a(this.f)).size() > 1) {
         $$6 += 25;
      }

      boolean $$7 = this.j > 0.0F;
      if ($$7) {
         float $$8 = 1.0F + 0.1F * (float)Math.sin((double)(this.j / 15.0F * (float) Math.PI));
         $$0.c().a();
         $$0.c().a((float)(this.p() + 8), (float)(this.r() + 12), 0.0F);
         $$0.c().b($$8, $$8, 1.0F);
         $$0.c().a((float)(-(this.p() + 8)), (float)(-(this.r() + 12)), 0.0F);
         this.j -= $$3;
      }

      $$0.a(b, this.p(), this.r(), $$5, $$6, this.o, this.p);
      List<cjc<?>> $$9 = this.g();
      this.k = apa.d(this.i / 30.0F) % $$9.size();
      cfz $$10 = $$9.get(this.k).a(this.h.a());
      int $$11 = 4;
      if (this.h.f() && this.g().size() > 1) {
         $$0.a($$10, this.p() + $$11 + 1, this.r() + $$11 + 1, 0, 10);
         $$11--;
      }

      $$0.b($$10, this.p() + $$11, this.r() + $$11);
      if ($$7) {
         $$0.c().b();
      }
   }

   private List<cjc<?>> g() {
      List<cjc<?>> $$0 = this.h.b(true);
      if (!this.g.a(this.f)) {
         $$0.addAll(this.h.b(false));
      }

      return $$0;
   }

   public boolean b() {
      return this.g().size() == 1;
   }

   public cjc<?> e() {
      List<cjc<?>> $$0 = this.g();
      return $$0.get(this.k);
   }

   public List<sw> f() {
      cfz $$0 = this.g().get(this.k).a(this.h.a());
      List<sw> $$1 = Lists.newArrayList(euq.a(enn.N(), $$0));
      if (this.h.a(this.g.a(this.f)).size() > 1) {
         $$1.add(e);
      }

      return $$1;
   }

   @Override
   public void a(esp $$0) {
      cfz $$1 = this.g().get(this.k).a(this.h.a());
      $$0.a(eso.a, sw.a("narration.recipe", $$1.y()));
      if (this.h.a(this.g.a(this.f)).size() > 1) {
         $$0.a(eso.d, sw.c("narration.button.usage.hovered"), sw.c("narration.recipe.usage.more"));
      } else {
         $$0.a(eso.d, sw.c("narration.button.usage.hovered"));
      }
   }

   @Override
   public int k() {
      return 25;
   }

   @Override
   protected boolean c(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }
}
