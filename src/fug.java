import com.google.common.collect.Lists;
import java.util.List;

public class fug extends fkm {
   private static final ale a = ale.b("recipe_book/slot_many_craftable");
   private static final ale b = ale.b("recipe_book/slot_craftable");
   private static final ale c = ale.b("recipe_book/slot_many_uncraftable");
   private static final ale d = ale.b("recipe_book/slot_uncraftable");
   private static final float e = 15.0F;
   private static final int f = 25;
   private static final xe m = xe.c("gui.recipebook.moreRecipes");
   private fuh n;
   private List<dam<?>> o = List.of();
   private final fuk p;
   private float q;

   public fug(fuk $$0) {
      super(0, 0, 25, 25, xd.a);
      this.p = $$0;
   }

   public void a(fuh $$0, boolean $$1, fue $$2) {
      this.n = $$0;
      this.o = $$0.a($$1 ? fuh.a.b : fuh.a.a);

      for (dam<?> $$3 : this.o) {
         if ($$2.d().d($$3)) {
            $$2.a(this.o);
            this.q = 15.0F;
            break;
         }
      }
   }

   public fuh a() {
      return this.n;
   }

   @Override
   public void b(fkb $$0, int $$1, int $$2, float $$3) {
      ale $$4;
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

      $$0.a(ghv::B, $$4, this.D(), this.E(), this.g, this.h);
      cvs $$10 = this.c().b().a(this.n.a());
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

   public dam<?> c() {
      int $$0 = this.p.currentIndex() % this.o.size();
      return this.o.get($$0);
   }

   public List<xe> e() {
      cvs $$0 = this.c().b().a(this.n.a());
      List<xe> $$1 = Lists.newArrayList(fqh.a(fip.Q(), $$0));
      if (this.f()) {
         $$1.add(m);
      }

      return $$1;
   }

   @Override
   public void a(fol $$0) {
      cvs $$1 = this.c().b().a(this.n.a());
      $$0.a(fok.a, xe.a("narration.recipe", $$1.y()));
      if (this.f()) {
         $$0.a(fok.d, xe.c("narration.button.usage.hovered"), xe.c("narration.recipe.usage.more"));
      } else {
         $$0.a(fok.d, xe.c("narration.button.usage.hovered"));
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
