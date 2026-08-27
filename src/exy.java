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

public class exy {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, exq> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<eyb, List<exq>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, exs> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<exp, exq> f = new EnumMap<>(exp.class);
   private final Object2ObjectMap<String, ext> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, ext> h = new Object2ObjectOpenHashMap();

   @Nullable
   public exq a(@Nullable String $$0) {
      return (exq)this.c.get($$0);
   }

   public exq a(String $$0, eyb $$1, xe $$2, eyb.a $$3, boolean $$4, @Nullable yu $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         exq $$6 = new exq(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(eyb $$0, exx $$1, Consumer<exw> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private exs f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new exs());
   }

   public exw c(exx $$0, exq $$1) {
      return this.a($$0, $$1, false);
   }

   public exw a(final exx $$0, final exq $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      exs $$4 = this.f($$0.cG());
      final MutableBoolean $$5 = new MutableBoolean();
      final exv $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new exw() {
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
                  xe $$2 = $$0.P_();
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
         public xe g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable xe $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable yu $$0x) {
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

            exy.this.a($$0, $$1);
         }

         private void h() {
            exy.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public exu d(exx $$0, exq $$1) {
      exs $$2 = this.e.get($$0.cG());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<exr> i(exq $$0) {
      List<exr> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         exv $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new exr($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<exq> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<exx> e() {
      return this.e.keySet().stream().map(exx::e).toList();
   }

   public void b(exx $$0) {
      exs $$1 = this.e.remove($$0.cG());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(exx $$0, exq $$1) {
      exs $$2 = this.e.get($$0.cG());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            exs $$4 = this.e.remove($$0.cG());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<exq> c(exx $$0) {
      exs $$1 = this.e.get($$0.cG());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(exq $$0) {
      this.c.remove($$0.b());

      for (exp $$1 : exp.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<exq> $$2 = (List<exq>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (exs $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(exp $$0, @Nullable exq $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public exq a(exp $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public ext b(String $$0) {
      return (ext)this.g.get($$0);
   }

   public ext c(String $$0) {
      ext $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new ext(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(ext $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, ext $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      ext $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, ext $$1) {
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

   public Collection<ext> g() {
      return this.g.values();
   }

   @Nullable
   public ext e(String $$0) {
      return (ext)this.h.get($$0);
   }

   public void a(exq $$0) {
   }

   public void b(exq $$0) {
   }

   public void c(exq $$0) {
   }

   protected void a(exx $$0, exq $$1, exv $$2) {
   }

   protected void a(exx $$0, exq $$1) {
   }

   public void a(exx $$0) {
   }

   public void b(exx $$0, exq $$1) {
   }

   public void a(ext $$0) {
   }

   public void b(ext $$0) {
   }

   public void c(ext $$0) {
   }

   public void a(brv $$0) {
      if (!($$0 instanceof cly) && !$$0.bI()) {
         this.b($$0);
         this.d($$0.cG());
      }
   }

   protected uq a(jc.a $$0) {
      uq $$1 = new uq();
      this.e.forEach(($$2, $$3) -> $$3.c().forEach(($$3x, $$4) -> {
            uk $$5 = $$4.a($$0);
            $$5.a("Name", $$2);
            $$5.a("Objective", $$3x.b());
            $$1.add($$5);
         }));
      return $$1;
   }

   protected void a(uq $$0, jc.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         uk $$3 = $$0.a($$2);
         exv $$4 = exv.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         exq $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}
