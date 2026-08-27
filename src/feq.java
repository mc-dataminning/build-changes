import com.google.common.collect.Lists;
import java.util.List;

public class feq extends evc {
   private static final agm b = new agm("recipe_book/slot_many_craftable");
   private static final agm c = new agm("recipe_book/slot_craftable");
   private static final agm d = new agm("recipe_book/slot_many_uncraftable");
   private static final agm e = new agm("recipe_book/slot_uncraftable");
   private static final float l = 15.0F;
   private static final int m = 25;
   public static final int a = 30;
   private static final uv n = uv.c("gui.recipebook.moreRecipes");
   private cie<?> o;
   private aqy p;
   private fer q;
   private float r;
   private float t;
   private int u;

   public feq() {
      super(0, 0, 25, 25, uu.a);
   }

   public void a(fer $$0, feo $$1) {
      this.q = $$0;
      this.o = (cie<?>)$$1.d().s.bS;
      this.p = $$1.e();
      List<cov<?>> $$2 = $$0.a(this.p.a(this.o));

      for (cov<?> $$3 : $$2) {
         if (this.p.d($$3)) {
            $$1.a($$2);
            this.t = 15.0F;
            break;
         }
      }
   }

   public fer a() {
      return this.q;
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      if (!faz.p()) {
         this.r += $$3;
      }

      agm $$4;
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
      List<cov<?>> $$10 = this.g();
      this.u = atq.d(this.r / 30.0F) % $$10.size();
      clo $$11 = $$10.get(this.u).b().a(this.q.a());
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

   private List<cov<?>> g() {
      List<cov<?>> $$0 = this.q.b(true);
      if (!this.p.a(this.o)) {
         $$0.addAll(this.q.b(false));
      }

      return $$0;
   }

   public boolean b() {
      return this.g().size() == 1;
   }

   public cov<?> e() {
      List<cov<?>> $$0 = this.g();
      return $$0.get(this.u);
   }

   public List<uv> f() {
      clo $$0 = this.g().get(this.u).b().a(this.q.a());
      List<uv> $$1 = Lists.newArrayList(faz.a(eti.N(), $$0));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$1.add(n);
      }

      return $$1;
   }

   @Override
   public void a(eyx $$0) {
      clo $$1 = this.g().get(this.u).b().a(this.q.a());
      $$0.a(eyw.a, uv.a("narration.recipe", $$1.y()));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$0.a(eyw.d, uv.c("narration.button.usage.hovered"), uv.c("narration.recipe.usage.more"));
      } else {
         $$0.a(eyw.d, uv.c("narration.button.usage.hovered"));
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
