import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class boh extends elz {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<ajt, bog> f = new Object2ObjectOpenHashMap();

   public static elz.a<boh> a(long $$0) {
      return new elz.a<>(() -> new boh($$0), ($$1, $$2) -> a($$0, $$1), ayq.m);
   }

   public boh(long $$0) {
      this.b = $$0;
   }

   public axr a(ajt $$0) {
      axr $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new boh.a($$1);
   }

   private bog c(ajt $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bog b(ajt $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bog($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<ajt, bog> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public tm a(tm $$0, in.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      tm $$2 = new tm();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (uj)bog.a.encodeStart(ua.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(tm $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static boh a(long $$0, tm $$1) {
      boh $$2 = new boh($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      tm $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bog $$6 = (bog)((Pair)bog.a.decode(ua.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new ajt($$5), $$6);
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

   public void b(ajt $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(ajt $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements axr {
      private final axr c;

      a(axr $$0) {
         this.c = $$0;
      }

      @Override
      public axr d() {
         boh.this.c();
         return this.c.d();
      }

      @Override
      public dve e() {
         boh.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         boh.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         boh.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         boh.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         boh.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         boh.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         boh.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         boh.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         boh.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof boh.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
