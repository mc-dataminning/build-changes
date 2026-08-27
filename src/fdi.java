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

public class fdi extends fdm {
   static final ahh b = new ahh("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int k = 18;
   private static final int l = 20;
   private static final int m = 1;
   private static final int n = 1;
   private static final int o = 2;
   private static final int p = 2;
   private static final ahg<cuw> q = cvd.b;
   public static final vg a = vg.c("flat_world_preset.unknown");
   private final fci r;
   private vg t;
   private vg u;
   private fdi.a v;
   private exr w;
   eya x;
   dxr y;

   public fdi(fci $$0) {
      super(vg.c("createWorld.customize.presets.title"));
      this.r = $$0;
   }

   @Nullable
   private static dxo a(ii<cwy> $$0, String $$1, int $$2) {
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

      int $$9 = Math.min($$2 + $$5, dmy.c);
      int $$10 = $$9 - $$2;

      Optional<ih.c<cwy>> $$11;
      try {
         $$11 = $$0.a(ahg.a(ke.f, new ahh($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new dxo($$10, $$11.get().a());
      }
   }

   private static List<dxo> a(ii<cwy> $$0, String $$1) {
      List<dxo> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         dxo $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static dxr a(ii<cwy> $$0, ii<cuw> $$1, ii<dzu> $$2, ii<dys> $$3, String $$4, dxr $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return dxr.a($$1, $$2, $$3);
      } else {
         List<dxo> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return dxr.a($$1, $$2, $$3);
         } else {
            ih.c<cuw> $$8 = $$1.b(q);
            ih<cuw> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(ahh.a($$10)).map($$0x -> ahg.a(ke.at, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(dxr $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(ahg::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aP_() {
      this.t = vg.c("createWorld.customize.presets.share");
      this.u = vg.c("createWorld.customize.presets.list");
      this.x = new eya(this.i, 50, 40, this.g - 100, 20, this.t);
      this.x.f(1230);
      fik $$0 = this.r.a.o().k();
      iu $$1 = $$0.a();
      cia $$2 = $$0.g().b();
      ii<cuw> $$3 = $$1.b(ke.at);
      ii<dzu> $$4 = $$1.b(ke.aF);
      ii<dys> $$5 = $$1.b(ke.aC);
      ii<cwy> $$6 = $$1.b(ke.f).a($$2);
      this.x.a(a(this.r.n()));
      this.y = this.r.n();
      this.e(this.x);
      this.v = this.d(new fdi.a($$1, $$2));
      this.w = this.d(exr.a(vg.c("createWorld.customize.presets.select"), $$4x -> {
         dxr $$5x = a($$6, $$3, $$4, $$5, this.x.a(), this.y);
         this.r.a($$5x);
         this.f.a(this.r);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(exr.a(vf.e, $$0x -> this.f.a(this.r)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.c(this.v.i() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.v.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(evr $$0, int $$1, int $$2) {
      String $$3 = this.x.a();
      this.b($$0, $$1, $$2);
      this.x.a($$3);
   }

   @Override
   public void d() {
      this.f.a(this.r);
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 400.0F);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.b(this.i, this.t, 51, 30, 10526880);
      $$0.b(this.i, this.u, 51, 70, 10526880);
      $$0.c().b();
      this.x.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void c(boolean $$0) {
      this.w.j = $$0 || this.x.a().length() > 1;
   }

   class a extends eyn<fdi.a.a> {
      public a(iu $$0, cia $$1) {
         super(fdi.this.f, fdi.this.g, fdi.this.h - 117, 80, 24);

         for (ih<dxp> $$2 : $$0.d(ke.az).c(asm.a)) {
            Set<cwy> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               fdi.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new fdi.a.a($$2));
            }
         }
      }

      public void a(@Nullable fdi.a.a $$0) {
         super.a($$0);
         fdi.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (fbp.a($$0) && this.i() != null) {
               this.i().b();
            }

            return false;
         }
      }

      public class a extends eyn.a<fdi.a.a> {
         private static final ahh b = new ahh("textures/gui/container/stats_icons.png");
         private final dxp c;
         private final vg d;

         public a(ih<dxp> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> vg.c($$0x.a().f("flat_world_preset"))).orElse(fdi.a);
         }

         @Override
         public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(fdi.this.i, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return true;
         }

         void b() {
            a.this.a(this);
            fdi.this.y = this.c.b();
            fdi.this.x.a(fdi.a(fdi.this.y));
            fdi.this.x.b(false);
         }

         private void a(exe $$0, int $$1, int $$2, cnb $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new cng($$3), $$1 + 2, $$2 + 2);
         }

         private void a(exe $$0, int $$1, int $$2) {
            $$0.a(fdi.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public vg a() {
            return vg.a("narrator.select", this.d);
         }
      }
   }
}
