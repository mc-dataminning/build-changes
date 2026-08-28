import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bru extends esb {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<alc, brt> f = new Object2ObjectOpenHashMap();

   public static esb.a<bru> a(long $$0) {
      return new esb.a<>(() -> new bru($$0), ($$1, $$2) -> a($$0, $$1), bam.m);
   }

   public bru(long $$0) {
      this.b = $$0;
   }

   public azl a(alc $$0) {
      azl $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bru.a($$1);
   }

   private brt c(alc $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private brt b(alc $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new brt($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<alc, brt> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public uf a(uf $$0, jp.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      uf $$2 = new uf();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (vc)brt.a.encodeStart(ut.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(uf $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bru a(long $$0, uf $$1) {
      bru $$2 = new bru($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      uf $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            brt $$6 = (brt)((Pair)brt.a.decode(ut.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(alc.a($$5), $$6);
         } catch (Exception var9) {
            a.error("Failed to load random sequence {}", $$5, var9);
         }
      }

      return $$2;
   }

   public int a() {
      int $$0 = this.f.size();
      this.f.clear();
      return $$0;
   }

   public void b(alc $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(alc $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements azl {
      private final azl c;

      a(final azl $$0) {
         this.c = $$0;
      }

      @Override
      public azl d() {
         bru.this.c();
         return this.c.d();
      }

      @Override
      public eax e() {
         bru.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bru.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bru.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bru.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bru.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bru.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bru.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bru.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bru.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bru.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
