import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class ami extends arm {
   private static final int h = 100;
   private final alg i;
   private final Set<UUID> j = Sets.newHashSet();
   private int k;
   private int l = 100;

   public ami(alg $$0, wy $$1) {
      super($$1, btw.a.g, btw.b.a);
      this.i = $$0;
      this.a(0.0F);
   }

   public alg a() {
      return this.i;
   }

   @Override
   public void a(arr $$0) {
      super.a($$0);
      this.j.add($$0.cF());
   }

   public void a(UUID $$0) {
      this.j.add($$0);
   }

   @Override
   public void b(arr $$0) {
      super.b($$0);
      this.j.remove($$0.cF());
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
      this.a(azm.a((float)$$0 / (float)this.l, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.l = $$0;
      this.a(azm.a((float)this.k / (float)$$0, 0.0F, 1.0F));
   }

   public final wy e() {
      return xb.a(this.j()).a($$0 -> $$0.a(this.l().a()).a(new xe.e(wy.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<arr> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<arr> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.j) {
         boolean $$4 = false;

         for (arr $$5 : $$0) {
            if ($$5.cF().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (arr $$6 : $$0) {
         boolean $$7 = false;

         for (UUID $$8 : this.j) {
            if ($$6.cF().equals($$8)) {
               $$7 = true;
               break;
            }
         }

         if (!$$7) {
            $$2.add($$6);
         }
      }

      for (UUID $$9 : $$1) {
         for (arr $$10 : this.h()) {
            if ($$10.cF().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.j.remove($$9);
      }

      for (arr $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public static ami a(alg $$0, ami.a $$1) {
      ami $$2 = new ami($$0, $$1.b);
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

   public ami.a f() {
      return new ami.a(this.j(), this.g(), this.c(), this.d(), this.l(), this.m(), this.n(), this.o(), this.p(), Set.copyOf(this.j));
   }

   public void c(arr $$0) {
      if (this.j.contains($$0.cF())) {
         this.a($$0);
      }
   }

   public void d(arr $$0) {
      super.b($$0);
   }

   public static record a(wy b, boolean c, int d, int e, btw.a f, btw.b g, boolean h, boolean i, boolean j, Set<UUID> k) {
      public static final Codec<ami.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  xa.a.fieldOf("Name").forGetter(ami.a::a),
                  Codec.BOOL.optionalFieldOf("Visible", false).forGetter(ami.a::b),
                  Codec.INT.optionalFieldOf("Value", 0).forGetter(ami.a::c),
                  Codec.INT.optionalFieldOf("Max", 100).forGetter(ami.a::d),
                  btw.a.h.optionalFieldOf("Color", btw.a.g).forGetter(ami.a::e),
                  btw.b.f.optionalFieldOf("Overlay", btw.b.a).forGetter(ami.a::f),
                  Codec.BOOL.optionalFieldOf("DarkenScreen", false).forGetter(ami.a::g),
                  Codec.BOOL.optionalFieldOf("PlayBossMusic", false).forGetter(ami.a::h),
                  Codec.BOOL.optionalFieldOf("CreateWorldFog", false).forGetter(ami.a::i),
                  jz.b.optionalFieldOf("Players", Set.of()).forGetter(ami.a::j)
               )
               .apply($$0, ami.a::new)
      );

      public wy a() {
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

      public btw.a e() {
         return this.f;
      }

      public btw.b f() {
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
