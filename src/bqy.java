import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bqy extends eqj {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<akr, bqx> f = new Object2ObjectOpenHashMap();

   public static eqj.a<bqy> a(long $$0) {
      return new eqj.a<>(() -> new bqy($$0), ($$1, $$2) -> a($$0, $$1), azw.m);
   }

   public bqy(long $$0) {
      this.b = $$0;
   }

   public ayw a(akr $$0) {
      ayw $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bqy.a($$1);
   }

   private bqx c(akr $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bqx b(akr $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bqx($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<akr, bqx> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public ub a(ub $$0, jo.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      ub $$2 = new ub();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (uy)bqx.a.encodeStart(up.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(ub $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bqy a(long $$0, ub $$1) {
      bqy $$2 = new bqy($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      ub $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bqx $$6 = (bqx)((Pair)bqx.a.decode(up.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(akr.a($$5), $$6);
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

   public void b(akr $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(akr $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements ayw {
      private final ayw c;

      a(final ayw $$0) {
         this.c = $$0;
      }

      @Override
      public ayw d() {
         bqy.this.c();
         return this.c.d();
      }

      @Override
      public dzl e() {
         bqy.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bqy.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bqy.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bqy.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bqy.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bqy.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bqy.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bqy.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bqy.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bqy.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
