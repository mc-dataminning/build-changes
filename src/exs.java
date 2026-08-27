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

public class exs extends exv {
   static final aep b = new aep("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int k = 18;
   private static final int l = 20;
   private static final int m = 1;
   private static final int n = 1;
   private static final int o = 2;
   private static final int p = 2;
   private static final aeo<cqi> q = cqp.b;
   public static final te a = te.c("flat_world_preset.unknown");
   private final ewr s;
   private te t;
   private te u;
   private exs.a v;
   private esi w;
   esr x;
   dta y;

   public exs(ewr $$0) {
      super(te.c("createWorld.customize.presets.title"));
      this.s = $$0;
   }

   @Nullable
   private static dsx a(hg<csk> $$0, String $$1, int $$2) {
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

      int $$9 = Math.min($$2 + $$5, dih.c);
      int $$10 = $$9 - $$2;

      Optional<hf.c<csk>> $$11;
      try {
         $$11 = $$0.a(aeo.a(jd.e, new aep($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new dsx($$10, $$11.get().a());
      }
   }

   private static List<dsx> a(hg<csk> $$0, String $$1) {
      List<dsx> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         dsx $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static dta a(hg<csk> $$0, hg<cqi> $$1, hg<dvd> $$2, hg<dub> $$3, String $$4, dta $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return dta.a($$1, $$2, $$3);
      } else {
         List<dsx> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return dta.a($$1, $$2, $$3);
         } else {
            hf.c<cqi> $$8 = $$1.b(q);
            hf<cqi> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(aep.a($$10)).map($$0x -> aeo.a(jd.ap, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(dta $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(aeo::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aE_() {
      this.t = te.c("createWorld.customize.presets.share");
      this.u = te.c("createWorld.customize.presets.list");
      this.x = new esr(this.i, 50, 40, this.g - 100, 20, this.t);
      this.x.k(1230);
      fcn $$0 = this.s.a.l().k();
      ht $$1 = $$0.a();
      cdt $$2 = $$0.g().b();
      hg<cqi> $$3 = $$1.b(jd.ap);
      hg<dvd> $$4 = $$1.b(jd.aB);
      hg<dub> $$5 = $$1.b(jd.ay);
      hg<csk> $$6 = $$1.b(jd.e).a($$2);
      this.x.a(a(this.s.k()));
      this.y = this.s.k();
      this.e(this.x);
      this.v = new exs.a($$1, $$2);
      this.e(this.v);
      this.w = this.d(esi.a(te.c("createWorld.customize.presets.select"), $$4x -> {
         dta $$5x = a($$6, $$3, $$4, $$5, this.x.a(), this.y);
         this.s.a($$5x);
         this.f.a(this.s);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(esi.a(td.e, $$0x -> this.f.a(this.s)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.c(this.v.f() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.v.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(eqn $$0, int $$1, int $$2) {
      String $$3 = this.x.a();
      this.b($$0, $$1, $$2);
      this.x.a($$3);
   }

   @Override
   public void au_() {
      this.f.a(this.s);
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.v.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 400.0F);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.b(this.i, this.t, 50, 30, 10526880);
      $$0.b(this.i, this.u, 50, 70, 10526880);
      $$0.c().b();
      this.x.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void c(boolean $$0) {
      this.w.i = $$0 || this.x.a().length() > 1;
   }

   class a extends ete<exs.a.a> {
      public a(ht $$0, cdt $$1) {
         super(exs.this.f, exs.this.g, exs.this.h, 80, exs.this.h - 37, 24);

         for (hf<dsy> $$2 : $$0.d(jd.av).c(apn.a)) {
            Set<csk> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               exs.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new exs.a.a($$2));
            }
         }
      }

      public void a(@Nullable exs.a.a $$0) {
         super.a($$0);
         exs.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (evy.a($$0) && this.f() != null) {
               this.f().b();
            }

            return false;
         }
      }

      public class a extends ete.a<exs.a.a> {
         private static final aep b = new aep("textures/gui/container/stats_icons.png");
         private final dsy c;
         private final te d;

         public a(hf<dsy> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> te.c($$0x.a().f("flat_world_preset"))).orElse(exs.a);
         }

         @Override
         public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(exs.this.i, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            if ($$2 == 0) {
               this.b();
            }

            return false;
         }

         void b() {
            a.this.a(this);
            exs.this.y = this.c.b();
            exs.this.x.a(exs.a(exs.this.y));
            exs.this.x.b(false);
         }

         private void a(erx $$0, int $$1, int $$2, cir $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new ciw($$3), $$1 + 2, $$2 + 2);
         }

         private void a(erx $$0, int $$1, int $$2) {
            $$0.a(exs.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public te a() {
            return te.a("narrator.select", this.d);
         }
      }
   }
}
