import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fem extends gwq {
   private static final Logger b = LogUtils.getLogger();
   public static final wz a = wz.c("mco.upload.select.world.title");
   private static final wz c = wz.c("selectWorld.unable_to_load");
   static final wz B = wz.c("selectWorld.world");
   private static final wz C = wz.c("mco.upload.hardcore").b(-65536);
   private static final wz D = wz.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final ffp F;
   private final fel G;
   private final long H;
   private final int I;
   fim J;
   List<erg> K = Lists.newArrayList();
   int L = -1;
   fem.b M;

   public fem(@Nullable ffp $$0, long $$1, int $$2, fel $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void C() {
      erf.a $$0 = this.l.m().b();
      this.K = this.l.m().a($$0).join().stream().filter(erg::v).collect(Collectors.toList());

      for (erg $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aT_() {
      this.M = this.c(new fem.b());

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.l.a(new feb(c, wz.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(fim.a(wz.c("mco.upload.button.name"), $$0 -> this.D()).a(this.m / 2 - 154, this.n - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(fim.a(wy.k, $$0 -> this.l.a(this.G)).a(this.m / 2 + 6, this.n - 32, 153, 20).a());
      this.a(new gwo(wz.c("mco.upload.select.world.subtitle"), this.m / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new gwo(wz.c("mco.upload.select.world.none"), this.m / 2, this.n / 2 - 20, -1));
      }
   }

   @Override
   public wz i() {
      return wy.a(this.n(), this.m());
   }

   private void D() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         erg $$0 = this.K.get(this.L);
         this.l.a(new fes(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.l.a(this.G);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static wz a(erg $$0) {
      return $$0.h().d();
   }

   static String b(erg $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends fji.a<fem.a> {
      private final erg b;
      private final String c;
      private final wz d;
      private final wz e;

      public a(final erg $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wz.a("mco.upload.entry.id", $$0.a(), fem.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fem.this.M.b(fem.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fhz $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fem.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fem.this.o, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fem.this.o, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fem.this.o, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public wz a() {
         wz $$0 = wy.b(wz.b(this.b.b()), wz.b(fem.b(this.b)), fem.a(this.b));
         return wz.a("narrator.select", $$0);
      }
   }

   class b extends gwp<fem.a> {
      public b() {
         super(fem.this.m, fem.this.n - 40 - fem.g(0), fem.g(0), 36);
      }

      public void a(erg $$0) {
         this.a((fem.a)(fem.this.new a($$0)));
      }

      @Override
      public int a() {
         return fem.this.K.size() * 36;
      }

      public void a(@Nullable fem.a $$0) {
         super.a($$0);
         fem.this.L = this.aK_().indexOf($$0);
         fem.this.J.j = fem.this.L >= 0 && fem.this.L < this.l() && !fem.this.K.get(fem.this.L).i();
      }
   }
}
