import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fio extends fnd {
   private static final akk a = new akk("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int q = 6;
   private static final int r = 130;
   private static final int s = 64;
   private static final int u = 250;
   private final fnd v;
   @Nullable
   private final akk w;
   private final wu x;
   private final List<fio.b> y;
   @Nullable
   private final Runnable z;
   private final int A;
   private final fld B = fld.d();

   fio(fnd $$0, int $$1, @Nullable akk $$2, wu $$3, wu $$4, List<fio.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.v = $$0;
      this.w = $$2;
      this.x = $$4;
      this.y = $$5;
      this.z = $$6;
      this.A = $$1 - 36;
   }

   @Override
   public void aG_() {
      super.aG_();
      this.v.o();
   }

   @Override
   protected void aO_() {
      this.v.b(this.l, this.m, this.n);
      this.B.a(12).c().b();
      this.B.a(new fig(this.k.f().a(n.r), this.o).d(this.A).b(true));
      if (this.w != null) {
         this.B.a(fhz.a(130, 64, this.w, 130, 64));
      }

      this.B.a(new fig(this.x, this.o).d(this.A).b(true));
      this.B.a(this.m());
      this.B.a($$1 -> {
         fhk var10000 = this.c($$1);
      });
      this.c();
   }

   private fld m() {
      int $$0 = 6 * (this.y.size() - 1);
      int $$1 = Math.min((this.A - $$0) / this.y.size(), 150);
      fld $$2 = fld.e();
      $$2.a(6);

      for (fio.b $$3 : this.y) {
         $$2.a(fhm.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.v.a(this.l, this.m, this.n);
      this.B.a();
      fkx.a(this.B, this.H());
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      this.v.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, ffn.a);
      this.b($$0);
      $$0.a(a, this.B.D() - 18, this.B.E() - 18, this.B.y() + 36, this.B.w() + 36);
   }

   @Override
   public wu i() {
      return wt.a(this.k, this.x);
   }

   @Override
   public void d() {
      if (this.z != null) {
         this.z.run();
      }

      this.l.a(this.v);
   }

   public static class a {
      private final fnd a;
      private final wu b;
      private wu c = wt.a;
      private int d = 250;
      @Nullable
      private akk e;
      private final List<fio.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fnd $$0, wu $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fio.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fio.a a(akk $$0) {
         this.e = $$0;
         return this;
      }

      public fio.a a(wu $$0) {
         this.c = $$0;
         return this;
      }

      public fio.a a(wu $$0, Consumer<fio> $$1) {
         this.f.add(new fio.b($$0, $$1));
         return this;
      }

      public fio.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fio a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fio(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(wu a, Consumer<fio> b) {
   }
}
