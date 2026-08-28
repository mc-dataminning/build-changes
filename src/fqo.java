import com.google.common.collect.Lists;
import java.util.List;

public class fqo extends fgx {
   private static final alb b = new alb("recipe_book/slot_many_craftable");
   private static final alb c = new alb("recipe_book/slot_craftable");
   private static final alb d = new alb("recipe_book/slot_many_uncraftable");
   private static final alb e = new alb("recipe_book/slot_uncraftable");
   private static final float f = 15.0F;
   private static final int m = 25;
   public static final int a = 30;
   private static final xl n = xl.c("gui.recipebook.moreRecipes");
   private crc<?> o;
   private avz p;
   private fqp q;
   private float r;
   private float s;
   private int u;

   public fqo() {
      super(0, 0, 25, 25, xk.a);
   }

   public void a(fqp $$0, fqm $$1) {
      this.q = $$0;
      this.o = (crc<?>)$$1.d().s.cb;
      this.p = $$1.e();
      List<cys<?>> $$2 = $$0.a(this.p.a(this.o));

      for (cys<?> $$3 : $$2) {
         if (this.p.d($$3)) {
            $$1.a($$2);
            this.s = 15.0F;
            break;
         }
      }
   }

   public fqp a() {
      return this.q;
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      if (!fmy.r()) {
         this.r += $$3;
      }

      alb $$4;
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

      boolean $$8 = this.s > 0.0F;
      if ($$8) {
         float $$9 = 1.0F + 0.1F * (float)Math.sin((double)(this.s / 15.0F * (float) Math.PI));
         $$0.c().a();
         $$0.c().a((float)(this.C() + 8), (float)(this.D() + 12), 0.0F);
         $$0.c().b($$9, $$9, 1.0F);
         $$0.c().a((float)(-(this.C() + 8)), (float)(-(this.D() + 12)), 0.0F);
         this.s -= $$3;
      }

      $$0.a($$4, this.C(), this.D(), this.g, this.h);
      List<cys<?>> $$10 = this.f();
      this.u = ayu.d(this.r / 30.0F) % $$10.size();
      cuk $$11 = $$10.get(this.u).b().a(this.q.a());
      int $$12 = 4;
      if (this.q.f() && this.f().size() > 1) {
         $$0.a($$11, this.C() + $$12 + 1, this.D() + $$12 + 1, 0, 10);
         $$12--;
      }

      $$0.b($$11, this.C() + $$12, this.D() + $$12);
      if ($$8) {
         $$0.c().b();
      }
   }

   private List<cys<?>> f() {
      List<cys<?>> $$0 = this.q.b(true);
      if (!this.p.a(this.o)) {
         $$0.addAll(this.q.b(false));
      }

      return $$0;
   }

   public boolean b() {
      return this.f().size() == 1;
   }

   public cys<?> d() {
      List<cys<?>> $$0 = this.f();
      return $$0.get(this.u);
   }

   public List<xl> e() {
      cuk $$0 = this.f().get(this.u).b().a(this.q.a());
      List<xl> $$1 = Lists.newArrayList(fmy.a(ffa.Q(), $$0));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$1.add(n);
      }

      return $$1;
   }

   @Override
   public void a(fkv $$0) {
      cuk $$1 = this.f().get(this.u).b().a(this.q.a());
      $$0.a(fku.a, xl.a("narration.recipe", $$1.x()));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$0.a(fku.d, xl.c("narration.button.usage.hovered"), xl.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fku.d, xl.c("narration.button.usage.hovered"));
      }
   }

   @Override
   public int x() {
      return 25;
   }

   @Override
   protected boolean j(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }
}
