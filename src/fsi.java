import com.google.common.collect.Lists;
import java.util.List;

public class fsi extends fil {
   private static final akt b = new akt("recipe_book/slot_many_craftable");
   private static final akt c = new akt("recipe_book/slot_craftable");
   private static final akt d = new akt("recipe_book/slot_many_uncraftable");
   private static final akt e = new akt("recipe_book/slot_uncraftable");
   private static final float f = 15.0F;
   private static final int m = 25;
   public static final int a = 30;
   private static final xe n = xe.c("gui.recipebook.moreRecipes");
   private cqw<?> o;
   private avs p;
   private fsj q;
   private float r;
   private float s;
   private int u;

   public fsi() {
      super(0, 0, 25, 25, xd.a);
   }

   public void a(fsj $$0, fsg $$1) {
      this.q = $$0;
      this.o = (cqw<?>)$$1.d().s.cq;
      this.p = $$1.e();
      List<czc<?>> $$2 = $$0.a(this.p.a(this.o));

      for (czc<?> $$3 : $$2) {
         if (this.p.d($$3)) {
            $$1.a($$2);
            this.s = 15.0F;
            break;
         }
      }
   }

   public fsj a() {
      return this.q;
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      if (!fon.r()) {
         this.r += $$3;
      }

      akt $$4;
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
      List<czc<?>> $$10 = this.f();
      this.u = aym.d(this.r / 30.0F) % $$10.size();
      cuh $$11 = $$10.get(this.u).b().a(this.q.a());
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

   private List<czc<?>> f() {
      List<czc<?>> $$0 = this.q.b(true);
      if (!this.p.a(this.o)) {
         $$0.addAll(this.q.b(false));
      }

      return $$0;
   }

   public boolean b() {
      return this.f().size() == 1;
   }

   public czc<?> d() {
      List<czc<?>> $$0 = this.f();
      return $$0.get(this.u);
   }

   public List<xe> e() {
      cuh $$0 = this.f().get(this.u).b().a(this.q.a());
      List<xe> $$1 = Lists.newArrayList(fon.a(fgj.Q(), $$0));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$1.add(n);
      }

      return $$1;
   }

   @Override
   public void a(fmj $$0) {
      cuh $$1 = this.f().get(this.u).b().a(this.q.a());
      $$0.a(fmi.a, xe.a("narration.recipe", $$1.w()));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$0.a(fmi.d, xe.c("narration.button.usage.hovered"), xe.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fmi.d, xe.c("narration.button.usage.hovered"));
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
