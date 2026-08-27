import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class etn {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, etf> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<etq, List<etf>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, eth> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<ete, etf> f = new EnumMap<>(ete.class);
   private final Object2ObjectMap<String, eti> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, eti> h = new Object2ObjectOpenHashMap();

   @Nullable
   public etf a(@Nullable String $$0) {
      return (etf)this.c.get($$0);
   }

   public etf a(String $$0, etq $$1, wi $$2, etq.a $$3, boolean $$4, @Nullable xy $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         etf $$6 = new etf(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(etq $$0, etm $$1, Consumer<etl> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private eth f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new eth());
   }

   public etl c(etm $$0, etf $$1) {
      return this.a($$0, $$1, false);
   }

   public etl a(final etm $$0, final etf $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      eth $$4 = this.f($$0.cy());
      final MutableBoolean $$5 = new MutableBoolean();
      final etk $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new etl() {
         @Override
         public int a() {
            return $$6.a();
         }

         @Override
         public void a(int $$0x) {
            if (!$$3) {
               throw new IllegalStateException("Cannot modify read-only score");
            } else {
               boolean $$1 = $$5.isTrue();
               if ($$1.e()) {
                  wi $$2 = $$0.O_();
                  if ($$2 != null && !$$2.equals($$6.d())) {
                     $$6.a($$2);
                     $$1 = true;
                  }
               }

               if ($$0 != $$6.a()) {
                  $$6.a($$0);
                  $$1 = true;
               }

               if ($$1) {
                  this.h();
               }
            }
         }

         @Nullable
         @Override
         public wi g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable wi $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable xy $$0x) {
            $$6.b($$0);
            this.h();
         }

         @Override
         public boolean d() {
            return $$6.b();
         }

         @Override
         public void e() {
            this.a(false);
         }

         @Override
         public void f() {
            this.a(true);
         }

         private void a(boolean $$0x) {
            $$6.a($$0);
            if ($$5.isTrue()) {
               this.h();
            }

            etn.this.a($$0, $$1);
         }

         private void h() {
            etn.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public etj d(etm $$0, etf $$1) {
      eth $$2 = this.e.get($$0.cy());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<etg> i(etf $$0) {
      List<etg> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         etk $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new etg($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<etf> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<etm> e() {
      return this.e.keySet().stream().map(etm::c).toList();
   }

   public void b(etm $$0) {
      eth $$1 = this.e.remove($$0.cy());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(etm $$0, etf $$1) {
      eth $$2 = this.e.get($$0.cy());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            eth $$4 = this.e.remove($$0.cy());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<etf> c(etm $$0) {
      eth $$1 = this.e.get($$0.cy());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(etf $$0) {
      this.c.remove($$0.b());

      for (ete $$1 : ete.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<etf> $$2 = (List<etf>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (eth $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(ete $$0, @Nullable etf $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public etf a(ete $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public eti b(String $$0) {
      return (eti)this.g.get($$0);
   }

   public eti c(String $$0) {
      eti $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new eti(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(eti $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, eti $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      eti $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, eti $$1) {
      if (this.e($$0) != $$1) {
         throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + $$1.b() + "'.");
      } else {
         this.h.remove($$0);
         $$1.g().remove($$0);
      }
   }

   public Collection<String> f() {
      return this.g.keySet();
   }

   public Collection<eti> g() {
      return this.g.values();
   }

   @Nullable
   public eti e(String $$0) {
      return (eti)this.h.get($$0);
   }

   public void a(etf $$0) {
   }

   public void b(etf $$0) {
   }

   public void c(etf $$0) {
   }

   protected void a(etm $$0, etf $$1, etk $$2) {
   }

   protected void a(etm $$0, etf $$1) {
   }

   public void a(etm $$0) {
   }

   public void b(etm $$0, etf $$1) {
   }

   public void a(eti $$0) {
   }

   public void b(eti $$0) {
   }

   public void c(eti $$0) {
   }

   public void a(bqa $$0) {
      if (!($$0 instanceof cka) && !$$0.bA()) {
         this.b($$0);
         this.d($$0.cy());
      }
   }

   protected tu a(ip.a $$0) {
      tu $$1 = new tu();
      this.e.forEach(($$2, $$3) -> $$3.c().forEach(($$3x, $$4) -> {
            to $$5 = $$4.a($$0);
            $$5.a("Name", $$2);
            $$5.a("Objective", $$3x.b());
            $$1.add($$5);
         }));
      return $$1;
   }

   protected void a(tu $$0, ip.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         to $$3 = $$0.a($$2);
         etk $$4 = etk.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         etf $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}
