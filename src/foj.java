import com.google.common.collect.Lists;
import java.util.List;

public class foj extends fes {
   private static final akf b = new akf("recipe_book/slot_many_craftable");
   private static final akf c = new akf("recipe_book/slot_craftable");
   private static final akf d = new akf("recipe_book/slot_many_uncraftable");
   private static final akf e = new akf("recipe_book/slot_uncraftable");
   private static final float f = 15.0F;
   private static final int m = 25;
   public static final int a = 30;
   private static final ws n = ws.c("gui.recipebook.moreRecipes");
   private cov<?> o;
   private avc p;
   private fok q;
   private float r;
   private float s;
   private int u;

   public foj() {
      super(0, 0, 25, 25, wr.a);
   }

   public void a(fok $$0, foh $$1) {
      this.q = $$0;
      this.o = (cov<?>)$$1.d().s.cc;
      this.p = $$1.e();
      List<cwi<?>> $$2 = $$0.a(this.p.a(this.o));

      for (cwi<?> $$3 : $$2) {
         if (this.p.d($$3)) {
            $$1.a($$2);
            this.s = 15.0F;
            break;
         }
      }
   }

   public fok a() {
      return this.q;
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
      if (!fkt.r()) {
         this.r += $$3;
      }

      akf $$4;
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
      List<cwi<?>> $$10 = this.f();
      this.u = axw.d(this.r / 30.0F) % $$10.size();
      csd $$11 = $$10.get(this.u).b().a(this.q.a());
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

   private List<cwi<?>> f() {
      List<cwi<?>> $$0 = this.q.b(true);
      if (!this.p.a(this.o)) {
         $$0.addAll(this.q.b(false));
      }

      return $$0;
   }

   public boolean b() {
      return this.f().size() == 1;
   }

   public cwi<?> d() {
      List<cwi<?>> $$0 = this.f();
      return $$0.get(this.u);
   }

   public List<ws> e() {
      csd $$0 = this.f().get(this.u).b().a(this.q.a());
      List<ws> $$1 = Lists.newArrayList(fkt.a(fcu.Q(), $$0));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$1.add(n);
      }

      return $$1;
   }

   @Override
   public void a(fiq $$0) {
      csd $$1 = this.f().get(this.u).b().a(this.q.a());
      $$0.a(fip.a, ws.a("narration.recipe", $$1.w()));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$0.a(fip.d, ws.c("narration.button.usage.hovered"), ws.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fip.d, ws.c("narration.button.usage.hovered"));
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
