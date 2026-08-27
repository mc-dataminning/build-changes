import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class fcs extends eye {
   private static final tl a = tl.c("selectWorld.experimental.title");
   private static final tl b = tl.c("selectWorld.experimental.message");
   private static final tl c = tl.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<ane> n;
   private final evt o = new evt().a(10).b(20);

   public fcs(Collection<ane> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public tl g() {
      return tk.a(super.g(), b);
   }

   @Override
   protected void aH_() {
      super.aH_();
      evt.b $$0 = this.o.d(2);
      evx $$1 = $$0.b().b();
      $$0.a(new etr(this.e, this.i), 2, $$1);
      ete $$2 = $$0.a(new ete(b, this.i).b(true), 2, $$1);
      $$2.j(310);
      $$0.a(esk.a(c, $$0x -> this.f.a(new fcs.a())).a(100).a(), 2, $$1);
      $$0.a(esk.a(tk.i, $$0x -> this.m.accept(true)).a());
      $$0.a(esk.a(tk.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         esi var10000 = this.d($$1x);
      });
      this.o.a();
      this.b();
   }

   @Override
   protected void b() {
      evs.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void az_() {
      this.m.accept(false);
   }

   class a extends eye {
      private fcs.a.a b;

      a() {
         super(tl.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void az_() {
         this.f.a(fcs.this);
      }

      @Override
      protected void aH_() {
         super.aH_();
         this.d(esk.a(tk.k, $$0 -> this.az_()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = new fcs.a.a(this.f, fcs.this.n);
         this.e(this.b);
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         this.b.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends etg<fcs.a.b> {
         public a(eqp $$0, Collection<ane> $$1) {
            super($$0, a.this.g, a.this.h, 32, a.this.h - 64, (9 + 2) * 3);

            for (ane $$2 : $$1) {
               String $$3 = cek.a(cek.f, $$2.d());
               if (!$$3.isEmpty()) {
                  tl $$4 = to.a($$2.a().f(), ui.a.a(true));
                  tl $$5 = tl.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, etd.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.e * 3 / 4;
         }
      }

      class b extends etg.a<fcs.a.b> {
         private final tl b;
         private final tl c;
         private final etd d;

         b(tl $$0, tl $$1, etd $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public tl a() {
            return tl.a("narrator.select", tk.a(this.b, this.c));
         }
      }
   }
}
