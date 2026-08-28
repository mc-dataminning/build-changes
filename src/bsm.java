import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bsm extends eta {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<all, bsl> f = new Object2ObjectOpenHashMap();

   public static eta.a<bsm> a(long $$0) {
      return new eta.a<>(() -> new bsm($$0), ($$1, $$2) -> a($$0, $$1), bax.m);
   }

   public bsm(long $$0) {
      this.b = $$0;
   }

   public azv a(all $$0) {
      azv $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bsm.a($$1);
   }

   private bsl c(all $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bsl b(all $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bsl($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<all, bsl> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public un a(un $$0, js.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      un $$2 = new un();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (vk)bsl.a.encodeStart(vb.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(un $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bsm a(long $$0, un $$1) {
      bsm $$2 = new bsm($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      un $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bsl $$6 = (bsl)((Pair)bsl.a.decode(vb.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(all.a($$5), $$6);
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

   public void b(all $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(all $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements azv {
      private final azv c;

      a(final azv $$0) {
         this.c = $$0;
      }

      @Override
      public azv d() {
         bsm.this.c();
         return this.c.d();
      }

      @Override
      public ebw e() {
         bsm.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bsm.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bsm.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bsm.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bsm.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bsm.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bsm.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bsm.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bsm.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bsm.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
