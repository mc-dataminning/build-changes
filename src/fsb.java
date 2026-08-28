import com.google.common.collect.Lists;
import java.util.List;

public class fsb extends fii {
   private static final akr b = akr.b("recipe_book/slot_many_craftable");
   private static final akr c = akr.b("recipe_book/slot_craftable");
   private static final akr d = akr.b("recipe_book/slot_many_uncraftable");
   private static final akr e = akr.b("recipe_book/slot_uncraftable");
   private static final float f = 15.0F;
   private static final int m = 25;
   public static final int a = 30;
   private static final wz n = wz.c("gui.recipebook.moreRecipes");
   private cri<?, ?> o;
   private avs p;
   private fsc q;
   private float r;
   private float s;
   private int u;

   public fsb() {
      super(0, 0, 25, 25, wy.a);
   }

   public void a(fsc $$0, frz $$1) {
      this.q = $$0;
      this.o = (cri<?, ?>)$$1.d().s.cd;
      this.p = $$1.e();
      List<czb<?>> $$2 = $$0.a(this.p.a(this.o));

      for (czb<?> $$3 : $$2) {
         if (this.p.d($$3)) {
            $$1.a($$2);
            this.s = 15.0F;
            break;
         }
      }
   }

   public fsc a() {
      return this.q;
   }

   @Override
   public void b(fhx $$0, int $$1, int $$2, float $$3) {
      if (!fob.r()) {
         this.r += $$3;
      }

      akr $$4;
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
      List<czb<?>> $$10 = this.f();
      this.u = ayo.d(this.r / 30.0F) % $$10.size();
      cuq $$11 = $$10.get(this.u).b().a(this.q.a());
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

   private List<czb<?>> f() {
      List<czb<?>> $$0 = this.q.b(true);
      if (!this.p.a(this.o)) {
         $$0.addAll(this.q.b(false));
      }

      return $$0;
   }

   public boolean b() {
      return this.f().size() == 1;
   }

   public czb<?> c() {
      List<czb<?>> $$0 = this.f();
      return $$0.get(this.u);
   }

   public List<wz> e() {
      cuq $$0 = this.f().get(this.u).b().a(this.q.a());
      List<wz> $$1 = Lists.newArrayList(fob.a(fgm.Q(), $$0));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$1.add(n);
      }

      return $$1;
   }

   @Override
   public void a(fmg $$0) {
      cuq $$1 = this.f().get(this.u).b().a(this.q.a());
      $$0.a(fmf.a, wz.a("narration.recipe", $$1.w()));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$0.a(fmf.d, wz.c("narration.button.usage.hovered"), wz.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fmf.d, wz.c("narration.button.usage.hovered"));
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
