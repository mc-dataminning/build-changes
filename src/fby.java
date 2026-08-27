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

public class fby extends fcc {
   static final agt b = new agt("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int k = 18;
   private static final int l = 20;
   private static final int m = 1;
   private static final int n = 1;
   private static final int o = 2;
   private static final int p = 2;
   private static final ags<ctx> q = cue.b;
   public static final vb a = vb.c("flat_world_preset.unknown");
   private final fay r;
   private vb t;
   private vb u;
   private fby.a v;
   private ewh w;
   ewq x;
   dwr y;

   public fby(fay $$0) {
      super(vb.c("createWorld.customize.presets.title"));
      this.r = $$0;
   }

   @Nullable
   private static dwo a(ig<cvz> $$0, String $$1, int $$2) {
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

      int $$9 = Math.min($$2 + $$5, dly.c);
      int $$10 = $$9 - $$2;

      Optional<ie.c<cvz>> $$11;
      try {
         $$11 = $$0.a(ags.a(kc.f, new agt($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new dwo($$10, $$11.get().a());
      }
   }

   private static List<dwo> a(ig<cvz> $$0, String $$1) {
      List<dwo> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         dwo $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static dwr a(ig<cvz> $$0, ig<ctx> $$1, ig<dyu> $$2, ig<dxs> $$3, String $$4, dwr $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return dwr.a($$1, $$2, $$3);
      } else {
         List<dwo> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return dwr.a($$1, $$2, $$3);
         } else {
            ie.c<ctx> $$8 = $$1.b(q);
            ie<ctx> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(agt.a($$10)).map($$0x -> ags.a(kc.as, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(dwr $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(ags::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aP_() {
      this.t = vb.c("createWorld.customize.presets.share");
      this.u = vb.c("createWorld.customize.presets.list");
      this.x = new ewq(this.i, 50, 40, this.g - 100, 20, this.t);
      this.x.l(1230);
      fha $$0 = this.r.a.l().k();
      is $$1 = $$0.a();
      chb $$2 = $$0.g().b();
      ig<ctx> $$3 = $$1.b(kc.as);
      ig<dyu> $$4 = $$1.b(kc.aE);
      ig<dxs> $$5 = $$1.b(kc.aB);
      ig<cvz> $$6 = $$1.b(kc.f).a($$2);
      this.x.a(a(this.r.k()));
      this.y = this.r.k();
      this.e(this.x);
      this.v = new fby.a($$1, $$2);
      this.e(this.v);
      this.w = this.d(ewh.a(vb.c("createWorld.customize.presets.select"), $$4x -> {
         dwr $$5x = a($$6, $$3, $$4, $$5, this.x.a(), this.y);
         this.r.a($$5x);
         this.f.a(this.r);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(ewh.a(va.e, $$0x -> this.f.a(this.r)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.c(this.v.f() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.v.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(euk $$0, int $$1, int $$2) {
      String $$3 = this.x.a();
      this.b($$0, $$1, $$2);
      this.x.a($$3);
   }

   @Override
   public void aF_() {
      this.f.a(this.r);
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.v.a($$0, $$1, $$2, $$3);
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
      this.w.i = $$0 || this.x.a().length() > 1;
   }

   class a extends exd<fby.a.a> {
      public a(is $$0, chb $$1) {
         super(fby.this.f, fby.this.g, fby.this.h, 80, fby.this.h - 37, 24);

         for (ie<dwp> $$2 : $$0.d(kc.ay).c(arv.a)) {
            Set<cvz> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               fby.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new fby.a.a($$2));
            }
         }
      }

      public void a(@Nullable fby.a.a $$0) {
         super.a($$0);
         fby.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (faf.a($$0) && this.f() != null) {
               this.f().b();
            }

            return false;
         }
      }

      public class a extends exd.a<fby.a.a> {
         private static final agt b = new agt("textures/gui/container/stats_icons.png");
         private final dwp c;
         private final vb d;

         public a(ie<dwp> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> vb.c($$0x.a().f("flat_world_preset"))).orElse(fby.a);
         }

         @Override
         public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(fby.this.i, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return true;
         }

         void b() {
            a.this.a(this);
            fby.this.y = this.c.b();
            fby.this.x.a(fby.a(fby.this.y));
            fby.this.x.b(false);
         }

         private void a(evw $$0, int $$1, int $$2, cmc $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new cmh($$3), $$1 + 2, $$2 + 2);
         }

         private void a(evw $$0, int $$1, int $$2) {
            $$0.a(fby.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public vb a() {
            return vb.a("narrator.select", this.d);
         }
      }
   }
}
