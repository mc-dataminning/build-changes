import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eul extends ezd {
   private static final afw a = new afw("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int k = 6;
   private static final int l = 130;
   private static final int m = 64;
   private static final int n = 250;
   private final ezd o;
   @Nullable
   private final afw p;
   private final ui q;
   private final List<eul.b> s;
   @Nullable
   private final Runnable t;
   private final int u;
   private final ewx v = ewx.d();

   eul(ezd $$0, int $$1, @Nullable afw $$2, ui $$3, ui $$4, List<eul.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.o = $$0;
      this.p = $$2;
      this.q = $$4;
      this.s = $$5;
      this.t = $$6;
      this.u = $$1 - 36;
   }

   @Override
   protected void aM_() {
      this.v.a(12).c().b();
      this.v.a(new eud(this.e.f().a(n.r), this.i).j(this.u).b(true));
      if (this.p != null) {
         this.v.a(etw.a(130, 64, this.p, 130, 64));
      }

      this.v.a(new eud(this.q, this.i).j(this.u).b(true));
      this.v.a(this.l());
      this.v.a($$1 -> {
         eth var10000 = this.d($$1);
      });
      this.c();
   }

   private ewx l() {
      int $$0 = 6 * (this.s.size() - 1);
      int $$1 = Math.min((this.u - $$0) / this.s.size(), 150);
      ewx $$2 = ewx.e();
      $$2.a(6);

      for (eul.b $$3 : this.s) {
         $$2.a(etj.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.o.a(this.f, this.g, this.h);
      this.v.a();
      ewr.a(this.v, this.s());
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      this.o.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, ero.a);
      this.a($$0);
      $$0.a(a, this.v.p() - 18, this.v.r() - 18, this.v.k() + 36, this.v.i() + 36);
   }

   @Override
   public ui h() {
      return uh.a(this.e, this.q);
   }

   @Override
   public void aC_() {
      if (this.t != null) {
         this.t.run();
      }

      this.f.a(this.o);
   }

   public static class a {
      private final ezd a;
      private final ui b;
      private ui c = uh.a;
      private int d = 250;
      @Nullable
      private afw e;
      private final List<eul.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(ezd $$0, ui $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public eul.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eul.a a(afw $$0) {
         this.e = $$0;
         return this;
      }

      public eul.a a(ui $$0) {
         this.c = $$0;
         return this;
      }

      public eul.a a(ui $$0, Consumer<eul> $$1) {
         this.f.add(new eul.b($$0, $$1));
         return this;
      }

      public eul.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public eul a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new eul(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(ui a, Consumer<eul> b) {
   }
}
