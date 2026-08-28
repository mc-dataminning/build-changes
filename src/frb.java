import com.google.common.collect.Lists;
import java.util.List;

public class frb extends fhk {
   private static final akk b = new akk("recipe_book/slot_many_craftable");
   private static final akk c = new akk("recipe_book/slot_craftable");
   private static final akk d = new akk("recipe_book/slot_many_uncraftable");
   private static final akk e = new akk("recipe_book/slot_uncraftable");
   private static final float f = 15.0F;
   private static final int m = 25;
   public static final int a = 30;
   private static final wu n = wu.c("gui.recipebook.moreRecipes");
   private cqs<?, ?> o;
   private avi p;
   private frc q;
   private float r;
   private float s;
   private int u;

   public frb() {
      super(0, 0, 25, 25, wt.a);
   }

   public void a(frc $$0, fqz $$1) {
      this.q = $$0;
      this.o = (cqs<?, ?>)$$1.d().s.cd;
      this.p = $$1.e();
      List<cyi<?>> $$2 = $$0.a(this.p.a(this.o));

      for (cyi<?> $$3 : $$2) {
         if (this.p.d($$3)) {
            $$1.a($$2);
            this.s = 15.0F;
            break;
         }
      }
   }

   public frc a() {
      return this.q;
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      if (!fnd.s()) {
         this.r += $$3;
      }

      akk $$4;
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
         $$0.c().a((float)(this.D() + 8), (float)(this.E() + 12), 0.0F);
         $$0.c().b($$9, $$9, 1.0F);
         $$0.c().a((float)(-(this.D() + 8)), (float)(-(this.E() + 12)), 0.0F);
         this.s -= $$3;
      }

      $$0.a($$4, this.D(), this.E(), this.g, this.h);
      List<cyi<?>> $$10 = this.f();
      this.u = aye.d(this.r / 30.0F) % $$10.size();
      cua $$11 = $$10.get(this.u).b().a(this.q.a());
      int $$12 = 4;
      if (this.q.f() && this.f().size() > 1) {
         $$0.a($$11, this.D() + $$12 + 1, this.E() + $$12 + 1, 0, 10);
         $$12--;
      }

      $$0.b($$11, this.D() + $$12, this.E() + $$12);
      if ($$8) {
         $$0.c().b();
      }
   }

   private List<cyi<?>> f() {
      List<cyi<?>> $$0 = this.q.b(true);
      if (!this.p.a(this.o)) {
         $$0.addAll(this.q.b(false));
      }

      return $$0;
   }

   public boolean b() {
      return this.f().size() == 1;
   }

   public cyi<?> c() {
      List<cyi<?>> $$0 = this.f();
      return $$0.get(this.u);
   }

   public List<wu> e() {
      cua $$0 = this.f().get(this.u).b().a(this.q.a());
      List<wu> $$1 = Lists.newArrayList(fnd.a(ffn.Q(), $$0));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$1.add(n);
      }

      return $$1;
   }

   @Override
   public void a(fli $$0) {
      cua $$1 = this.f().get(this.u).b().a(this.q.a());
      $$0.a(flh.a, wu.a("narration.recipe", $$1.w()));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$0.a(flh.d, wu.c("narration.button.usage.hovered"), wu.c("narration.recipe.usage.more"));
      } else {
         $$0.a(flh.d, wu.c("narration.button.usage.hovered"));
      }
   }

   @Override
   public int y() {
      return 25;
   }

   @Override
   protected boolean j(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }
}
