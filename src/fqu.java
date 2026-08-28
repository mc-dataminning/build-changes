import com.google.common.collect.Lists;
import java.util.List;

public class fqu extends fhd {
   private static final alf b = new alf("recipe_book/slot_many_craftable");
   private static final alf c = new alf("recipe_book/slot_craftable");
   private static final alf d = new alf("recipe_book/slot_many_uncraftable");
   private static final alf e = new alf("recipe_book/slot_uncraftable");
   private static final float f = 15.0F;
   private static final int m = 25;
   public static final int a = 30;
   private static final xp n = xp.c("gui.recipebook.moreRecipes");
   private cri<?> o;
   private awd p;
   private fqv q;
   private float r;
   private float s;
   private int u;

   public fqu() {
      super(0, 0, 25, 25, xo.a);
   }

   public void a(fqv $$0, fqs $$1) {
      this.q = $$0;
      this.o = (cri<?>)$$1.d().s.cb;
      this.p = $$1.e();
      List<cyy<?>> $$2 = $$0.a(this.p.a(this.o));

      for (cyy<?> $$3 : $$2) {
         if (this.p.d($$3)) {
            $$1.a($$2);
            this.s = 15.0F;
            break;
         }
      }
   }

   public fqv a() {
      return this.q;
   }

   @Override
   public void b(fgs $$0, int $$1, int $$2, float $$3) {
      if (!fne.s()) {
         this.r += $$3;
      }

      alf $$4;
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
      List<cyy<?>> $$10 = this.f();
      this.u = ayz.d(this.r / 30.0F) % $$10.size();
      cuq $$11 = $$10.get(this.u).b().a(this.q.a());
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

   private List<cyy<?>> f() {
      List<cyy<?>> $$0 = this.q.b(true);
      if (!this.p.a(this.o)) {
         $$0.addAll(this.q.b(false));
      }

      return $$0;
   }

   public boolean b() {
      return this.f().size() == 1;
   }

   public cyy<?> c() {
      List<cyy<?>> $$0 = this.f();
      return $$0.get(this.u);
   }

   public List<xp> e() {
      cuq $$0 = this.f().get(this.u).b().a(this.q.a());
      List<xp> $$1 = Lists.newArrayList(fne.a(ffg.Q(), $$0));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$1.add(n);
      }

      return $$1;
   }

   @Override
   public void a(flb $$0) {
      cuq $$1 = this.f().get(this.u).b().a(this.q.a());
      $$0.a(fla.a, xp.a("narration.recipe", $$1.x()));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$0.a(fla.d, xp.c("narration.button.usage.hovered"), xp.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fla.d, xp.c("narration.button.usage.hovered"));
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
