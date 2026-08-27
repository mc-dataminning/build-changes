import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bjh extends eec {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<agm, bjg> f = new Object2ObjectOpenHashMap();

   public static eec.a<bjh> a(long $$0) {
      return new eec.a<>(() -> new bjh($$0), $$1 -> a($$0, $$1), auw.m);
   }

   public bjh(long $$0) {
      this.b = $$0;
   }

   public atw a(agm $$0) {
      atw $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bjh.a($$1);
   }

   private bjg c(agm $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bjg b(agm $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bjg($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<agm, bjg> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public sd a(sd $$0) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      sd $$1 = new sd();
      this.f.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), (ta)bjg.a.encodeStart(sr.a, $$2).result().orElseThrow()));
      $$0.a("sequences", $$1);
      return $$0;
   }

   private static boolean a(sd $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bjh a(long $$0, sd $$1) {
      bjh $$2 = new bjh($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      sd $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bjg $$6 = (bjg)((Pair)bjg.a.decode(sr.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new agm($$5), $$6);
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

   public void b(agm $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(agm $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements atw {
      private final atw c;

      a(atw $$0) {
         this.c = $$0;
      }

      @Override
      public atw d() {
         bjh.this.c();
         return this.c.d();
      }

      @Override
      public dnj e() {
         bjh.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bjh.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bjh.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bjh.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bjh.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bjh.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bjh.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bjh.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bjh.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bjh.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
