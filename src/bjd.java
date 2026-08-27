import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bjd extends edx {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<agi, bjc> f = new Object2ObjectOpenHashMap();

   public static edx.a<bjd> a(long $$0) {
      return new edx.a<>(() -> new bjd($$0), $$1 -> a($$0, $$1), aus.m);
   }

   public bjd(long $$0) {
      this.b = $$0;
   }

   public ats a(agi $$0) {
      ats $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bjd.a($$1);
   }

   private bjc c(agi $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bjc b(agi $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bjc($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<agi, bjc> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public rz a(rz $$0) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      rz $$1 = new rz();
      this.f.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), (sw)bjc.a.encodeStart(sn.a, $$2).result().orElseThrow()));
      $$0.a("sequences", $$1);
      return $$0;
   }

   private static boolean a(rz $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bjd a(long $$0, rz $$1) {
      bjd $$2 = new bjd($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      rz $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bjc $$6 = (bjc)((Pair)bjc.a.decode(sn.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new agi($$5), $$6);
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

   public void b(agi $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(agi $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements ats {
      private final ats c;

      a(ats $$0) {
         this.c = $$0;
      }

      @Override
      public ats d() {
         bjd.this.c();
         return this.c.d();
      }

      @Override
      public dne e() {
         bjd.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bjd.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bjd.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bjd.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bjd.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bjd.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bjd.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bjd.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bjd.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bjd.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
