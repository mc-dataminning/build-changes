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

public class eun extends euq {
   static final Logger b = LogUtils.getLogger();
   private static final int c = 128;
   private static final int k = 18;
   private static final int l = 20;
   private static final int m = 1;
   private static final int n = 1;
   private static final int o = 2;
   private static final int p = 2;
   private static final acp<cnk> q = cnr.b;
   public static final sw a = sw.c("flat_world_preset.unknown");
   private final etn r;
   private sw s;
   private sw t;
   private eun.a u;
   private epi v;
   epr w;
   dqd x;

   public eun(etn $$0) {
      super(sw.c("createWorld.customize.presets.title"));
      this.r = $$0;
   }

   @Nullable
   private static dqa a(hf<cpn> $$0, String $$1, int $$2) {
      List<String> $$3 = Splitter.on('*').limit(2).splitToList($$1);
      int $$5;
      String $$4;
      if ($$3.size() == 2) {
         $$4 = $$3.get(1);

         try {
            $$5 = Math.max(Integer.parseInt($$3.get(0)), 0);
         } catch (NumberFormatException var11) {
            b.error("Error while parsing flat world string", var11);
            return null;
         }
      } else {
         $$4 = $$3.get(0);
         $$5 = 1;
      }

      int $$9 = Math.min($$2 + $$5, dfk.c);
      int $$10 = $$9 - $$2;

      Optional<he.c<cpn>> $$11;
      try {
         $$11 = $$0.a(acp.a(jc.e, new acq($$4)));
      } catch (Exception var10) {
         b.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         b.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new dqa($$10, $$11.get().a());
      }
   }

   private static List<dqa> a(hf<cpn> $$0, String $$1) {
      List<dqa> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         dqa $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static dqd a(hf<cpn> $$0, hf<cnk> $$1, hf<dsg> $$2, hf<dre> $$3, String $$4, dqd $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return dqd.a($$1, $$2, $$3);
      } else {
         List<dqa> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return dqd.a($$1, $$2, $$3);
         } else {
            he.c<cnk> $$8 = $$1.b(q);
            he<cnk> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(acq.a($$10)).map($$0x -> acp.a(jc.ap, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  b.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(dqd $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(acp::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void b() {
      this.s = sw.c("createWorld.customize.presets.share");
      this.t = sw.c("createWorld.customize.presets.list");
      this.w = new epr(this.i, 50, 40, this.g - 100, 20, this.s);
      this.w.m(1230);
      ezi $$0 = this.r.a.l().k();
      hs $$1 = $$0.a();
      caw $$2 = $$0.g().b();
      hf<cnk> $$3 = $$1.b(jc.ap);
      hf<dsg> $$4 = $$1.b(jc.aB);
      hf<dre> $$5 = $$1.b(jc.ay);
      hf<cpn> $$6 = $$1.b(jc.e).a($$2);
      this.w.a(a(this.r.j()));
      this.x = this.r.j();
      this.e(this.w);
      this.u = new eun.a($$1, $$2);
      this.e(this.u);
      this.v = this.d(epi.a(sw.c("createWorld.customize.presets.select"), $$4x -> {
         dqd $$5x = a($$6, $$3, $$4, $$5, this.w.b(), this.x);
         this.r.a($$5x);
         this.f.a(this.r);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(epi.a(sv.e, $$0x -> this.f.a(this.r)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.c(this.u.f() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2) {
      return this.u.a($$0, $$1, $$2);
   }

   @Override
   public void a(enn $$0, int $$1, int $$2) {
      String $$3 = this.w.b();
      this.b($$0, $$1, $$2);
      this.w.a($$3);
   }

   @Override
   public void aw_() {
      this.f.a(this.r);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      this.u.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 400.0F);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.b(this.i, this.s, 50, 30, 10526880);
      $$0.b(this.i, this.t, 50, 70, 10526880);
      $$0.c().b();
      this.w.a($$0, $$1, $$2, $$3);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void f() {
      this.w.a();
      super.f();
   }

   @Override
   public void c(boolean $$0) {
      this.v.r = $$0 || this.w.b().length() > 1;
   }

   class a extends eqc<eun.a.a> {
      public a(hs $$0, caw $$1) {
         super(eun.this.f, eun.this.g, eun.this.h, 80, eun.this.h - 37, 24);

         for (he<dqb> $$2 : $$0.d(jc.av).c(ana.a)) {
            Set<cpn> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               eun.b
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new eun.a.a($$2));
            }
         }
      }

      public void a(@Nullable eun.a.a $$0) {
         super.a($$0);
         eun.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (esu.a($$0) && this.f() != null) {
               this.f().b();
            }

            return false;
         }
      }

      public class a extends eqc.a<eun.a.a> {
         private static final acq b = new acq("textures/gui/container/stats_icons.png");
         private final dqb c;
         private final sw d;

         public a(he<dqb> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> sw.c($$0x.a().f("flat_world_preset"))).orElse(eun.a);
         }

         @Override
         public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(eun.this.i, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
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
            eun.this.x = this.c.b();
            eun.this.w.a(eun.a(eun.this.x));
            eun.this.w.f();
         }

         private void a(eox $$0, int $$1, int $$2, cfu $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new cfz($$3), $$1 + 2, $$2 + 2);
         }

         private void a(eox $$0, int $$1, int $$2) {
            $$0.a(b, $$1, $$2, 0, 0.0F, 0.0F, 18, 18, 128, 128);
         }

         @Override
         public sw a() {
            return sw.a("narrator.select", this.d);
         }
      }
   }
}
