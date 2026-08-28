import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fek extends gwo {
   private static final Logger b = LogUtils.getLogger();
   public static final wz a = wz.c("mco.upload.select.world.title");
   private static final wz c = wz.c("selectWorld.unable_to_load");
   static final wz B = wz.c("selectWorld.world");
   private static final wz C = wz.c("mco.upload.hardcore").b(-65536);
   private static final wz D = wz.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final ffn F;
   private final fej G;
   private final long H;
   private final int I;
   fik J;
   List<ere> K = Lists.newArrayList();
   int L = -1;
   fek.b M;

   public fek(@Nullable ffn $$0, long $$1, int $$2, fej $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void C() {
      erd.a $$0 = this.l.m().b();
      this.K = this.l.m().a($$0).join().stream().filter(ere::v).collect(Collectors.toList());

      for (ere $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aT_() {
      this.M = this.c(new fek.b());

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.l.a(new fdz(c, wz.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(fik.a(wz.c("mco.upload.button.name"), $$0 -> this.D()).a(this.m / 2 - 154, this.n - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(fik.a(wy.k, $$0 -> this.l.a(this.G)).a(this.m / 2 + 6, this.n - 32, 153, 20).a());
      this.a(new gwm(wz.c("mco.upload.select.world.subtitle"), this.m / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new gwm(wz.c("mco.upload.select.world.none"), this.m / 2, this.n / 2 - 20, -1));
      }
   }

   @Override
   public wz i() {
      return wy.a(this.n(), this.m());
   }

   private void D() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         ere $$0 = this.K.get(this.L);
         this.l.a(new feq(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
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

   static wz a(ere $$0) {
      return $$0.h().d();
   }

   static String b(ere $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends fjg.a<fek.a> {
      private final ere b;
      private final String c;
      private final wz d;
      private final wz e;

      public a(final ere $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wz.a("mco.upload.entry.id", $$0.a(), fek.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fek.this.M.b(fek.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fhx $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fek.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fek.this.o, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fek.this.o, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fek.this.o, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public wz a() {
         wz $$0 = wy.b(wz.b(this.b.b()), wz.b(fek.b(this.b)), fek.a(this.b));
         return wz.a("narrator.select", $$0);
      }
   }

   class b extends gwn<fek.a> {
      public b() {
         super(fek.this.m, fek.this.n - 40 - fek.g(0), fek.g(0), 36);
      }

      public void a(ere $$0) {
         this.a((fek.a)(fek.this.new a($$0)));
      }

      @Override
      public int a() {
         return fek.this.K.size() * 36;
      }

      public void a(@Nullable fek.a $$0) {
         super.a($$0);
         fek.this.L = this.aK_().indexOf($$0);
         fek.this.J.j = fek.this.L >= 0 && fek.this.L < this.l() && !fek.this.K.get(fek.this.L).i();
      }
   }
}
