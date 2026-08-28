import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bsp extends eth {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<alj, bso> f = new Object2ObjectOpenHashMap();

   public static eth.a<bsp> a(long $$0) {
      return new eth.a<>(() -> new bsp($$0), ($$1, $$2) -> a($$0, $$1), baw.m);
   }

   public bsp(long $$0) {
      this.b = $$0;
   }

   public azu a(alj $$0) {
      azu $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bsp.a($$1);
   }

   private bso c(alj $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bso b(alj $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bso($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<alj, bso> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public ul a(ul $$0, js.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      ul $$2 = new ul();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (vi)bso.a.encodeStart(uz.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(ul $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bsp a(long $$0, ul $$1) {
      bsp $$2 = new bsp($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      ul $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bso $$6 = (bso)((Pair)bso.a.decode(uz.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(alj.a($$5), $$6);
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

   public void b(alj $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(alj $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements azu {
      private final azu c;

      a(final azu $$0) {
         this.c = $$0;
      }

      @Override
      public azu d() {
         bsp.this.c();
         return this.c.d();
      }

      @Override
      public ecd e() {
         bsp.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bsp.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bsp.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bsp.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bsp.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bsp.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bsp.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bsp.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bsp.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bsp.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
