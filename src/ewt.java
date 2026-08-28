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

public class ewt {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, ewl> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<eww, List<ewl>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, ewn> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<ewk, ewl> f = new EnumMap<>(ewk.class);
   private final Object2ObjectMap<String, ewo> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, ewo> h = new Object2ObjectOpenHashMap();

   @Nullable
   public ewl a(@Nullable String $$0) {
      return (ewl)this.c.get($$0);
   }

   public ewl a(String $$0, eww $$1, xo $$2, eww.a $$3, boolean $$4, @Nullable ze $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         ewl $$6 = new ewl(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(eww $$0, ews $$1, Consumer<ewr> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private ewn f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new ewn());
   }

   public ewr c(ews $$0, ewl $$1) {
      return this.a($$0, $$1, false);
   }

   public ewr a(final ews $$0, final ewl $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      ewn $$4 = this.f($$0.cB());
      final MutableBoolean $$5 = new MutableBoolean();
      final ewq $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new ewr() {
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
                  xo $$2 = $$0.O_();
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
         public xo g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable xo $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable ze $$0x) {
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

            ewt.this.a($$0, $$1);
         }

         private void h() {
            ewt.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public ewp d(ews $$0, ewl $$1) {
      ewn $$2 = this.e.get($$0.cB());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<ewm> i(ewl $$0) {
      List<ewm> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         ewq $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new ewm($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<ewl> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<ews> e() {
      return this.e.keySet().stream().map(ews::c).toList();
   }

   public void b(ews $$0) {
      ewn $$1 = this.e.remove($$0.cB());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(ews $$0, ewl $$1) {
      ewn $$2 = this.e.get($$0.cB());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            ewn $$4 = this.e.remove($$0.cB());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<ewl> c(ews $$0) {
      ewn $$1 = this.e.get($$0.cB());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(ewl $$0) {
      this.c.remove($$0.b());

      for (ewk $$1 : ewk.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<ewl> $$2 = (List<ewl>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (ewn $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(ewk $$0, @Nullable ewl $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public ewl a(ewk $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public ewo b(String $$0) {
      return (ewo)this.g.get($$0);
   }

   public ewo c(String $$0) {
      ewo $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new ewo(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(ewo $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, ewo $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      ewo $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, ewo $$1) {
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

   public Collection<ewo> g() {
      return this.g.values();
   }

   @Nullable
   public ewo e(String $$0) {
      return (ewo)this.h.get($$0);
   }

   public void a(ewl $$0) {
   }

   public void b(ewl $$0) {
   }

   public void c(ewl $$0) {
   }

   protected void a(ews $$0, ewl $$1, ewq $$2) {
   }

   protected void a(ews $$0, ewl $$1) {
   }

   public void a(ews $$0) {
   }

   public void b(ews $$0, ewl $$1) {
   }

   public void a(ewo $$0) {
   }

   public void b(ewo $$0) {
   }

   public void c(ewo $$0) {
   }

   public void a(bss $$0) {
      if (!($$0 instanceof cmv) && !$$0.bD()) {
         this.b($$0);
         this.d($$0.cB());
      }
   }

   protected ux a(jk.a $$0) {
      ux $$1 = new ux();
      this.e.forEach(($$2, $$3) -> $$3.c().forEach(($$3x, $$4) -> {
            ur $$5 = $$4.a($$0);
            $$5.a("Name", $$2);
            $$5.a("Objective", $$3x.b());
            $$1.add($$5);
         }));
      return $$1;
   }

   protected void a(ux $$0, jk.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ur $$3 = $$0.a($$2);
         ewq $$4 = ewq.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         ewl $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}
