import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class brb extends epc {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<alf, bra> f = new Object2ObjectOpenHashMap();

   public static epc.a<brb> a(long $$0) {
      return new epc.a<>(() -> new brb($$0), ($$1, $$2) -> a($$0, $$1), bag.m);
   }

   public brb(long $$0) {
      this.b = $$0;
   }

   public azh a(alf $$0) {
      azh $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new brb.a($$1);
   }

   private bra c(alf $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bra b(alf $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bra($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<alf, bra> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public us a(us $$0, jk.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      us $$2 = new us();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (vp)bra.a.encodeStart(vg.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(us $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static brb a(long $$0, us $$1) {
      brb $$2 = new brb($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      us $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bra $$6 = (bra)((Pair)bra.a.decode(vg.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new alf($$5), $$6);
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

   public void b(alf $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(alf $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements azh {
      private final azh c;

      a(final azh $$0) {
         this.c = $$0;
      }

      @Override
      public azh d() {
         brb.this.c();
         return this.c.d();
      }

      @Override
      public dyh e() {
         brb.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         brb.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         brb.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         brb.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         brb.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         brb.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         brb.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         brb.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         brb.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof brb.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
