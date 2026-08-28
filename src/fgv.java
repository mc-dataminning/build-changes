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

public class fgv {
   public static final String b = "#";
   private static final Logger a = LogUtils.getLogger();
   private final Object2ObjectMap<String, fgn> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<fgy, List<fgn>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, fgp> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<fgm, fgn> f = new EnumMap<>(fgm.class);
   private final Object2ObjectMap<String, fgq> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, fgq> h = new Object2ObjectOpenHashMap();

   @Nullable
   public fgn a(@Nullable String $$0) {
      return (fgn)this.c.get($$0);
   }

   public fgn a(String $$0, fgy $$1, xa $$2, fgy.a $$3, boolean $$4, @Nullable yq $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         fgn $$6 = new fgn(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(fgy $$0, fgu $$1, Consumer<fgt> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private fgp f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new fgp());
   }

   public fgt c(fgu $$0, fgn $$1) {
      return this.a($$0, $$1, false);
   }

   public fgt a(final fgu $$0, final fgn $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.d().e();
      fgp $$4 = this.f($$0.cI());
      final MutableBoolean $$5 = new MutableBoolean();
      final fgs $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new fgt() {
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
                  xa $$2 = $$0.m_();
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
         public xa g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable xa $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable yq $$0x) {
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

            fgv.this.a($$0, $$1);
         }

         private void h() {
            fgv.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public fgr d(fgu $$0, fgn $$1) {
      fgp $$2 = this.e.get($$0.cI());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<fgo> i(fgn $$0) {
      List<fgo> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         fgs $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new fgo($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<fgn> b() {
      return this.c.values();
   }

   public Collection<String> c() {
      return this.c.keySet();
   }

   public Collection<fgu> d() {
      return this.e.keySet().stream().map(fgu::c).toList();
   }

   public void b(fgu $$0) {
      fgp $$1 = this.e.remove($$0.cI());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(fgu $$0, fgn $$1) {
      fgp $$2 = this.e.get($$0.cI());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            fgp $$4 = this.e.remove($$0.cI());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<fgn> c(fgu $$0) {
      fgp $$1 = this.e.get($$0.cI());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(fgn $$0) {
      this.c.remove($$0.c());

      for (fgm $$1 : fgm.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<fgn> $$2 = (List<fgn>)this.d.get($$0.d());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (fgp $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(fgm $$0, @Nullable fgn $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public fgn a(fgm $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public fgq b(String $$0) {
      return (fgq)this.g.get($$0);
   }

   public fgq c(String $$0) {
      fgq $$1 = this.b($$0);
      if ($$1 != null) {
         a.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new fgq(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(fgq $$0) {
      this.g.remove($$0.c());

      for (String $$1 : $$0.h()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, fgq $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.h().add($$0);
   }

   public boolean d(String $$0) {
      fgq $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, fgq $$1) {
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

   public Collection<fgq> f() {
      return this.g.values();
   }

   @Nullable
   public fgq e(String $$0) {
      return (fgq)this.h.get($$0);
   }

   public void a(fgn $$0) {
   }

   public void b(fgn $$0) {
   }

   public void c(fgn $$0) {
   }

   protected void a(fgu $$0, fgn $$1, fgs $$2) {
   }

   protected void a(fgu $$0, fgn $$1) {
   }

   public void a(fgu $$0) {
   }

   public void b(fgu $$0, fgn $$1) {
   }

   public void a(fgq $$0) {
   }

   public void b(fgq $$0) {
   }

   public void c(fgq $$0) {
   }

   public void a(bwt $$0) {
      if (!($$0 instanceof crx) && !$$0.bJ()) {
         this.b($$0);
         this.d($$0.cI());
      }
   }

   protected List<fgv.a> g() {
      return this.e.entrySet().stream().flatMap($$0 -> {
         String $$1 = $$0.getKey();
         return $$0.getValue().c().entrySet().stream().map($$1x -> new fgv.a($$1, ((fgn)$$1x.getKey()).c(), (fgs)$$1x.getValue()));
      }).toList();
   }

   protected void a(fgv.a $$0) {
      fgn $$1 = this.a($$0.c);
      if ($$1 == null) {
         a.error("Unknown objective {} for name {}, ignoring", $$0.c, $$0.b);
      } else {
         this.f($$0.b).a($$1, $$0.d);
      }
   }

   protected void a(fgq.a $$0) {
      fgq $$1 = this.c($$0.a());
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

   protected void a(fgn.a $$0) {
      this.a($$0.a(), $$0.b(), $$0.c(), $$0.d(), $$0.e(), $$0.f().orElse(null));
   }

   public static record a(String b, String c, fgs d) {
      public static final Codec<fgv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("Name").forGetter(fgv.a::a), Codec.STRING.fieldOf("Objective").forGetter(fgv.a::b), fgs.a.forGetter(fgv.a::c))
               .apply($$0, fgv.a::new)
      );

      public String a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public fgs c() {
         return this.d;
      }
   }
}
