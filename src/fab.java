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

public class fab {
   public static final String a = "#";
   private static final Logger b = LogUtils.getLogger();
   private final Object2ObjectMap<String, ezt> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<fae, List<ezt>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, ezv> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<ezs, ezt> f = new EnumMap<>(ezs.class);
   private final Object2ObjectMap<String, ezw> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, ezw> h = new Object2ObjectOpenHashMap();

   @Nullable
   public ezt a(@Nullable String $$0) {
      return (ezt)this.c.get($$0);
   }

   public ezt a(String $$0, fae $$1, xe $$2, fae.a $$3, boolean $$4, @Nullable yu $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         ezt $$6 = new ezt(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(fae $$0, faa $$1, Consumer<ezz> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private ezv f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new ezv());
   }

   public ezz c(faa $$0, ezt $$1) {
      return this.a($$0, $$1, false);
   }

   public ezz a(final faa $$0, final ezt $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.c().e();
      ezv $$4 = this.f($$0.cF());
      final MutableBoolean $$5 = new MutableBoolean();
      final ezy $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new ezz() {
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
                  xe $$2 = $$0.R_();
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

            fab.this.a($$0, $$1);
         }

         private void h() {
            fab.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public ezx d(faa $$0, ezt $$1) {
      ezv $$2 = this.e.get($$0.cF());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<ezu> i(ezt $$0) {
      List<ezu> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         ezy $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new ezu($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<ezt> c() {
      return this.c.values();
   }

   public Collection<String> d() {
      return this.c.keySet();
   }

   public Collection<faa> e() {
      return this.e.keySet().stream().map(faa::c).toList();
   }

   public void b(faa $$0) {
      ezv $$1 = this.e.remove($$0.cF());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(faa $$0, ezt $$1) {
      ezv $$2 = this.e.get($$0.cF());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            ezv $$4 = this.e.remove($$0.cF());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<ezt> c(faa $$0) {
      ezv $$1 = this.e.get($$0.cF());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(ezt $$0) {
      this.c.remove($$0.b());

      for (ezs $$1 : ezs.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<ezt> $$2 = (List<ezt>)this.d.get($$0.c());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (ezv $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(ezs $$0, @Nullable ezt $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public ezt a(ezs $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public ezw b(String $$0) {
      return (ezw)this.g.get($$0);
   }

   public ezw c(String $$0) {
      ezw $$1 = this.b($$0);
      if ($$1 != null) {
         b.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new ezw(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(ezw $$0) {
      this.g.remove($$0.b());

      for (String $$1 : $$0.g()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, ezw $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.g().add($$0);
   }

   public boolean d(String $$0) {
      ezw $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, ezw $$1) {
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

   public Collection<ezw> g() {
      return this.g.values();
   }

   @Nullable
   public ezw e(String $$0) {
      return (ezw)this.h.get($$0);
   }

   public void a(ezt $$0) {
   }

   public void b(ezt $$0) {
   }

   public void c(ezt $$0) {
   }

   protected void a(faa $$0, ezt $$1, ezy $$2) {
   }

   protected void a(faa $$0, ezt $$1) {
   }

   public void a(faa $$0) {
   }

   public void b(faa $$0, ezt $$1) {
   }

   public void a(ezw $$0) {
   }

   public void b(ezw $$0) {
   }

   public void c(ezw $$0) {
   }

   public void a(btr $$0) {
      if (!($$0 instanceof cnx) && !$$0.bI()) {
         this.b($$0);
         this.d($$0.cF());
      }
   }

   protected um a(jq.a $$0) {
      um $$1 = new um();
      this.e.forEach(($$2, $$3) -> $$3.c().forEach(($$3x, $$4) -> {
            ug $$5 = $$4.a($$0);
            $$5.a("Name", $$2);
            $$5.a("Objective", $$3x.b());
            $$1.add($$5);
         }));
      return $$1;
   }

   protected void a(um $$0, jq.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ug $$3 = $$0.a($$2);
         ezy $$4 = ezy.a($$3, $$1);
         String $$5 = $$3.l("Name");
         String $$6 = $$3.l("Objective");
         ezt $$7 = this.a($$6);
         if ($$7 == null) {
            b.error("Unknown objective {} for name {}, ignoring", $$6, $$5);
         } else {
            this.f($$5).a($$7, $$4);
         }
      }
   }
}
