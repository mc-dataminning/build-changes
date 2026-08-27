import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bjr extends efe {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<agt, bjq> f = new Object2ObjectOpenHashMap();

   public static efe.a<bjr> a(long $$0) {
      return new efe.a<>(() -> new bjr($$0), $$1 -> a($$0, $$1), avg.m);
   }

   public bjr(long $$0) {
      this.b = $$0;
   }

   public auf a(agt $$0) {
      auf $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bjr.a($$1);
   }

   private bjq c(agt $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bjq b(agt $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bjq($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<agt, bjq> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public sj a(sj $$0) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      sj $$1 = new sj();
      this.f.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), (tg)bjq.a.encodeStart(sx.a, $$2).result().orElseThrow()));
      $$0.a("sequences", $$1);
      return $$0;
   }

   private static boolean a(sj $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bjr a(long $$0, sj $$1) {
      bjr $$2 = new bjr($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      sj $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bjq $$6 = (bjq)((Pair)bjq.a.decode(sx.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new agt($$5), $$6);
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

   public void b(agt $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(agt $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements auf {
      private final auf c;

      a(auf $$0) {
         this.c = $$0;
      }

      @Override
      public auf d() {
         bjr.this.c();
         return this.c.d();
      }

      @Override
      public dol e() {
         bjr.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bjr.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bjr.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bjr.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bjr.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bjr.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bjr.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bjr.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bjr.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bjr.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
