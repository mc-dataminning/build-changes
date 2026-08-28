import com.google.common.collect.Lists;
import java.util.List;

public class fuc extends fki {
   private static final alc a = alc.b("recipe_book/slot_many_craftable");
   private static final alc b = alc.b("recipe_book/slot_craftable");
   private static final alc c = alc.b("recipe_book/slot_many_uncraftable");
   private static final alc d = alc.b("recipe_book/slot_uncraftable");
   private static final float e = 15.0F;
   private static final int f = 25;
   private static final xd m = xd.c("gui.recipebook.moreRecipes");
   private fud n;
   private List<daj<?>> o = List.of();
   private final fug p;
   private float q;

   public fuc(fug $$0) {
      super(0, 0, 25, 25, xc.a);
      this.p = $$0;
   }

   public void a(fud $$0, boolean $$1, fua $$2) {
      this.n = $$0;
      this.o = $$0.a($$1 ? fud.a.b : fud.a.a);

      for (daj<?> $$3 : this.o) {
         if ($$2.d().d($$3)) {
            $$2.a(this.o);
            this.q = 15.0F;
            break;
         }
      }
   }

   public fud a() {
      return this.n;
   }

   @Override
   public void b(fjx $$0, int $$1, int $$2, float $$3) {
      alc $$4;
      if (this.n.c()) {
         if (this.f()) {
            $$4 = a;
         } else {
            $$4 = b;
         }
      } else if (this.f()) {
         $$4 = c;
      } else {
         $$4 = d;
      }

      boolean $$8 = this.q > 0.0F;
      if ($$8) {
         float $$9 = 1.0F + 0.1F * (float)Math.sin((double)(this.q / 15.0F * (float) Math.PI));
         $$0.c().a();
         $$0.c().a((float)(this.D() + 8), (float)(this.E() + 12), 0.0F);
         $$0.c().b($$9, $$9, 1.0F);
         $$0.c().a((float)(-(this.D() + 8)), (float)(-(this.E() + 12)), 0.0F);
         this.q -= $$3;
      }

      $$0.a(ghq::B, $$4, this.D(), this.E(), this.g, this.h);
      cvp $$10 = this.c().b().a(this.n.a());
      int $$11 = 4;
      if (this.n.f() && this.f()) {
         $$0.a($$10, this.D() + $$11 + 1, this.E() + $$11 + 1, 0, 10);
         $$11--;
      }

      $$0.b($$10, this.D() + $$11, this.E() + $$11);
      if ($$8) {
         $$0.c().b();
      }
   }

   private boolean f() {
      return this.o.size() > 1;
   }

   public boolean b() {
      return this.o.size() == 1;
   }

   public daj<?> c() {
      int $$0 = this.p.currentIndex() % this.o.size();
      return this.o.get($$0);
   }

   public List<xd> e() {
      cvp $$0 = this.c().b().a(this.n.a());
      List<xd> $$1 = Lists.newArrayList(fqd.a(fil.Q(), $$0));
      if (this.f()) {
         $$1.add(m);
      }

      return $$1;
   }

   @Override
   public void a(foh $$0) {
      cvp $$1 = this.c().b().a(this.n.a());
      $$0.a(fog.a, xd.a("narration.recipe", $$1.y()));
      if (this.f()) {
         $$0.a(fog.d, xd.c("narration.button.usage.hovered"), xd.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fog.d, xd.c("narration.button.usage.hovered"));
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
