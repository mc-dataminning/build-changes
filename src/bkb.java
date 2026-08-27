import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bkb extends efp {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<ahd, bka> f = new Object2ObjectOpenHashMap();

   public static efp.a<bkb> a(long $$0) {
      return new efp.a<>(() -> new bkb($$0), $$1 -> a($$0, $$1), avq.m);
   }

   public bkb(long $$0) {
      this.b = $$0;
   }

   public aup a(ahd $$0) {
      aup $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bkb.a($$1);
   }

   private bka c(ahd $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bka b(ahd $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bka($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<ahd, bka> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public sl a(sl $$0) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      sl $$1 = new sl();
      this.f.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), (ti)bka.a.encodeStart(sz.a, $$2).result().orElseThrow()));
      $$0.a("sequences", $$1);
      return $$0;
   }

   private static boolean a(sl $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bkb a(long $$0, sl $$1) {
      bkb $$2 = new bkb($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      sl $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bka $$6 = (bka)((Pair)bka.a.decode(sz.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new ahd($$5), $$6);
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

   public void b(ahd $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(ahd $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements aup {
      private final aup c;

      a(aup $$0) {
         this.c = $$0;
      }

      @Override
      public aup d() {
         bkb.this.c();
         return this.c.d();
      }

      @Override
      public dow e() {
         bkb.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bkb.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bkb.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bkb.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bkb.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bkb.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bkb.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bkb.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bkb.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bkb.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
