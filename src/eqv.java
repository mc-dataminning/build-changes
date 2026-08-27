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

public class eqv {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, eqn> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<eqy, List<eqn>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, eqp> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<eqm, eqn> f = new EnumMap<>(eqm.class);
   private final Object2ObjectMap<String, eqq> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, eqq> h = new Object2ObjectOpenHashMap();

   @Nullable
   public eqn a(@Nullable String $$0) {
      return (eqn)this.c.get($$0);
   }

   public eqn a(String $$0, eqy $$1, vu $$2, eqy.a $$3, boolean $$4, @Nullable xk $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         eqn $$6 = new eqn(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(eqy $$0, equ $$1, Consumer<eqt> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private eqp f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new eqp());
   }

   public eqt c(equ $$0, eqn $$1) {
      return this.a($$0, $$1, false);
   }

   public eqt a(final equ $$0, final eqn $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      eqp $$4 = this.f($$0.cy());
      final MutableBoolean $$5 = new MutableBoolean();
      final eqs $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new eqt() {
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
                  vu $$2 = $$0.O_();
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
         public vu g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable vu $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable xk $$0x) {
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

            eqv.this.a($$0, $$1);
         }

         private void h() {
            eqv.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public eqr d(equ $$0, eqn $$1) {
      eqp $$2 = this.e.get($$0.cy());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<eqo> i(eqn $$0) {
      List<eqo> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         eqs $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new eqo($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<eqn> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<equ> e() {
      return this.e.keySet().stream().map(equ::d).toList();
   }

   public void b(equ $$0) {
      eqp $$1 = this.e.remove($$0.cy());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(equ $$0, eqn $$1) {
      eqp $$2 = this.e.get($$0.cy());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            eqp $$4 = this.e.remove($$0.cy());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<eqn> c(equ $$0) {
      eqp $$1 = this.e.get($$0.cy());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(eqn $$0) {
      this.c.remove($$0.b());

      for (eqm $$1 : eqm.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<eqn> $$2 = (List<eqn>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (eqp $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(eqm $$0, @Nullable eqn $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public eqn a(eqm $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public eqq b(String $$0) {
      return (eqq)this.g.get($$0);
   }

   public eqq c(String $$0) {
      eqq $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new eqq(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(eqq $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, eqq $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      eqq $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, eqq $$1) {
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

   public Collection<eqq> g() {
      return this.g.values();
   }

   @Nullable
   public eqq e(String $$0) {
      return (eqq)this.h.get($$0);
   }

   public void a(eqn $$0) {
   }

   public void b(eqn $$0) {
   }

   public void c(eqn $$0) {
   }

   protected void a(equ $$0, eqn $$1, eqs $$2) {
   }

   protected void a(equ $$0, eqn $$1) {
   }

   public void a(equ $$0) {
   }

   public void b(equ $$0, eqn $$1) {
   }

   public void a(eqq $$0) {
   }

   public void b(eqq $$0) {
   }

   public void c(eqq $$0) {
   }

   public void a(bow $$0) {
      if (!($$0 instanceof cis) && !$$0.bA()) {
         this.b($$0);
         this.d($$0.cy());
      }
   }

   protected tg h() {
      tg $$0 = new tg();
      this.e.forEach(($$1, $$2) -> $$2.c().forEach(($$2x, $$3) -> {
            ta $$4 = $$3.e();
            $$4.a("Name", $$1);
            $$4.a("Objective", $$2x.b());
            $$0.add($$4);
         }));
      return $$0;
   }

   protected void a(tg $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ta $$2 = $$0.a($$1);
         eqs $$3 = eqs.a($$2);
         String $$4 = $$2.l("Name");
         String $$5 = $$2.l("Objective");
         eqn $$6 = this.a($$5);
         if ($$6 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$5, $$4);
         } else {
            this.f($$4).a($$6, $$3);
         }
      }
   }
}
