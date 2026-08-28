import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bsd extends esq {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<alh, bsc> f = new Object2ObjectOpenHashMap();

   public static esq.a<bsd> a(long $$0) {
      return new esq.a<>(() -> new bsd($$0), ($$1, $$2) -> a($$0, $$1), bas.m);
   }

   public bsd(long $$0) {
      this.b = $$0;
   }

   public azr a(alh $$0) {
      azr $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bsd.a($$1);
   }

   private bsc c(alh $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bsc b(alh $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bsc($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<alh, bsc> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public uj a(uj $$0, jr.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      uj $$2 = new uj();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (vg)bsc.a.encodeStart(ux.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(uj $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bsd a(long $$0, uj $$1) {
      bsd $$2 = new bsd($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      uj $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bsc $$6 = (bsc)((Pair)bsc.a.decode(ux.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(alh.a($$5), $$6);
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

   public void b(alh $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(alh $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements azr {
      private final azr c;

      a(final azr $$0) {
         this.c = $$0;
      }

      @Override
      public azr d() {
         bsd.this.c();
         return this.c.d();
      }

      @Override
      public ebm e() {
         bsd.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bsd.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bsd.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bsd.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bsd.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bsd.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bsd.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bsd.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bsd.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bsd.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
