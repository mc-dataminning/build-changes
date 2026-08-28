import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.slf4j.Logger;

public class btf extends evc {
   private static final Logger a = LogUtils.getLogger();
   private final long b;
   private int c;
   private boolean d = true;
   private boolean e = true;
   private final Map<alp, bte> f = new Object2ObjectOpenHashMap();

   public static evc.a<btf> a(long $$0) {
      return new evc.a<>(() -> new btf($$0), ($$1, $$2) -> a($$0, $$1), bbi.m);
   }

   public btf(long $$0) {
      this.b = $$0;
   }

   public bac a(alp $$0) {
      bac $$1 = this.f.computeIfAbsent($$0, this::c).a();
      return new btf.a($$1);
   }

   private bte c(alp $$0) {
      return this.b($$0, this.c, this.d, this.e);
   }

   private bte b(alp $$0, int $$1, boolean $$2, boolean $$3) {
      long $$4 = ($$2 ? this.b : 0L) ^ (long)$$1;
      return new bte($$4, $$3 ? Optional.of($$0) : Optional.empty());
   }

   public void a(BiConsumer<alp, bte> $$0) {
      this.f.forEach($$0);
   }

   public void a(int $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public um a(um $$0, js.a $$1) {
      $$0.a("salt", this.c);
      $$0.a("include_world_seed", this.d);
      $$0.a("include_sequence_id", this.e);
      um $$2 = new um();
      this.f.forEach(($$1x, $$2x) -> $$2.a($$1x.toString(), (vj)bte.a.encodeStart(va.a, $$2x).result().orElseThrow()));
      $$0.a("sequences", $$2);
      return $$0;
   }

   private static boolean a(um $$0, String $$1, boolean $$2) {
      return $$0.b($$1, 1) ? $$0.q($$1) : $$2;
   }

   public static btf a(long $$0, um $$1) {
      btf $$2 = new btf($$0);
      $$2.a($$1.h("salt"), a($$1, "include_world_seed", true), a($$1, "include_sequence_id", true));
      um $$3 = $$1.p("sequences");

      for (String $$5 : $$3.e()) {
         try {
            bte $$6 = (bte)((Pair)bte.a.decode(va.a, $$3.c($$5)).result().get()).getFirst();
            $$2.f.put(alp.a($$5), $$6);
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

   public void b(alp $$0) {
      this.f.put($$0, this.c($$0));
   }

   public void a(alp $$0, int $$1, boolean $$2, boolean $$3) {
      this.f.put($$0, this.b($$0, $$1, $$2, $$3));
   }

   class a implements bac {
      private final bac c;

      a(final bac $$0) {
         this.c = $$0;
      }

      @Override
      public bac d() {
         btf.this.c();
         return this.c.d();
      }

      @Override
      public edw e() {
         btf.this.c();
         return this.c.e();
      }

      @Override
      public void b(long $$0) {
         btf.this.c();
         this.c.b($$0);
      }

      @Override
      public int f() {
         btf.this.c();
         return this.c.f();
      }

      @Override
      public int a(int $$0) {
         btf.this.c();
         return this.c.a($$0);
      }

      @Override
      public long g() {
         btf.this.c();
         return this.c.g();
      }

      @Override
      public boolean h() {
         btf.this.c();
         return this.c.h();
      }

      @Override
      public float i() {
         btf.this.c();
         return this.c.i();
      }

      @Override
      public double j() {
         btf.this.c();
         return this.c.j();
      }

      @Override
      public double k() {
         btf.this.c();
         return this.c.k();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof btf.a $$1 ? this.c.equals($$1.c) : false;
         }
      }
   }
}
