import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class amt extends arx {
   private static final int h = 100;
   private final alr i;
   private final Set<UUID> j = Sets.newHashSet();
   private int k;
   private int l = 100;

   public amt(alr $$0, xg $$1) {
      super($$1, bus.a.g, bus.b.a);
      this.i = $$0;
      this.a(0.0F);
   }

   public alr a() {
      return this.i;
   }

   @Override
   public void a(asc $$0) {
      super.a($$0);
      this.j.add($$0.cG());
   }

   public void a(UUID $$0) {
      this.j.add($$0);
   }

   @Override
   public void b(asc $$0) {
      super.b($$0);
      this.j.remove($$0.cG());
   }

   @Override
   public void b() {
      super.b();
      this.j.clear();
   }

   public int c() {
      return this.k;
   }

   public int d() {
      return this.l;
   }

   public void a(int $$0) {
      this.k = $$0;
      this.a(azz.a((float)$$0 / (float)this.l, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.l = $$0;
      this.a(azz.a((float)this.k / (float)$$0, 0.0F, 1.0F));
   }

   public final xg e() {
      return xj.a(this.j()).a($$0 -> $$0.a(this.l().a()).a(new xm.e(xg.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<asc> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<asc> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.j) {
         boolean $$4 = false;

         for (asc $$5 : $$0) {
            if ($$5.cG().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (asc $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.j) {
            if ($$6.cG().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (asc $$10 : this.h()) {
            if ($$10.cG().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.j.remove($$9);
      }

      for (asc $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public static amt a(alr $$0, amt.a $$1) {
      amt $$2 = new amt($$0, $$1.b);
      $$2.d($$1.c);
      $$2.a($$1.d);
      $$2.b($$1.e);
      $$2.a($$1.f);
      $$2.a($$1.g);
      $$2.a($$1.h);
      $$2.b($$1.i);
      $$2.c($$1.j);
      $$1.k.forEach($$2::a);
      return $$2;
   }

   public amt.a f() {
      return new amt.a(this.j(), this.g(), this.c(), this.d(), this.l(), this.m(), this.n(), this.o(), this.p(), Set.copyOf(this.j));
   }

   public void c(asc $$0) {
      if (this.j.contains($$0.cG())) {
         this.a($$0);
      }
   }

   public void d(asc $$0) {
      super.b($$0);
   }

   public static record a(xg b, boolean c, int d, int e, bus.a f, bus.b g, boolean h, boolean i, boolean j, Set<UUID> k) {
      public static final Codec<amt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  xi.a.fieldOf("Name").forGetter(amt.a::a),
                  Codec.BOOL.optionalFieldOf("Visible", false).forGetter(amt.a::b),
                  Codec.INT.optionalFieldOf("Value", 0).forGetter(amt.a::c),
                  Codec.INT.optionalFieldOf("Max", 100).forGetter(amt.a::d),
                  bus.a.h.optionalFieldOf("Color", bus.a.g).forGetter(amt.a::e),
                  bus.b.f.optionalFieldOf("Overlay", bus.b.a).forGetter(amt.a::f),
                  Codec.BOOL.optionalFieldOf("DarkenScreen", false).forGetter(amt.a::g),
                  Codec.BOOL.optionalFieldOf("PlayBossMusic", false).forGetter(amt.a::h),
                  Codec.BOOL.optionalFieldOf("CreateWorldFog", false).forGetter(amt.a::i),
                  ka.b.optionalFieldOf("Players", Set.of()).forGetter(amt.a::j)
               )
               .apply($$0, amt.a::new)
      );

      public xg a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public bus.a e() {
         return this.f;
      }

      public bus.b f() {
         return this.g;
      }

      public boolean g() {
         return this.h;
      }

      public boolean h() {
         return this.i;
      }

      public boolean i() {
         return this.j;
      }

      public Set<UUID> j() {
         return this.k;
      }
   }
}
