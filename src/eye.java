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

public class eye {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, exw> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<eyh, List<exw>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, exy> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<exv, exw> f = new EnumMap<>(exv.class);
   private final Object2ObjectMap<String, exz> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, exz> h = new Object2ObjectOpenHashMap();

   @Nullable
   public exw a(@Nullable String $$0) {
      return (exw)this.c.get($$0);
   }

   public exw a(String $$0, eyh $$1, wz $$2, eyh.a $$3, boolean $$4, @Nullable yp $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         exw $$6 = new exw(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(eyh $$0, eyd $$1, Consumer<eyc> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private exy f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new exy());
   }

   public eyc c(eyd $$0, exw $$1) {
      return this.a($$0, $$1, false);
   }

   public eyc a(final eyd $$0, final exw $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      exy $$4 = this.f($$0.cC());
      final MutableBoolean $$5 = new MutableBoolean();
      final eyb $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new eyc() {
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

            eye.this.a($$0, $$1);
         }

         private void h() {
            eye.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public eya d(eyd $$0, exw $$1) {
      exy $$2 = this.e.get($$0.cC());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<exx> i(exw $$0) {
      List<exx> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         eyb $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new exx($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<exw> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<eyd> e() {
      return this.e.keySet().stream().map(eyd::c).toList();
   }

   public void b(eyd $$0) {
      exy $$1 = this.e.remove($$0.cC());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(eyd $$0, exw $$1) {
      exy $$2 = this.e.get($$0.cC());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            exy $$4 = this.e.remove($$0.cC());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<exw> c(eyd $$0) {
      exy $$1 = this.e.get($$0.cC());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(exw $$0) {
      this.c.remove($$0.b());

      for (exv $$1 : exv.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<exw> $$2 = (List<exw>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (exy $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(exv $$0, @Nullable exw $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public exw a(exv $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public exz b(String $$0) {
      return (exz)this.g.get($$0);
   }

   public exz c(String $$0) {
      exz $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new exz(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(exz $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, exz $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      exz $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, exz $$1) {
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

   public Collection<exz> g() {
      return this.g.values();
   }

   @Nullable
   public exz e(String $$0) {
      return (exz)this.h.get($$0);
   }

   public void a(exw $$0) {
   }

   public void b(exw $$0) {
   }

   public void c(exw $$0) {
   }

   protected void a(eyd $$0, exw $$1, eyb $$2) {
   }

   protected void a(eyd $$0, exw $$1) {
   }

   public void a(eyd $$0) {
   }

   public void b(eyd $$0, exw $$1) {
   }

   public void a(exz $$0) {
   }

   public void b(exz $$0) {
   }

   public void c(exz $$0) {
   }

   public void a(bsr $$0) {
      if (!($$0 instanceof cmx) && !$$0.bE()) {
         this.b($$0);
         this.d($$0.cC());
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
         eyb $$4 = eyb.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         exw $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}
