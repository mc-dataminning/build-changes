import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;

public class amk extends aro {
   private static final int h = 100;
   private final ali i;
   private final Set<UUID> j = Sets.newHashSet();
   private int k;
   private int l = 100;

   public amk(ali $$0, xa $$1) {
      super($$1, buh.a.g, buh.b.a);
      this.i = $$0;
      this.a(0.0F);
   }

   public ali a() {
      return this.i;
   }

   @Override
   public void a(art $$0) {
      super.a($$0);
      this.j.add($$0.cG());
   }

   public void a(UUID $$0) {
      this.j.add($$0);
   }

   @Override
   public void b(art $$0) {
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
      this.a(azo.a((float)$$0 / (float)this.l, 0.0F, 1.0F));
   }

   public void b(int $$0) {
      this.l = $$0;
      this.a(azo.a((float)this.k / (float)$$0, 0.0F, 1.0F));
   }

   public final xa e() {
      return xd.a(this.j()).a($$0 -> $$0.a(this.l().a()).a(new xg.e(xa.b(this.a().toString()))).a(this.a().toString()));
   }

   public boolean a(Collection<art> $$0) {
      Set<UUID> $$1 = Sets.newHashSet();
      Set<art> $$2 = Sets.newHashSet();

      for (UUID $$3 : this.j) {
         boolean $$4 = false;

         for (art $$5 : $$0) {
            if ($$5.cG().equals($$3)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            $$1.add($$3);
         }
      }

      for (art $$6 : $$0) {
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
         for (art $$10 : this.h()) {
            if ($$10.cG().equals($$9)) {
               this.b($$10);
               break;
            }
         }

         this.j.remove($$9);
      }

      for (art $$11 : $$2) {
         this.a($$11);
      }

      return !$$1.isEmpty() || !$$2.isEmpty();
   }

   public static amk a(ali $$0, amk.a $$1) {
      amk $$2 = new amk($$0, $$1.b);
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

   public amk.a f() {
      return new amk.a(this.j(), this.g(), this.c(), this.d(), this.l(), this.m(), this.n(), this.o(), this.p(), Set.copyOf(this.j));
   }

   public void c(art $$0) {
      if (this.j.contains($$0.cG())) {
         this.a($$0);
      }
   }

   public void d(art $$0) {
      super.b($$0);
   }

   public static record a(xa b, boolean c, int d, int e, buh.a f, buh.b g, boolean h, boolean i, boolean j, Set<UUID> k) {
      public static final Codec<amk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  xc.a.fieldOf("Name").forGetter(amk.a::a),
                  Codec.BOOL.optionalFieldOf("Visible", false).forGetter(amk.a::b),
                  Codec.INT.optionalFieldOf("Value", 0).forGetter(amk.a::c),
                  Codec.INT.optionalFieldOf("Max", 100).forGetter(amk.a::d),
                  buh.a.h.optionalFieldOf("Color", buh.a.g).forGetter(amk.a::e),
                  buh.b.f.optionalFieldOf("Overlay", buh.b.a).forGetter(amk.a::f),
                  Codec.BOOL.optionalFieldOf("DarkenScreen", false).forGetter(amk.a::g),
                  Codec.BOOL.optionalFieldOf("PlayBossMusic", false).forGetter(amk.a::h),
                  Codec.BOOL.optionalFieldOf("CreateWorldFog", false).forGetter(amk.a::i),
                  jz.b.optionalFieldOf("Players", Set.of()).forGetter(amk.a::j)
               )
               .apply($$0, amk.a::new)
      );

      public xa a() {
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

      public buh.a e() {
         return this.f;
      }

      public buh.b f() {
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
