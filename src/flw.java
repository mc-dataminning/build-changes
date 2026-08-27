import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;

public class flw extends fhh {
   private static final vu a = vu.c("selectWorld.experimental.title");
   private static final vu b = vu.c("selectWorld.experimental.message");
   private static final vu c = vu.c("selectWorld.experimental.details");
   private static final int k = 10;
   private static final int l = 100;
   private final BooleanConsumer m;
   final Collection<arw> n;
   private final feu o = new feu().a(10).b(20);

   public flw(Collection<arw> $$0, BooleanConsumer $$1) {
      super(a);
      this.n = $$0;
      this.m = $$1;
   }

   @Override
   public vu i() {
      return vt.a(super.i(), b);
   }

   @Override
   protected void aO_() {
      super.aO_();
      feu.b $$0 = this.o.d(2);
      fey $$1 = $$0.b().b();
      $$0.a(new fcp(this.e, this.i), 2, $$1);
      fcc $$2 = $$0.a(new fcc(b, this.i).b(true), 2, $$1);
      $$2.c(310);
      $$0.a(fbi.a(c, $$0x -> this.f.a(new flw.a())).a(100).a(), 2, $$1);
      $$0.a(fbi.a(vt.i, $$0x -> this.m.accept(true)).a());
      $$0.a(fbi.a(vt.k, $$0x -> this.m.accept(false)).a());
      this.o.a($$1x -> {
         fbg var10000 = this.c($$1x);
      });
      this.o.a();
      this.c();
   }

   @Override
   protected void c() {
      fet.a(this.o, 0, 0, this.g, this.h, 0.5F, 0.5F);
   }

   @Override
   public void d() {
      this.m.accept(false);
   }

   class a extends fhh {
      private flw.a.a b;

      a() {
         super(vu.c("selectWorld.experimental.details.title"));
      }

      @Override
      public void d() {
         this.f.a(flw.this);
      }

      @Override
      protected void aO_() {
         super.aO_();
         this.c(fbi.a(vt.k, $$0 -> this.d()).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
         this.b = this.c(new flw.a.a(this.f, flw.this.n));
      }

      @Override
      public void a(fav $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      }

      class a extends fce<flw.a.b> {
         public a(ezi $$0, Collection<arw> $$1) {
            super($$0, a.this.g, a.this.h - 96, 32, (9 + 2) * 3);

            for (arw $$2 : $$1) {
               String $$3 = clj.a(clj.g, $$2.e());
               if (!$$3.isEmpty()) {
                  vu $$4 = vx.a($$2.b().f(), wr.a.a(true));
                  vu $$5 = vu.a("selectWorld.experimental.details.entry", $$3);
                  this.b(a.this.new b($$4, $$5, fcb.a(a.this.i, $$5, this.b())));
               }
            }
         }

         @Override
         public int b() {
            return this.g * 3 / 4;
         }
      }

      class b extends fce.a<flw.a.b> {
         private final vu b;
         private final vu c;
         private final fcb d;

         b(vu $$0, vu $$1, fcb $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
         }

         @Override
         public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(a.this.f.h, this.b, $$3, $$2, 16777215);
            this.d.b($$0, $$3, $$2 + 12, 9, 16777215);
         }

         @Override
         public vu a() {
            return vu.a("narrator.select", vt.a(this.b, this.c));
         }
      }
   }
}
