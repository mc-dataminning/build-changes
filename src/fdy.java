import com.google.common.collect.Lists;
import java.util.List;

public class fdy extends euk {
   private static final agg b = new agg("recipe_book/slot_many_craftable");
   private static final agg c = new agg("recipe_book/slot_craftable");
   private static final agg d = new agg("recipe_book/slot_many_uncraftable");
   private static final agg e = new agg("recipe_book/slot_uncraftable");
   private static final float l = 15.0F;
   private static final int m = 25;
   public static final int a = 30;
   private static final ur n = ur.c("gui.recipebook.moreRecipes");
   private chr<?> o;
   private aqq p;
   private fdz q;
   private float r;
   private float t;
   private int u;

   public fdy() {
      super(0, 0, 25, 25, uq.a);
   }

   public void a(fdz $$0, fdw $$1) {
      this.q = $$0;
      this.o = (chr<?>)$$1.d().s.bS;
      this.p = $$1.e();
      List<coh<?>> $$2 = $$0.a(this.p.a(this.o));

      for (coh<?> $$3 : $$2) {
         if (this.p.d($$3)) {
            $$1.a($$2);
            this.t = 15.0F;
            break;
         }
      }
   }

   public fdz a() {
      return this.q;
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      if (!fah.p()) {
         this.r += $$3;
      }

      agg $$4;
      if (this.q.c()) {
         if (this.q.a(this.p.a(this.o)).size() > 1) {
            $$4 = b;
         } else {
            $$4 = c;
         }
      } else if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$4 = d;
      } else {
         $$4 = e;
      }

      boolean $$8 = this.t > 0.0F;
      if ($$8) {
         float $$9 = 1.0F + 0.1F * (float)Math.sin((double)(this.t / 15.0F * (float) Math.PI));
         $$0.c().a();
         $$0.c().a((float)(this.p() + 8), (float)(this.r() + 12), 0.0F);
         $$0.c().b($$9, $$9, 1.0F);
         $$0.c().a((float)(-(this.p() + 8)), (float)(-(this.r() + 12)), 0.0F);
         this.t -= $$3;
      }

      $$0.a($$4, this.p(), this.r(), this.f, this.g);
      List<coh<?>> $$10 = this.g();
      this.u = ati.d(this.r / 30.0F) % $$10.size();
      clb $$11 = $$10.get(this.u).b().a(this.q.a());
      int $$12 = 4;
      if (this.q.f() && this.g().size() > 1) {
         $$0.a($$11, this.p() + $$12 + 1, this.r() + $$12 + 1, 0, 10);
         $$12--;
      }

      $$0.b($$11, this.p() + $$12, this.r() + $$12);
      if ($$8) {
         $$0.c().b();
      }
   }

   private List<coh<?>> g() {
      List<coh<?>> $$0 = this.q.b(true);
      if (!this.p.a(this.o)) {
         $$0.addAll(this.q.b(false));
      }

      return $$0;
   }

   public boolean b() {
      return this.g().size() == 1;
   }

   public coh<?> e() {
      List<coh<?>> $$0 = this.g();
      return $$0.get(this.u);
   }

   public List<ur> f() {
      clb $$0 = this.g().get(this.u).b().a(this.q.a());
      List<ur> $$1 = Lists.newArrayList(fah.a(esr.N(), $$0));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$1.add(n);
      }

      return $$1;
   }

   @Override
   public void a(eyf $$0) {
      clb $$1 = this.g().get(this.u).b().a(this.q.a());
      $$0.a(eye.a, ur.a("narration.recipe", $$1.y()));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$0.a(eye.d, ur.c("narration.button.usage.hovered"), ur.c("narration.recipe.usage.more"));
      } else {
         $$0.a(eye.d, ur.c("narration.button.usage.hovered"));
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
