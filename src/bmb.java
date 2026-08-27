import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bmb extends ehu {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<aiy, bma> f = new Object2ObjectOpenHashMap();

   public static ehu.a<bmb> a(long $$0) {
      return new ehu.a<>(() -> new bmb($$0), $$1 -> a($$0, $$1), axo.m);
   }

   public bmb(long $$0) {
      this.b = $$0;
   }

   public awo a(aiy $$0) {
      awo $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bmb.a($$1);
   }

   private bma c(aiy $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bma b(aiy $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bma($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<aiy, bma> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public sw a(sw $$0) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      sw $$1 = new sw();
      this.f.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), (tt)bma.a.encodeStart(tk.a, $$2).result().orElseThrow()));
      $$0.a("sequences", $$1);
      return $$0;
   }

   private static boolean a(sw $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bmb a(long $$0, sw $$1) {
      bmb $$2 = new bmb($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      sw $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bma $$6 = (bma)((Pair)bma.a.decode(tk.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new aiy($$5), $$6);
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

   public void b(aiy $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(aiy $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements awo {
      private final awo c;

      a(awo $$0) {
         this.c = $$0;
      }

      @Override
      public awo d() {
         bmb.this.c();
         return this.c.d();
      }

      @Override
      public drb e() {
         bmb.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bmb.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bmb.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bmb.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bmb.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bmb.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bmb.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bmb.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bmb.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bmb.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
