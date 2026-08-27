import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjy extends fld {
   static final akh b = new akh("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int r = 1;
   private static final int s = 1;
   private static final int u = 2;
   private static final int v = 2;
   protected final fpt a;
   private final Consumer<ees> w;
   ees x;
   private wu y;
   private wu z;
   private fjy.a A;
   private ffe B;

   public fjy(fpt $$0, Consumer<ees> $$1, ees $$2) {
      super(wu.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   public ees l() {
      return this.x;
   }

   public void a(ees $$0) {
      this.x = $$0;
   }

   @Override
   protected void aM_() {
      this.y = wu.c("createWorld.customize.flat.tile");
      this.z = wu.c("createWorld.customize.flat.height");
      this.A = this.c(new fjy.a());
      this.B = this.c(ffe.a(wu.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.C()) {
            List<eep> $$1 = this.x.e();
            int $$2 = this.A.aE_().indexOf(this.A.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.A.a($$1.isEmpty() ? null : this.A.aE_().get(Math.min($$2, $$1.size() - 1)));
            this.x.g();
            this.A.d();
            this.m();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(ffe.a(wu.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new fkz(this));
         this.x.g();
         this.m();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(ffe.a(wt.d, $$0 -> {
         this.w.accept(this.x);
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(ffe.a(wt.e, $$0 -> {
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.x.g();
      this.m();
   }

   void m() {
      this.B.j = this.C();
   }

   private boolean C() {
      return this.A.h() != null;
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.y, $$4, 32, 16777215);
      $$0.b(this.p, this.z, $$4 + 2 + 213 - this.p.a(this.z), 32, 16777215);
   }

   class a extends fga<fjy.a.a> {
      public a() {
         super(fjy.this.m, fjy.this.n, fjy.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < fjy.this.x.e().size(); $$0++) {
            this.b(new fjy.a.a());
         }
      }

      public void a(@Nullable fjy.a.a $$0) {
         super.a($$0);
         fjy.this.m();
      }

      public void d() {
         int $$0 = this.aE_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fjy.this.x.e().size(); $$1++) {
            this.b(new fjy.a.a());
         }

         List<fjy.a.a> $$2 = this.aE_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fga.a<fjy.a.a> {
         @Override
         public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eep $$10 = fjy.this.x.e().get(fjy.this.x.e().size() - $$1 - 1);
            dqh $$11 = $$10.b();
            csz $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fjy.this.p, $$12.w(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            wu $$13;
            if ($$1 == 0) {
               $$13 = wu.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fjy.this.x.e().size() - 1) {
               $$13 = wu.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = wu.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fjy.this.p, $$13, $$3 + 2 + 213 - fjy.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private csz a(dqh $$0) {
            csu $$1 = $$0.b().q();
            if ($$1 == ctc.a) {
               if ($$0.a(ddg.G)) {
                  $$1 = ctc.qz;
               } else if ($$0.a(ddg.H)) {
                  $$1 = ctc.qA;
               }
            }

            return new csz($$1);
         }

         @Override
         public wu a() {
            eep $$0 = fjy.this.x.e().get(fjy.this.x.e().size() - a.this.aE_().indexOf(this) - 1);
            csz $$1 = this.a($$0.b());
            return (wu)(!$$1.d() ? wu.a("narrator.select", $$1.w()) : wt.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fer $$0, int $$1, int $$2, csz $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.d()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fer $$0, int $$1, int $$2) {
            $$0.a(fjy.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
