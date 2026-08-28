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

public class fcx {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, fcp> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<fda, List<fcp>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, fcr> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<fco, fcp> f = new EnumMap<>(fco.class);
   private final Object2ObjectMap<String, fcs> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, fcs> h = new Object2ObjectOpenHashMap();

   @Nullable
   public fcp a(@Nullable String $$0) {
      return (fcp)this.c.get($$0);
   }

   public fcp a(String $$0, fda $$1, xv $$2, fda.a $$3, boolean $$4, @Nullable zl $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         fcp $$6 = new fcp(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(fda $$0, fcw $$1, Consumer<fcv> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private fcr f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new fcr());
   }

   public fcv c(fcw $$0, fcp $$1) {
      return this.a($$0, $$1, false);
   }

   public fcv a(final fcw $$0, final fcp $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      fcr $$4 = this.f($$0.cI());
      final MutableBoolean $$5 = new MutableBoolean();
      final fcu $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new fcv() {
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
                  xv $$2 = $$0.p_();
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
         public xv g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable xv $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable zl $$0x) {
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

            fcx.this.a($$0, $$1);
         }

         private void h() {
            fcx.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public fct d(fcw $$0, fcp $$1) {
      fcr $$2 = this.e.get($$0.cI());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<fcq> i(fcp $$0) {
      List<fcq> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         fcu $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new fcq($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<fcp> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<fcw> e() {
      return this.e.keySet().stream().map(fcw::c).toList();
   }

   public void b(fcw $$0) {
      fcr $$1 = this.e.remove($$0.cI());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(fcw $$0, fcp $$1) {
      fcr $$2 = this.e.get($$0.cI());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            fcr $$4 = this.e.remove($$0.cI());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<fcp> c(fcw $$0) {
      fcr $$1 = this.e.get($$0.cI());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(fcp $$0) {
      this.c.remove($$0.b());

      for (fco $$1 : fco.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<fcp> $$2 = (List<fcp>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (fcr $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(fco $$0, @Nullable fcp $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public fcp a(fco $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public fcs b(String $$0) {
      return (fcs)this.g.get($$0);
   }

   public fcs c(String $$0) {
      fcs $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new fcs(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(fcs $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, fcs $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      fcs $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, fcs $$1) {
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

   public Collection<fcs> g() {
      return this.g.values();
   }

   @Nullable
   public fcs e(String $$0) {
      return (fcs)this.h.get($$0);
   }

   public void a(fcp $$0) {
   }

   public void b(fcp $$0) {
   }

   public void c(fcp $$0) {
   }

   protected void a(fcw $$0, fcp $$1, fcu $$2) {
   }

   protected void a(fcw $$0, fcp $$1) {
   }

   public void a(fcw $$0) {
   }

   public void b(fcw $$0, fcp $$1) {
   }

   public void a(fcs $$0) {
   }

   public void b(fcs $$0) {
   }

   public void c(fcs $$0) {
   }

   public void a(bvf $$0) {
      if (!($$0 instanceof cps) && !$$0.bL()) {
         this.b($$0);
         this.d($$0.cI());
      }
   }

   protected vd a(js.a $$0) {
      vd $$1 = new vd();
      this.e.forEach(($$2, $$3) -> $$3.c().forEach(($$3x, $$4) -> {
            ux $$5 = $$4.a($$0);
            $$5.a("Name", $$2);
            $$5.a("Objective", $$3x.b());
            $$1.add($$5);
         }));
      return $$1;
   }

   protected void a(vd $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ux $$3 = $$0.a($$2);
         fcu $$4 = fcu.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         fcp $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}
