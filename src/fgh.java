import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
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

public class fgh {
   public static final String b = "#";
   private static final Logger a = LogUtils.getLogger();
   private final Object2ObjectMap<String, ffz> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<fgk, List<ffz>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, fgb> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<ffy, ffz> f = new EnumMap<>(ffy.class);
   private final Object2ObjectMap<String, fgc> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, fgc> h = new Object2ObjectOpenHashMap();

   @Nullable
   public ffz a(@Nullable String $$0) {
      return (ffz)this.c.get($$0);
   }

   public ffz a(String $$0, fgk $$1, wy $$2, fgk.a $$3, boolean $$4, @Nullable yo $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         ffz $$6 = new ffz(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(fgk $$0, fgg $$1, Consumer<fgf> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private fgb f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new fgb());
   }

   public fgf c(fgg $$0, ffz $$1) {
      return this.a($$0, $$1, false);
   }

   public fgf a(final fgg $$0, final ffz $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.d().e();
      fgb $$4 = this.f($$0.cH());
      final MutableBoolean $$5 = new MutableBoolean();
      final fge $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new fgf() {
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
               if ($$1.f()) {
                  wy $$2 = $$0.m_();
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
         public wy g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable wy $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable yo $$0x) {
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

            fgh.this.a($$0, $$1);
         }

         private void h() {
            fgh.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public fgd d(fgg $$0, ffz $$1) {
      fgb $$2 = this.e.get($$0.cH());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<fga> i(ffz $$0) {
      List<fga> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         fge $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new fga($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<ffz> b() {
      return this.c.values();
   }

   public Collection<String> c() {
      return this.c.keySet();
   }

   public Collection<fgg> d() {
      return this.e.keySet().stream().map(fgg::c).toList();
   }

   public void b(fgg $$0) {
      fgb $$1 = this.e.remove($$0.cH());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(fgg $$0, ffz $$1) {
      fgb $$2 = this.e.get($$0.cH());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            fgb $$4 = this.e.remove($$0.cH());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<ffz> c(fgg $$0) {
      fgb $$1 = this.e.get($$0.cH());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(ffz $$0) {
      this.c.remove($$0.c());

      for (ffy $$1 : ffy.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<ffz> $$2 = (List<ffz>)this.d.get($$0.d());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (fgb $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(ffy $$0, @Nullable ffz $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public ffz a(ffy $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public fgc b(String $$0) {
      return (fgc)this.g.get($$0);
   }

   public fgc c(String $$0) {
      fgc $$1 = this.b($$0);
      if ($$1 != null) {
         a.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new fgc(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(fgc $$0) {
      this.g.remove($$0.c());

      for (String $$1 : $$0.h()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, fgc $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.h().add($$0);
   }

   public boolean d(String $$0) {
      fgc $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, fgc $$1) {
      if (this.e($$0) != $$1) {
         throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + $$1.c() + "'.");
      } else {
         this.h.remove($$0);
         $$1.h().remove($$0);
      }
   }

   public Collection<String> e() {
      return this.g.keySet();
   }

   public Collection<fgc> f() {
      return this.g.values();
   }

   @Nullable
   public fgc e(String $$0) {
      return (fgc)this.h.get($$0);
   }

   public void a(ffz $$0) {
   }

   public void b(ffz $$0) {
   }

   public void c(ffz $$0) {
   }

   protected void a(fgg $$0, ffz $$1, fge $$2) {
   }

   protected void a(fgg $$0, ffz $$1) {
   }

   public void a(fgg $$0) {
   }

   public void b(fgg $$0, ffz $$1) {
   }

   public void a(fgc $$0) {
   }

   public void b(fgc $$0) {
   }

   public void c(fgc $$0) {
   }

   public void a(bwi $$0) {
      if (!($$0 instanceof crm) && !$$0.bI()) {
         this.b($$0);
         this.d($$0.cH());
      }
   }

   protected List<fgh.a> g() {
      return this.e.entrySet().stream().flatMap($$0 -> {
         String $$1 = $$0.getKey();
         return $$0.getValue().c().entrySet().stream().map($$1x -> new fgh.a($$1, ((ffz)$$1x.getKey()).c(), (fge)$$1x.getValue()));
      }).toList();
   }

   protected void a(fgh.a $$0) {
      ffz $$1 = this.a($$0.c);
      if ($$1 == null) {
         a.error("Unknown objective {} for name {}, ignoring", $$0.c, $$0.b);
      } else {
         this.f($$0.b).a($$1, $$0.d);
      }
   }

   protected void a(fgc.a $$0) {
      fgc $$1 = this.c($$0.a());
      $$0.b().ifPresent($$1::a);
      $$0.c().ifPresent($$1::a);
      $$1.a($$0.d());
      $$1.b($$0.e());
      $$1.b($$0.f());
      $$1.c($$0.g());
      $$1.a($$0.h());
      $$1.b($$0.i());
      $$1.a($$0.j());

      for (String $$2 : $$0.k()) {
         this.a($$2, $$1);
      }
   }

   protected void a(ffz.a $$0) {
      this.a($$0.a(), $$0.b(), $$0.c(), $$0.d(), $$0.e(), $$0.f().orElse(null));
   }

   public static record a(String b, String c, fge d) {
      public static final Codec<fgh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("Name").forGetter(fgh.a::a), Codec.STRING.fieldOf("Objective").forGetter(fgh.a::b), fge.a.forGetter(fgh.a::c))
               .apply($$0, fgh.a::new)
      );

      public String a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public fge c() {
         return this.d;
      }
   }
}
