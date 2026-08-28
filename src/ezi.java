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

public class ezi {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, eza> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<ezl, List<eza>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, ezc> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<eyz, eza> f = new EnumMap<>(eyz.class);
   private final Object2ObjectMap<String, ezd> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, ezd> h = new Object2ObjectOpenHashMap();

   @Nullable
   public eza a(@Nullable String $$0) {
      return (eza)this.c.get($$0);
   }

   public eza a(String $$0, ezl $$1, xd $$2, ezl.a $$3, boolean $$4, @Nullable yt $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         eza $$6 = new eza(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(ezl $$0, ezh $$1, Consumer<ezg> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private ezc f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new ezc());
   }

   public ezg c(ezh $$0, eza $$1) {
      return this.a($$0, $$1, false);
   }

   public ezg a(final ezh $$0, final eza $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      ezc $$4 = this.f($$0.cF());
      final MutableBoolean $$5 = new MutableBoolean();
      final ezf $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new ezg() {
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
                  xd $$2 = $$0.Q_();
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
         public xd g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable xd $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable yt $$0x) {
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

            ezi.this.a($$0, $$1);
         }

         private void h() {
            ezi.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public eze d(ezh $$0, eza $$1) {
      ezc $$2 = this.e.get($$0.cF());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<ezb> i(eza $$0) {
      List<ezb> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         ezf $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new ezb($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<eza> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<ezh> e() {
      return this.e.keySet().stream().map(ezh::c).toList();
   }

   public void b(ezh $$0) {
      ezc $$1 = this.e.remove($$0.cF());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(ezh $$0, eza $$1) {
      ezc $$2 = this.e.get($$0.cF());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            ezc $$4 = this.e.remove($$0.cF());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<eza> c(ezh $$0) {
      ezc $$1 = this.e.get($$0.cF());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(eza $$0) {
      this.c.remove($$0.b());

      for (eyz $$1 : eyz.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<eza> $$2 = (List<eza>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (ezc $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(eyz $$0, @Nullable eza $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public eza a(eyz $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public ezd b(String $$0) {
      return (ezd)this.g.get($$0);
   }

   public ezd c(String $$0) {
      ezd $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new ezd(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(ezd $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, ezd $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      ezd $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, ezd $$1) {
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

   public Collection<ezd> g() {
      return this.g.values();
   }

   @Nullable
   public ezd e(String $$0) {
      return (ezd)this.h.get($$0);
   }

   public void a(eza $$0) {
   }

   public void b(eza $$0) {
   }

   public void c(eza $$0) {
   }

   protected void a(ezh $$0, eza $$1, ezf $$2) {
   }

   protected void a(ezh $$0, eza $$1) {
   }

   public void a(ezh $$0) {
   }

   public void b(ezh $$0, eza $$1) {
   }

   public void a(ezd $$0) {
   }

   public void b(ezd $$0) {
   }

   public void c(ezd $$0) {
   }

   public void a(btj $$0) {
      if (!($$0 instanceof cnp) && !$$0.bI()) {
         this.b($$0);
         this.d($$0.cF());
      }
   }

   protected ul a(jp.a $$0) {
      ul $$1 = new ul();
      this.e.forEach(($$2, $$3) -> $$3.c().forEach(($$3x, $$4) -> {
            uf $$5 = $$4.a($$0);
            $$5.a("Name", $$2);
            $$5.a("Objective", $$3x.b());
            $$1.add($$5);
         }));
      return $$1;
   }

   protected void a(ul $$0, jp.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         uf $$3 = $$0.a($$2);
         ezf $$4 = ezf.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         eza $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}
