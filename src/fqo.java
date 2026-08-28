import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqo extends fqs {
   static final alh b = alh.b("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private static final alg<dfw> y = dgd.b;
   public static final xh a = xh.c("flat_world_preset.unknown");
   private final fpt z;
   private xh A;
   private xh B;
   private fqo.a C;
   private fkz D;
   fli E;
   eju F;

   public fqo(fpt $$0) {
      super(xh.c("createWorld.customize.presets.title"));
      this.z = $$0;
   }

   @Nullable
   private static ejr a(jq<dhy> $$0, String $$1, int $$2) {
      List<String> $$3 = Splitter.on('*').limit(2).splitToList($$1);
      int $$5;
      String $$4;
      if ($$3.size() == 2) {
         $$4 = $$3.get(1);

         try {
            $$5 = Math.max(Integer.parseInt($$3.get(0)), 0);
         } catch (NumberFormatException var11) {
            c.error("Error while parsing flat world string", var11);
            return null;
         }
      } else {
         $$4 = $$3.get(0);
         $$5 = 1;
      }

      int $$9 = Math.min($$2 + $$5, dyz.c);
      int $$10 = $$9 - $$2;

      Optional<jp.c<dhy>> $$11;
      try {
         $$11 = $$0.a(alg.a(ly.f, alh.a($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new ejr($$10, $$11.get().a());
      }
   }

   private static List<ejr> a(jq<dhy> $$0, String $$1) {
      List<ejr> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         ejr $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static eju a(jq<dhy> $$0, jq<dfw> $$1, jq<elx> $$2, jq<ekv> $$3, String $$4, eju $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return eju.a($$1, $$2, $$3);
      } else {
         List<ejr> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return eju.a($$1, $$2, $$3);
         } else {
            jp.c<dfw> $$8 = $$1.b(y);
            jp<dfw> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(alh.c($$10)).map($$0x -> alg.a(ly.aG, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(eju $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(alg::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aS_() {
      this.A = xh.c("createWorld.customize.presets.share");
      this.B = xh.c("createWorld.customize.presets.list");
      this.E = new fli(this.p, 50, 40, this.n - 100, 20, this.A);
      this.E.f(1230);
      fvx $$0 = this.z.a.m().k();
      kd $$1 = $$0.a();
      cra $$2 = $$0.h().b();
      jq<dfw> $$3 = $$1.e(ly.aG);
      jq<elx> $$4 = $$1.e(ly.aU);
      jq<ekv> $$5 = $$1.e(ly.aR);
      jq<dhy> $$6 = $$1.e(ly.f).a($$2);
      this.E.a(a(this.z.l()));
      this.F = this.z.l();
      this.d(this.E);
      this.C = this.c(new fqo.a($$1, $$2));
      this.D = this.c(fkz.a(xh.c("createWorld.customize.presets.select"), $$4x -> {
         eju $$5x = a($$6, $$3, $$4, $$5, this.E.a(), this.F);
         this.z.a($$5x);
         this.m.a(this.z);
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(fkz.a(xg.e, $$0x -> this.m.a(this.z)).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.c(this.C.h() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.C.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(fja $$0, int $$1, int $$2) {
      String $$3 = this.E.a();
      this.b($$0, $$1, $$2);
      this.E.a($$3);
   }

   @Override
   public void d() {
      this.m.a(this.z);
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 400.0F);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      $$0.b(this.p, this.A, 51, 30, 10526880);
      $$0.b(this.p, this.B, 51, 68, 10526880);
      $$0.c().b();
      this.E.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void c(boolean $$0) {
      this.D.j = $$0 || this.E.a().length() > 1;
   }

   class a extends flv<fqo.a.a> {
      public a(final kd $$0, final cra $$1) {
         super(fqo.this.m, fqo.this.n, fqo.this.o - 117, 80, 24);

         for (jp<ejs> $$2 : $$0.e(ly.aO).c(axe.a)) {
            Set<dhy> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               fqo.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new fqo.a.a($$2));
            }
         }
      }

      public void a(@Nullable fqo.a.a $$0) {
         super.a($$0);
         fqo.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (fpc.a($$0) && this.h() != null) {
               this.h().b();
            }

            return false;
         }
      }

      public class a extends flv.a<fqo.a.a> {
         private static final alh b = alh.b("textures/gui/container/stats_icons.png");
         private final ejs c;
         private final xh d;

         public a(final jp<ejs> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> xh.c($$0x.a().h("flat_world_preset"))).orElse(fqo.a);
         }

         @Override
         public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(fqo.this.p, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return super.a($$0, $$1, $$2);
         }

         void b() {
            a.this.a(this);
            fqo.this.F = this.c.b();
            fqo.this.E.a(fqo.a(fqo.this.F));
            fqo.this.E.b(false);
         }

         private void a(fkm $$0, int $$1, int $$2, cvt $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new cvx($$3), $$1 + 2, $$2 + 2);
         }

         private void a(fkm $$0, int $$1, int $$2) {
            $$0.a(gig::B, fqo.b, $$1, $$2, 18, 18);
         }

         @Override
         public xh a() {
            return xh.a("narrator.select", this.d);
         }
      }
   }
}
