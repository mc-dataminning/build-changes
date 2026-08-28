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

public class eyg {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, exy> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<eyj, List<exy>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, eya> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<exx, exy> f = new EnumMap<>(exx.class);
   private final Object2ObjectMap<String, eyb> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, eyb> h = new Object2ObjectOpenHashMap();

   @Nullable
   public exy a(@Nullable String $$0) {
      return (exy)this.c.get($$0);
   }

   public exy a(String $$0, eyj $$1, wz $$2, eyj.a $$3, boolean $$4, @Nullable yp $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         exy $$6 = new exy(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(eyj $$0, eyf $$1, Consumer<eye> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private eya f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new eya());
   }

   public eye c(eyf $$0, exy $$1) {
      return this.a($$0, $$1, false);
   }

   public eye a(final eyf $$0, final exy $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      eya $$4 = this.f($$0.cB());
      final MutableBoolean $$5 = new MutableBoolean();
      final eyd $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new eye() {
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
                  wz $$2 = $$0.S_();
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
         public wz g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable wz $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable yp $$0x) {
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

            eyg.this.a($$0, $$1);
         }

         private void h() {
            eyg.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public eyc d(eyf $$0, exy $$1) {
      eya $$2 = this.e.get($$0.cB());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<exz> i(exy $$0) {
      List<exz> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         eyd $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new exz($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<exy> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<eyf> e() {
      return this.e.keySet().stream().map(eyf::c).toList();
   }

   public void b(eyf $$0) {
      eya $$1 = this.e.remove($$0.cB());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(eyf $$0, exy $$1) {
      eya $$2 = this.e.get($$0.cB());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            eya $$4 = this.e.remove($$0.cB());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<exy> c(eyf $$0) {
      eya $$1 = this.e.get($$0.cB());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(exy $$0) {
      this.c.remove($$0.b());

      for (exx $$1 : exx.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<exy> $$2 = (List<exy>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (eya $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(exx $$0, @Nullable exy $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public exy a(exx $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public eyb b(String $$0) {
      return (eyb)this.g.get($$0);
   }

   public eyb c(String $$0) {
      eyb $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new eyb(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(eyb $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, eyb $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      eyb $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, eyb $$1) {
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

   public Collection<eyb> g() {
      return this.g.values();
   }

   @Nullable
   public eyb e(String $$0) {
      return (eyb)this.h.get($$0);
   }

   public void a(exy $$0) {
   }

   public void b(exy $$0) {
   }

   public void c(exy $$0) {
   }

   protected void a(eyf $$0, exy $$1, eyd $$2) {
   }

   protected void a(eyf $$0, exy $$1) {
   }

   public void a(eyf $$0) {
   }

   public void b(eyf $$0, exy $$1) {
   }

   public void a(eyb $$0) {
   }

   public void b(eyb $$0) {
   }

   public void c(eyb $$0) {
   }

   public void a(bsr $$0) {
      if (!($$0 instanceof cmx) && !$$0.bE()) {
         this.b($$0);
         this.d($$0.cB());
      }
   }

   protected uh a(jo.a $$0) {
      uh $$1 = new uh();
      this.e.forEach(($$2, $$3) -> $$3.c().forEach(($$3x, $$4) -> {
            ub $$5 = $$4.a($$0);
            $$5.a("Name", $$2);
            $$5.a("Objective", $$3x.b());
            $$1.add($$5);
         }));
      return $$1;
   }

   protected void a(uh $$0, jo.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ub $$3 = $$0.a($$2);
         eyd $$4 = eyd.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         exy $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}
