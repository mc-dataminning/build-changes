import com.google.common.collect.Lists;
import java.util.List;

public class fbp extends ese {
   private static final aer b = new aer("recipe_book/slot_many_craftable");
   private static final aer c = new aer("recipe_book/slot_craftable");
   private static final aer d = new aer("recipe_book/slot_many_uncraftable");
   private static final aer e = new aer("recipe_book/slot_uncraftable");
   private static final float l = 15.0F;
   private static final int m = 25;
   public static final int a = 30;
   private static final tf n = tf.c("gui.recipebook.moreRecipes");
   private cfn<?> o;
   private aoz p;
   private fbq q;
   private float s;
   private float t;
   private int u;

   public fbp() {
      super(0, 0, 25, 25, te.a);
   }

   public void a(fbq $$0, fbn $$1) {
      this.q = $$0;
      this.o = (cfn<?>)$$1.d().s.bQ;
      this.p = $$1.e();
      List<cma<?>> $$2 = $$0.a(this.p.a(this.o));

      for (cma<?> $$3 : $$2) {
         if (this.p.d($$3)) {
            $$1.a($$2);
            this.t = 15.0F;
            break;
         }
      }
   }

   public fbq a() {
      return this.q;
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      if (!eya.p()) {
         this.s += $$3;
      }

      aer $$4;
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
         $$0.c().a((float)(this.r() + 8), (float)(this.t() + 12), 0.0F);
         $$0.c().b($$9, $$9, 1.0F);
         $$0.c().a((float)(-(this.r() + 8)), (float)(-(this.t() + 12)), 0.0F);
         this.t -= $$3;
      }

      $$0.a($$4, this.r(), this.t(), this.f, this.g);
      List<cma<?>> $$10 = this.g();
      this.u = arp.d(this.s / 30.0F) % $$10.size();
      cix $$11 = $$10.get(this.u).a(this.q.a());
      int $$12 = 4;
      if (this.q.f() && this.g().size() > 1) {
         $$0.a($$11, this.r() + $$12 + 1, this.t() + $$12 + 1, 0, 10);
         $$12--;
      }

      $$0.b($$11, this.r() + $$12, this.t() + $$12);
      if ($$8) {
         $$0.c().b();
      }
   }

   private List<cma<?>> g() {
      List<cma<?>> $$0 = this.q.b(true);
      if (!this.p.a(this.o)) {
         $$0.addAll(this.q.b(false));
      }

      return $$0;
   }

   public boolean b() {
      return this.g().size() == 1;
   }

   public cma<?> e() {
      List<cma<?>> $$0 = this.g();
      return $$0.get(this.u);
   }

   public List<tf> f() {
      cix $$0 = this.g().get(this.u).a(this.q.a());
      List<tf> $$1 = Lists.newArrayList(eya.a(eql.O(), $$0));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$1.add(n);
      }

      return $$1;
   }

   @Override
   public void a(evy $$0) {
      cix $$1 = this.g().get(this.u).a(this.q.a());
      $$0.a(evx.a, tf.a("narration.recipe", $$1.y()));
      if (this.q.a(this.p.a(this.o)).size() > 1) {
         $$0.a(evx.d, tf.c("narration.button.usage.hovered"), tf.c("narration.recipe.usage.more"));
      } else {
         $$0.a(evx.d, tf.c("narration.button.usage.hovered"));
      }
   }

   @Override
   public int l() {
      return 25;
   }

   @Override
   protected boolean c(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }
}
