import com.google.common.collect.Lists;
import java.util.List;

public class fgs extends exe {
   private static final ahg b = new ahg("recipe_book/slot_many_craftable");
   private static final ahg c = new ahg("recipe_book/slot_craftable");
   private static final ahg d = new ahg("recipe_book/slot_many_uncraftable");
   private static final ahg e = new ahg("recipe_book/slot_uncraftable");
   private static final float f = 15.0F;
   private static final int m = 25;
   public static final int a = 30;
   private static final vf n = vf.c("gui.recipebook.moreRecipes");
   private cjo<?> o;
   private arv p;
   private fgt q;
   private float r;
   private float t;
   private int u;

   public fgs() {
      super(0, 0, 25, 25, ve.a);
   }

   public void a(fgt $$0, fgq $$1) {
      this.q = $$0;
      this.o = (cjo<?>)$$1.d().s.bS;
      this.p = $$1.e();
      List<cqe<?>> $$2 = $$0.a(this.p.a(this.o));

      for (cqe<?> $$3 : $$2) {
         if (this.p.d($$3)) {
            $$1.a($$2);
            this.t = 15.0F;
            break;
         }
      }
   }

   public fgt a() {
      return this.q;
   }

   @Override
   public void b(ewu $$0, int $$1, int $$2, float $$3) {
      if (!fdb.s()) {
         this.r += $$3;
      }

      ahg $$4;
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
         $$0.c().a((float)(this.B() + 8), (float)(this.C() + 12), 0.0F);
         $$0.c().b($$9, $$9, 1.0F);
         $$0.c().a((float)(-(this.B() + 8)), (float)(-(this.C() + 12)), 0.0F);
         this.t -= $$3;
      }

      $$0.a($$4, this.B(), this.C(), this.g, this.h);
      List<cqe<?>> $$10 = this.f();
      this.u = auo.d(this.r / 30.0F) % $$10.size();
      cmy $$11 = $$10.get(this.u).b().a(this.q.a());
      int $$12 = 4;
      if (this.q.f() && this.f().size() > 1) {
         $$0.a($$11, this.B() + $$12 + 1, this.C() + $$12 + 1, 0, 10);
         $$12--;
      }

      $$0.b($$11, this.B() + $$12, this.C() + $$12);
      if ($$8) {
         $$0.c().b();
      }
   }

   private List<cqe<?>> f() {
      List<cqe<?>> $$0 = this.q.b(true);
      if (!this.p.a(this.o)) {
         $$0.addAll(this.q.b(false));
      }

      return $$0;
   }

   public boolean b() {
      return this.f().size() == 1;
   }

   public cqe<?> d() {
      List<cqe<?>> $$0 = this.f();
      return $$0.get(this.u);
   }

   public List<vf> e() {
      cmy $$0 = this.f().get(this.u).b().a(this.q.a());
      List<vf> $$1 = Lists.newArrayList(fdb.a(evi.O(), $$0));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$1.add(n);
      }

      return $$1;
   }

   @Override
   public void a(faz $$0) {
      cmy $$1 = this.f().get(this.u).b().a(this.q.a());
      $$0.a(fay.a, vf.a("narration.recipe", $$1.y()));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$0.a(fay.d, vf.c("narration.button.usage.hovered"), vf.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fay.d, vf.c("narration.button.usage.hovered"));
      }
   }

   @Override
   public int w() {
      return 25;
   }

   @Override
   protected boolean k(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }
}
