import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class bih extends ecj {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<afw, big> f = new Object2ObjectOpenHashMap();

   public static ecj.a<bih> a(long $$0) {
      return new ecj.a<>(() -> new bih($$0), $$1 -> a($$0, $$1), aud.m);
   }

   public bih(long $$0) {
      this.b = $$0;
   }

   public ate a(afw $$0) {
      ate $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new bih.a($$1);
   }

   private big c(afw $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private big b(afw $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new big($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<afw, big> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public rt a(rt $$0) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      rt $$1 = new rt();
      this.f.forEach(($$1x, $$2) -> $$1.a($$1x.toString(), (sn)big.a.encodeStart(sf.a, $$2).result().orElseThrow()));
      $$0.a("sequences", $$1);
      return $$0;
   }

   private static boolean a(rt $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static bih a(long $$0, rt $$1) {
      bih $$2 = new bih($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      rt $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            big $$6 = (big)((Pair)big.a.decode(sf.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(new afw($$5), $$6);
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

   public void b(afw $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(afw $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements ate {
      private final ate c;

      a(ate $$0) {
         this.c = $$0;
      }

      @Override
      public ate d() {
         bih.this.c();
         return this.c.d();
      }

      @Override
      public dlx e() {
         bih.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         bih.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         bih.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         bih.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         bih.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         bih.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         bih.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         bih.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         bih.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof bih.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
