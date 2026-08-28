import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bqx extends eqf {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<akq, bqw> f = new Object2ObjectOpenHashMap();

   public static eqf.a<bqx> a(long $$0) {
      return new eqf.a<>(() -> new bqx($$0), ($$1, $$2) -> a($$0, $$1), azv.m);
   }

   public bqx(long $$0) {
      this.b = $$0;
   }

   public ayv a(akq $$0) {
      ayv $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bqx.a($$1);
   }

   private bqw c(akq $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bqw b(akq $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bqw($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<akq, bqw> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public ua a(ua $$0, jo.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      ua $$2 = new ua();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (ux)bqw.a.encodeStart(uo.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(ua $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bqx a(long $$0, ua $$1) {
      bqx $$2 = new bqx($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      ua $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bqw $$6 = (bqw)((Pair)bqw.a.decode(uo.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(akq.a($$5), $$6);
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

   public void b(akq $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(akq $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements ayv {
      private final ayv c;

      a(final ayv $$0) {
         this.c = $$0;
      }

      @Override
      public ayv d() {
         bqx.this.c();
         return this.c.d();
      }

      @Override
      public dzi e() {
         bqx.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bqx.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bqx.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bqx.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bqx.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bqx.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bqx.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bqx.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bqx.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bqx.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
